package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by david on 22/04/2018.
 */
public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        Map<Character, Integer> values = new HashMap<Character, Integer>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int lines = 1;
        int units = 0;

        for (int i = 0; i < alphabet.length ; i++) {
            values.put(alphabet[i], widths[i]);
        }

        for (Character c : S.toCharArray()){
            int curVal = values.get(c);

            if( (units + curVal) > 100 ){
                lines ++;
                units = curVal;
            }

            else{
                units += curVal;
            }


        }


        int[] res = {lines, units};

        return res;
    }

    public static void main(String[] args) {


        System.out.println('c' - 'a' );

    }
}
