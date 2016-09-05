package Test;

public class Test {
    static double withdrawBalance(double balance, double withdrawal, double commission){
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {
        double balance = 105;
        double withdrawal = 101;
        double commission = (withdrawal / 100) * 5;

        double balanceAfter = balance - withdrawal - commission;

        if (balanceAfter >= 0){
            System.out.print("OK ");
            System.out.print(commission + " ");
            System.out.println(balanceAfter);
        }
        else {
            System.out.println("NO");
        }
    }

}