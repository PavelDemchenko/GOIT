package VoprosOtvet2;

public class HomeWorkDouble {
    static double[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, -10};
    static double sum = 0;

    static double calculateSum (double[] array){
        for (double array1 : array) {
            if (array1 > 0 | array1< 0) {
                sum += array1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        double sum = calculateSum(array);
        System.out.println("Sum Double " + sum);
    }
}
