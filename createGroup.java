import java.util.ArrayList;

/* NOTE: Team must compose of at most 2 super citizens and up to 4 members only */

public class createGroup {
     static void createGroup(){
        /* Create regular citizens and super citizens list */
        /* These lists are for containing the IDs of each citizens */
        /* To be used for outputting phrases */
        ArrayList<Integer> regCitQueue = new ArrayList();
        ArrayList<Integer> superCitQueue = new ArrayList();

        /* Populate lists with integers */
        for(int i = 0; i < sharedVar.regCitizens; i++){
            regCitQueue.add(i);
        }
        for(int i = 0; i < sharedVar.superCitizens; i++){
            superCitQueue.add(i);
        }

        divideCitizens.divideCitizens(regCitQueue, superCitQueue);
    }
}
