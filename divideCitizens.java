import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */

public class divideCitizens {
     static void divideCitizens(ArrayList<Integer> regCitQueue, ArrayList<Integer> superCitQueue){
         // loop until almost all citizens have groups
         while(sharedVar.superCitizens > 0 && sharedVar.regCitizens > 0) {
             System.out.println("sharedVar.superCitizens: " + sharedVar.superCitizens);
             System.out.println("sharedVar.regCitizens: " + sharedVar.regCitizens);
             System.out.println("sharedVar.memberCount: " + sharedVar.memberCount);
             System.out.println("sharedVar.count: " + sharedVar.count);

             /* Commission super Citizen */
             if (sharedVar.count >= 0 && sharedVar.maxSuper > 0) {
                 addSuperCitizen.addMember(superCitQueue);
                 sharedVar.superCitizens--;
             }
             /* Commission regular Citizen */
             else {
                 addRegCitizen.addMember(regCitQueue);
                 // reset value
                 sharedVar.maxSuper = 2;
                 sharedVar.regCitizens--;
             }
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
             }
         }
         // output results
         System.out.println("Total number of teams sent: " + sharedVar.groupCount);
         System.out.println("Number of citizens sent home: " + (sharedVar.regCitizens + sharedVar.superCitizens));
    }
}
