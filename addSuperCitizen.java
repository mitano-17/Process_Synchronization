import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */
public class addSuperCitizen {
        static void addMember(ArrayList<Integer> superCitQueue){
                // When adding super citizens to the group, decrement shared variable count
                sharedVar.count--;
                // add super citizen to group
                System.out.println("Super Citizen " + superCitQueue.getFirst() + " is signing up");
                // output
                System.out.println("Super Citizen " + superCitQueue.getFirst() +
                        " has joined team " + sharedVar.currentGroupNo);
                superCitQueue.removeFirst();
                // increment number of members
                sharedVar.superCitizensGroupCount++;
                sharedVar.memberCount++;
        }
}
