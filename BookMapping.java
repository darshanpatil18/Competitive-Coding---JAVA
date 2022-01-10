import java.util.*;
public class BookMapping {
    public static void main(String[] args)
    {
        HashMap<String,Integer> h=new HashMap<String,Integer>();
        h.put("B1",100);
        h.put("B2",200);
        h.put("B3",300);
        h.put("B4",400);
        h.put("B5",500);
        h.remove("B3");
        h.replace("B4",800);
        h.forEach((k,v) -> System.out.println("Book-ID : " + k + ", Cost : " + v));
    }
}