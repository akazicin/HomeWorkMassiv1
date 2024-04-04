public class Main {
    public static void main(String[] args) {

        //task1

        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;

        }
        double[] nums = {1.57, 7.654, 9.986};
        boolean[] booleans = {true, false, true};

        ///task2

        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            System.out.print(weight[i]);
            if (i < weight.length - 1)
                System.out.print(", ");

        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < booleans.length; i++) {
            System.out.print(booleans[i]);
            if (i < booleans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        ///task3
        for ( int i = weight.length - 1; i >= 0; i--){
            System.out.print(weight [i]);
            if (i > 0 ){
                System.out.print( ", ");
            }

        }
        System.out.println();

        for (int i = nums.length -1 ; i >=0 ; i--) {
            System.out.print(nums [i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println();

        for (int i = booleans.length -1; i >=0 ; i--) {
            System.out.print( booleans [i]);
            if (i > 0) {
                System.out.print( ", ");
            }
        }

        System.out.println();

        ///task4

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 !=0 ){
                weight [i] ++;
            }
        }
        for (int i = 0; i < weight.length; i++) {
            System.out.print( weight[i]);
            if (i<weight.length - 1) {
                System.out.print( ", ");
            }
            
        }
    
    }
}