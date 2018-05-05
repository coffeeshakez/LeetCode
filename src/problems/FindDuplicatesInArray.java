package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by david on 22/04/2018.
 */
public class FindDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {

        Map<Integer, Integer> notdupes = new HashMap<Integer, Integer>();

        List<Integer> dupes = new ArrayList<Integer>();

        for(Integer i : nums){

            if(notdupes.putIfAbsent(i, i) != null){
                dupes.add(i);
            }
        }

        return dupes;

    }


}
