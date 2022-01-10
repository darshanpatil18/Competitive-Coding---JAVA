import java.io.*;
import java.util.*;

class CovaxinVaccineCamp implements Serializable {
    String empid;
    String name;
    int age;
    String address;
    String mobno;
    String bloodgrp;
    String allergy;
    String date;

    CovaxinVaccineCamp(String empid, String name, int age, String address, String mobno, String bloodgrp, String allergy, String date) 
    {
        this.empid=empid;
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobno = mobno;
        this.bloodgrp = bloodgrp;
        this.allergy = allergy;
        this.date = date;
    }
}

public class VITVaccine 
{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter number of faculty vaccinated: ");
        n = in.nextInt();
        in.nextLine();
        CovaxinVaccineCamp arr[] = new CovaxinVaccineCamp[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter Employee ID: ");
            String empid = in.nextLine();
            System.out.print("Enter Name: ");
            String name = in.nextLine();
            System.out.print("Enter age: ");
            int age = in.nextInt();
            in.nextLine();
            System.out.print("Enter Address: ");
            String address = in.nextLine();
            System.out.print("Enter MobileNo: ");
            String mobno = in.nextLine();
            System.out.print("Enter Blood Group: ");
            String bloodgrp = in.nextLine();
            System.out.print("Enter Yes/No for allergy: ");
            String allergy = in.nextLine();
            System.out.print("Enter Vaccination Date: ");
            String date = in.nextLine();
            arr[i] = new CovaxinVaccineCamp(empid, name, age, address, mobno, bloodgrp, allergy, date);
        }
        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nSerialization Started");
            FileOutputStream fos = new FileOutputStream("Covaxin.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(arr[i]);
            System.out.println("Serialization Ended");
            System.out.println("\nDeserialization started");
            FileInputStream fis = new FileInputStream("Covaxin.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            CovaxinVaccineCamp arr_out = (CovaxinVaccineCamp) ois.readObject();
            if (arr_out.allergy.equals("Yes")) 
            {
                System.out.println("Deserialization ended\n");
                System.out.println("EmpID: "+arr_out.empid);
                System.out.println("name: " + arr_out.name);
                System.out.println("age: " + arr_out.age);
                System.out.println("address: " + arr_out.address);
                System.out.println("mobno: " + arr_out.mobno);
                System.out.println("blood group: " + arr_out.bloodgrp);
                System.out.println("Date of Covid Check: " + arr_out.allergy);
                System.out.println("Symptoms: " + arr_out.date);
            }
        }

    }
}