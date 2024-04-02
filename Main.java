import java.util.*;
import java.io.*;

public class Main {

    /* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */
    public static void createGroup(int regCitizens, int superCitizens){
        //System.out.println(regCitizens + " " + superCitizens);

        /* Create regular citizens and super citizens list */
        /* These lists are for containing the IDs of each citizens */
        /* To be used for outputting phrases */
        ArrayList<Integer> regCitQueue = new ArrayList();
        ArrayList<Integer> superCitQueue = new ArrayList();

        /* Populate lists with integers */
        for(int i = 0; i < regCitizens; i++){
            regCitQueue.add(i);
        }
        for(int i = 0; i < superCitizens; i++){
            superCitQueue.add(i);
        }

        System.out.print(regCitQueue);
        System.out.println();
        System.out.print(superCitQueue);
    }

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

            createGroup(regCitizens, superCitizens);
        }
        catch(Exception e) {
            System.out.println("Invalid data type");
        }

    }
}

