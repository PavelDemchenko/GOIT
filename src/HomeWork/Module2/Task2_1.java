package HomeWork.Module2;

public class Task2_1 {

    static int array[] = {-300, -20, -30, -40, -5, -160, -73, -80, -90, -11};
    static double array1[] = {-10.5, -20.5, -30.3, -40, -5.1, -16.8, -7.7, -80, -90, -1.9};

    static int calculateSumInt(int[] array) {
        int sum = 0;
        for (int k : array) {
            if (k > 0 | k < 0) {
                sum += k;}
        }
        return sum;}

    static double calculateSumDouble(double[] array1) {
        double sumDouble = 0;
        for (double k : array1) {
            if (k > 0 | k < 0) {
                sumDouble += k;}
        }
        return sumDouble;}

    static int minInt (int[] array){
            int min = array [0];
            for (int k : array){
                if (k < min){
                min = k;
                }
            }
        return min;}

    static double minDouble (double[] array1){
            double min = array1[0];
            for (double k : array1){
                if (k < min){
                min = k;
                }
            }
        return min;}

    static int maxInt (int[] array){
        int max = array[0];
        for (int k : array){
            if (k > max){
                max = k;
            }
        }
        return max;}

    static double maxDouble (double[] array1){
        double max = array1[0];
        for (double k : array1){
            if (k > max){
                max = k;
            }
        }
        return max;}

    static int maxPositiveInt (int[]array){
        int maxPositive = array[0];
        for (int k :array){
            if (k > 0 && k > maxPositive){
                maxPositive = k;
            }
        }
        return maxPositive;}

    static double maxPositiveDouble (double[]array1){
        double maxPositive = array1[0];
        for (double k :array1){
            if (k > 0 && k > maxPositive){
                maxPositive = k;
            }
        }
        return maxPositive;}

    static long multiplicationInt (int[]array) {
        long multiplication = 1;
        for (int k : array){
            multiplication = k * multiplication;
        }
        return multiplication;}

    static double multiplicationDouble (double[]array1) {
        double multiplication = 1;
        for (double k : array1){
            multiplication = k * multiplication;
        }
        return multiplication;}

    static int modulusInt (int[]array){
        int modulus = 0;
        int a = array[0];
        int b = array[array.length-1];
        modulus = a % b;
        return modulus;}

    static double modulusDouble (double[] array1){
        double modulus = 0;
        double a = array1[0];
        double b = array1[array1.length-1];
        modulus = a % b;
        return modulus;}

    static int secondLargestInt(int[] array){
        int max = array[0];
        int secondLargest = array[0];
        for (int k : array) {
            if (k > max) {
                secondLargest = max;
                max = k;
            } else if (secondLargest == max || (k > secondLargest && k!= max)) {
                secondLargest = k;
            }
        }
        return secondLargest;}

    static double secondLargestDouble(double[] array1){
        double max = array1[0];
        double secondLargest = array1[0];
        for (double k : array1) {
            if (k > max) {
                secondLargest = max;
                max = k;
            } else if (secondLargest == max || (k > secondLargest && k!= max)) {
                secondLargest = k;
            }
        }
        return secondLargest;}

    public static void main(String[] args) {
        System.out.println("Int Sum " + calculateSumInt(array));
        System.out.println("Double Sum " + calculateSumDouble(array1));

        System.out.println("Int Min " + minInt(array));
        System.out.println("Double Min " + minDouble(array1));

        System.out.println("Int Max " + maxInt(array));
        System.out.println("Double Max " + maxDouble(array1));

        if (maxPositiveInt(array) > 0) {System.out.println("Int Max positive " + maxPositiveInt(array));}
        else {System.out.println("Int Max positive - Not");}
        if (maxPositiveDouble(array1) > 0){System.out.println("Double Max positive " + maxPositiveDouble(array1));}
        else {System.out.println("Double Max Positive - Not");}

        System.out.println("Int Multiplication " + multiplicationInt(array));
        System.out.println("Double Multiplication " + multiplicationDouble(array1));

        System.out.println("Int Modulus " + modulusInt(array));
        System.out.println("Double Modulus " + modulusDouble(array1));

        System.out.println("Int second largest " + secondLargestInt(array));
        System.out.println("Double second largest " + secondLargestDouble(array1));
    }
}
