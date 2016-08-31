package VoprosOtvet2;

public class Test {

    static int array[] = {10, 20, 30, 40, -50, 160, 70, 80, 90, -10};
    static int sum = 0;
    static int calculateSum(int[] array) {
        for (int array1 : array) {
            if (array1 > 0 | array1 < 0) {
                sum += array1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = calculateSum(array);
        int min = array[0];
        int max = array[0];
        /*int maxpositive = array [0];
        for (int k: array){
            if ()
        }*/
        for(int k: array) {
            if(k > max) max = k;}
        for(int k: array) {
            if(k < min) min = k;}
        for (int array1 : array) {
            if (array1 > 0 | array1 < 0) {
                sum += array1;}
        }

        //for (int )






        System.out.println("Sum " + sum);
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        //System.out.println("Max positive " + maxpositive);
    }
}
