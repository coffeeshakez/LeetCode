package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 22/04/2018.
 */
public class SelfDividingNumbersTask {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> validNumbers = new ArrayList<Integer>();

        if( (left < 1) || (right < 1) || (right > 10000)){
            return null;
        }

        for (int i = left; i <= right ; i++) {

            char[] curVal = String.valueOf(i).toCharArray();
            boolean isValidNumber = false;

            for(Character number : curVal){

                if(Integer.parseInt(number.toString()) == 0){

                    isValidNumber = false;
                    break;
                }

                if(i % Integer.parseInt(number.toString()) != 0){
                    isValidNumber = false;
                    break;
                }

                else{
                    isValidNumber = true;
                }
            }

            if(isValidNumber){
                validNumbers.add(i);
            }



        }

        return validNumbers;
    }

    public static void main(String args[]){

        SelfDividingNumbersTask num = new SelfDividingNumbersTask();

        for(Integer i : num.selfDividingNumbers(1, 30)){
            System.out.println(i);
        }

    }

}
