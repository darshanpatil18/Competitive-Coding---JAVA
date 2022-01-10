public class ReverseArray 
{
    public static void main(String[] args) 
    {
        String[] names = { "Hallo", "Ich","bin","Darshan" };
        System.out.println("Original String Array: ");
        printArray(names);
        System.out.println("\nReversed String Array:");
        printArrayRev(names);

        Integer[] arr = {1,2,3,4,5};
        System.out.println("\nOriginal Integer Array: ");
        printArray(arr);
        System.out.println("\nReversed Integer Array:");
        printArrayRev(arr);

        Character[] ch = {'a','b','c','d','e'};
        System.out.println("\nOriginal Character Array: ");
        printArray(ch);
        System.out.println("\nReversed Character Array:");
        printArrayRev(ch);

        Double[] d={2.0,4.2,8.5,9.4};
        System.out.println("\nOriginal Double Array: ");
        printArray(d);
        System.out.println("\nReversed Double Array:");
        printArrayRev(d);
    }

    public static <T> void printArray(T[] array) 
    {
        for (int i=0;i<array.length;i++)
            System.out.print(array[i] + " ");
    }
    public static <T> void printArrayRev(T[] array) 
    {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}