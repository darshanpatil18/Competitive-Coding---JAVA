import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ResultUsingFile {

	public static void main(String[] args)
	{

		try {

			FileReader fp = new FileReader("physics.txt");
			FileReader fc = new FileReader("chemistry.txt");
			FileReader fm = new FileReader("maths.txt");

			FileWriter fw = new FileWriter("Result.txt");

			int p = 0;
			int c = 0;
			int m = 0;
			double totalmarks = 0.0;
			int i;

			while ((i = fp.read()) != -1) {
				p = i;
			}
			while ((i = fc.read()) != -1) {
				c = i;
			}		
			while ((i = fm.read()) != -1) {
				m = i;
			}
			String mar=String.valueOf((p+c+m)/3);
	
			fw.write(mar);
			fp.close();
			fc.close();
			fm.close();
			fw.close();

			System.out.println(
				"File reading and writing both done");
		}

		catch (IOException e) {

			System.out.println(
				"There are some IOException");
		}
	}
}
