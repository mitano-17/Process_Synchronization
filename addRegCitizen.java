import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */

public class addRegCitizen {
    static void addMember(ArrayList<Integer> regCitQueue){
        // When adding regular citizens to the group, increment shared variable count
        sharedVar.count++;
        // add super citizen to group
        System.out.println("Regular Citizen " + regCitQueue.get(0) + " is signing up");
        // output
        System.out.println("Regular Citizen " + regCitQueue.get(0) + " has joined team " + sharedVar.currentGroupNo);
        regCitQueue.remove(0);
        // increment number of members
        sharedVar.regCitizensGroupCount++;
        sharedVar.memberCount++;
    }
}