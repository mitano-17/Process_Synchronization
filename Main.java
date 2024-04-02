import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        String name,line;
        String[] split;

        Scanner sc = new Scanner(System.in);
        Scanner sc2;

        int regCitizens = 0;
        int superCitizens = 0;


        try{
            System.out.println("Input: ");
            System.out.print("No. of Regular Citizens = ");
            regCitizens = sc.nextInt();
            System.out.print("No. of Super Citizens = ");
            superCitizens = sc.nextInt();
            sc.close();

            System.out.println(regCitizens + " " + superCitizens);
        }
        catch(Exception e) {
            System.out.println("Invalid data type");
        }

    }
}

