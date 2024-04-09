import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
        String name,line;
        String[] split;

        Scanner sc = new Scanner(System.in);
        Scanner sc2;

        try{
            System.out.println("Input: ");
            System.out.print("No. of Regular Citizens = ");
            sharedVar.regCitizens = sc.nextInt();
            System.out.print("No. of Super Citizens = ");
            sharedVar.superCitizens = sc.nextInt();
            sc.close();

            createGroup.createGroup();
        }
        catch(Exception e) {
            System.out.println("An error occurred");
            System.out.println(e);
        }

    }
}

