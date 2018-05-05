package problems;

import java.util.Stack;

/**
 * Created by david on 21/04/2018.
 */
public class BaseballGame {

    public int calPoints(String[] ops) {

        int res = 0;
        Stack<Integer> scores = new Stack<Integer>();

        for(String operation : ops ){

            if(operation.equals("+")){
                int topOfStack = scores.pop();
                int newTop = topOfStack + scores.peek();
                scores.push(topOfStack);
                scores.push(newTop);
            }

            else if( operation.equals("D") ){

                scores.push( scores.peek() * 2);
            }

            else if( operation.equals("C") ){
                scores.pop();
            }

            else{
                scores.push(Integer.valueOf(operation));
            }
        }

        for(Integer sc : scores){
            res += sc;
        }

        return res;
    }


    public static void main(String[] args) {


    }
}
