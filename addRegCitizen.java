import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */

public class addRegCitizen {
    static void addMember(ArrayList<Integer> regCitQueue){
        // When adding regular citizens to the group, increment shared variable count
        sharedVar.count++;
        // add super citizen to group
        System.out.println("Regular Citizen " + regCitQueue.getFirst() + "is signing up");
        // output
        System.out.println("Regular Citizen" + regCitQueue.getFirst() + "has joined team" + sharedVar.currentGroupNo);
        regCitQueue.removeFirst();
        // increment number of members
        sharedVar.regCitizensGroupCount++;
        sharedVar.memberCount++;
    }
}