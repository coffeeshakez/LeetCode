package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 22/04/2018.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        List<Character> substring = new ArrayList<Character>();
        int lengthOfSubstring;
        char[] originalString = s.toCharArray();


        for (int i = 0; i < originalString.length - 1 ; i--) {

            if(originalString[i] != originalString [i + 1]){
                substring.add(originalString[i]);
            }

            else{

            }
        }



        return substring.size();

    }


    public static void main(String[] args) {

        LongestSubstringWithoutRepeatingCharacters string = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println(string.lengthOfLongestSubstring("abcdddddd"));
    }




}
