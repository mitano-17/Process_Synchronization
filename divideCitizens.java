import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */

public class divideCitizens {
     static boolean check(int s, int r)
     {
        boolean check=true;

        if(s+r>=4 && s!=0 && r!=0)
            check=false;

        if(s+r>=4 && r<2)
            check=true;
        if(r<3 && s<1)
            check=true;
        if(r<2 && s<2) 
            check=true;
        return check;
     }

     static void divideCitizens(ArrayList<Integer> regCitQueue, ArrayList<Integer> superCitQueue){
        int s=0;
        int team;

         // loop until almost all citizens have groups
         while(sharedVar.superCitizens > 0 || sharedVar.regCitizens > 0) {
          
            if(sharedVar.memberCount==0)
                if(check(sharedVar.superCitizens,sharedVar.regCitizens))
                    break;
                
             System.out.println("sharedVar.superCitizens: " + sharedVar.superCitizens);
             System.out.println("sharedVar.regCitizens: " + sharedVar.regCitizens);
             System.out.println("sharedVar.memberCount: " + sharedVar.memberCount);
             System.out.println("sharedVar.count: " + sharedVar.count);

             /* Commission super Citizen */
             if (sharedVar.count >= 0 && sharedVar.maxSuper > 0 && sharedVar.superCitizens>0) {
                //System.out.println("Error in super citizen");
                 addSuperCitizen.addMember(superCitQueue);
                 sharedVar.superCitizens--;
                 s++;
             }
             /* Commission regular Citizen */
             else if(sharedVar.regCitizens>0 && sharedVar.memberCount > 0)
             {
                //System.out.println("Error in reg citizen");
                 addRegCitizen.addMember(regCitQueue);
                 // reset value
                 sharedVar.maxSuper = 2;
                 sharedVar.regCitizens--;
             }

             else
                break;
             // group has been formed
             if(sharedVar.memberCount == 4){
                 System.out.println("Team " + sharedVar.currentGroupNo + " is ready " +
                         "and now launching to battle (sc: " + sharedVar.superCitizensGroupCount +
                         "| rc: " + sharedVar.regCitizensGroupCount + ")");
                 // increment group number
                 sharedVar.currentGroupNo++;
                 sharedVar.groupCount++;
                 // reset values
                 sharedVar.superCitizensGroupCount = 0;
                 sharedVar.regCitizensGroupCount = 0;
                 sharedVar.memberCount = 0;
                 s=0;
             }
         }
         // output results
         System.out.println("Total number of teams sent: " + sharedVar.groupCount);
         System.out.println("Number of citizens sent home: " + (sharedVar.regCitizens + sharedVar.superCitizens));
    }
}
