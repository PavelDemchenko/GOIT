package HomeWork.Module2;

public class Task2_2 {

    static double balance = 105;
    static double withdrawal = 100;

    static double withdrawBalance(double balance, double withdrawal){
        double commission = withdrawal * 0.05;
        double balanceAfter = balance - withdrawal - commission;
        return balanceAfter;
    }

    public static void main(String[] args) {
        double balanceAfter = withdrawBalance(balance, withdrawal);
        double commission = withdrawal * 0.05;
        if (balanceAfter >= 0){System.out.print("OK " + commission + " " + balanceAfter);}
        else {System.out.println("NO");}
    }
}
