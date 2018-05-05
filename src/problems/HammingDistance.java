package problems;

/**
 * Created by david on 21/04/2018.
 */
public class HammingDistance {

    public int calculateHammingDistance(int x, int y){

        String xBin = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String yBin = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        int res = 0;



        for (int i = 0; i < 32 ; i++) {
            if(! (xBin.charAt(i) == yBin.charAt(i)) ){
                res ++;
            }
        }

        return res;

    }


    public static void main(String[] args) {



        HammingDistance h = new HammingDistance();


        System.out.println(h.calculateHammingDistance(1,4 ));

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(4));



    }
}
