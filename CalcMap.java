import java.util.HashMap;
public class CalcMap {

     private static class ParseError extends Exception {
      ParseError(String message) {
         super(message);
      }
     }   
   
   private enum Functions { SIN, COS, TAN, ABS, SQRT, LOG }
     
      private static class StandardFunction {

      Functions functionCode;       
      StandardFunction(Functions code) {
         functionCode = code;
      }

      
      double evaluate(double x) {
         switch(functionCode) {
         case SIN:
            return Math.sin(x);
         case COS:
            return Math.cos(x);
         case TAN:
            return Math.tan(x);
         case ABS:
            return Math.abs(x);
         case SQRT:
            return Math.sqrt(x);
         default:
            return Math.log(x);
         }
      }

   }

   private static HashMap<String,Object> symbolTable;


   public static void main(String[] args) {
      
      symbolTable = new HashMap<String,Object>();
      symbolTable.put("pi", Math.PI);
      symbolTable.put("e", Math.E);     
      symbolTable.put("sin", new StandardFunction(Functions.SIN));
      symbolTable.put("cos", new StandardFunction(Functions.COS));
      symbolTable.put("tan", new StandardFunction(Functions.TAN));
      symbolTable.put("abs", new StandardFunction(Functions.ABS));
      symbolTable.put("sqrt", new StandardFunction(Functions.SQRT));
      symbolTable.put("log", new StandardFunction(Functions.LOG));

      System.out.println("\n\nEnter commands; press return to end.");
      System.out.println("Commands must have the form:\n");
      System.out.println("      print <expression>");
      System.out.println("  or");
      System.out.println("      let <variable> = <expression>");

      while (true) {
         System.out.print("\n?  ");
         TextIO.skipBlanks();
         if ( TextIO.peek() == '\n' ) {
            break;
         }
         try {
            String command = TextIO.getWord();
            if (command.equalsIgnoreCase("print"))
               doPrintCommand();
            else if (command.equalsIgnoreCase("let"))
               doLetCommand();
            else
               throw new ParseError("Command must begin with 'print' or 'let'.");
            TextIO.getln();
         }
         catch (ParseError e) {
            System.out.println("\n*** Error in input:    " + e.getMessage());
            System.out.println("*** Discarding input:  " + TextIO.getln());
         }
      }

      System.out.println("\n\nDone.");

   }

   private static void doLetCommand() throws ParseError{
      TextIO.skipBlanks();
      if ( ! Character.isLetter(TextIO.peek()) )
         throw new ParseError("Expected variable name after 'let'.");
      String varName = readWord();
      TextIO.skipBlanks();
      if(TextIO.peek() != '=' )
         throw new ParseError("Expected '=' operator for 'let' command.");
      TextIO.getChar();
      double val = expressionValue();
      TextIO.skipBlanks();
      if ( TextIO.peek() != '\n' )
         throw new ParseError("Extra data after end of expression.");
      symbolTable.put( varName, val );
      System.out.println("ok");
   }
   private static void doPrintCommand() throws ParseError {
      double val = expressionValue();
      TextIO.skipBlanks();
      if ( TextIO.peek() != '\n' )
         throw new ParseError("Extra data after end of expression.");
      System.out.println("Value is " + val);
   }

   private static double expressionValue() throws ParseError {
      TextIO.skipBlanks();
      boolean negative;
      negative = false;
      if (TextIO.peek() == '-') {
         TextIO.getAnyChar();
         negative = true;
      }
      double val;
      val = termValue();
      if (negative)
         val = -val;
      TextIO.skipBlanks();
      while ( TextIO.peek() == '+' || TextIO.peek() == '-' ) {
         char op = TextIO.getAnyChar();
         double nextVal = termValue();
         if (op == '+')
            val += nextVal;
         else
            val -= nextVal;
         TextIO.skipBlanks();
      }
      return val;
   }

   private static double termValue() throws ParseError {
      TextIO.skipBlanks();
      double val;
      val = factorValue();
      TextIO.skipBlanks();
      while ( TextIO.peek() == '*' || TextIO.peek() == '/' ) {
         char op = TextIO.getAnyChar();
         double nextVal = factorValue();
         if (op == '*')
            val *= nextVal;
         else
            val /= nextVal;
         TextIO.skipBlanks();
      }
      return val;
   }
   private static double factorValue() throws ParseError{
      TextIO.skipBlanks();
      double val;
      val = primaryValue();
      TextIO.skipBlanks();
      while ( TextIO.peek() == '^' ) {
         TextIO.getChar();
         double nextVal = primaryValue();
         val = Math.pow(val,nextVal);
         if (Double.isNaN(val))
            throw new ParseError("Illegal values for ^ operator.");
         TextIO.skipBlanks();
      }
      return val;
   }
   private static double primaryValue() throws ParseError {
      TextIO.skipBlanks();
      char ch = TextIO.peek();
      if ( Character.isDigit(ch) ) {
         return TextIO.getDouble();
      }
      else if ( Character.isLetter(ch) ) {
         String name = readWord();
         Object obj = symbolTable.get(name);
         if (obj == null)
            throw new ParseError("Unknown word \"" + name + "\"");
         assert (obj instanceof Double || obj instanceof StandardFunction);
         if (obj instanceof Double) {
            Double val = (Double)obj;
            return val.doubleValue();
         }
         else {
            StandardFunction func = (StandardFunction)obj;
            TextIO.skipBlanks();
            if ( TextIO.peek() != '(' )
               throw new ParseError("Parenthesis missing after standard function");
            TextIO.getChar(); // discard the '('
            double argument = expressionValue();  // read and evaluate expression
            TextIO.skipBlanks();
            if ( TextIO.peek() != ')' )
               throw new ParseError("Missing right parenthesis.");
            TextIO.getChar(); // discard the ')'
            return func.evaluate(argument);
         }
      }
      else if ( ch == '(' ) {
         TextIO.getAnyChar();
         double val = expressionValue();
         TextIO.skipBlanks();
         if ( TextIO.peek() != ')' )
            throw new ParseError("Missing right parenthesis.");
         TextIO.getAnyChar();
         return val;
      }
      else if ( ch == '\n' )
         throw new ParseError("End-of-line encountered in the middle of an expression.");
      else if ( ch == ')' )
         throw new ParseError("Extra right parenthesis.");
      else if ( ch == '+' || ch == '-' || ch == '*' || ch == '/')
         throw new ParseError("Misplaced operator.");
      else
         throw new ParseError("Unexpected character \"" + ch + "\" encountered.");
   }

   private static String readWord() {
      String word = "";
      char ch = TextIO.peek();
      while (Character.isLetter(ch) || Character.isDigit(ch)) {
         word += TextIO.getChar();
         ch = TextIO.peek();
      }
      return word;
   }

}