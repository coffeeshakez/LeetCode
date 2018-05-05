package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by david on 19/04/2018.
 */
public class UniqueMorseCodeWords {



    public int uniqueMorseRepresentations(String[] words) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character, String> table = new HashMap<Character, String>();
        int noOfConcentations = 0;
        List<String> concentations = new ArrayList<String>();

        char[] alphabetChars = alphabet.toCharArray();



        for (int i = 0; i < 26; i++) {
            table.put(alphabetChars[i], morse[i]);
        }

        table.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        for(String word : words){

            String concentation = "";

            for (int i = 0; i < word.length(); i++) {
                concentation += table.get(word.charAt(i));
            }

            if(!concentations.contains(concentation)){
                concentations.add(concentation);
                noOfConcentations ++;
            }
        }

        return noOfConcentations;

    }

    public static void main(String[] args) {

        UniqueMorseCodeWords u = new UniqueMorseCodeWords();

        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(u.uniqueMorseRepresentations(words));

    }


}
