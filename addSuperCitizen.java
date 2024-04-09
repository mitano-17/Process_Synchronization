import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */
public class addSuperCitizen {
        static void addMember(ArrayList<Integer> superCitQueue){
                // When adding super citizens to the group, decrement shared variable count
                sharedVar.count--;
                // add super citizen to group
                System.out.println("Super Citizen " + superCitQueue.get(0) + " is signing up");
                // output
                System.out.println("Super Citizen " + superCitQueue.get(0) +
                        " has joined team " + sharedVar.currentGroupNo);
                superCitQueue.remove(0);
                // increment number of members
                sharedVar.superCitizensGroupCount++;
                sharedVar.memberCount++;
        }
}
