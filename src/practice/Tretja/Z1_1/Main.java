package practice.Tretja.Z1_1;

public class Main {
    public static void main(String[] args) {
        MoneyConverter moneyConverter = new Calc();

        demonstrate(cals, 100);
        //demonstrate(cals, 200);
    }

    private void demonstrate(MoneyConverter moneyConverter, int moneyCount){
        System.out.println(moneyConverter.convertsFromUsd(moneyCount));
    }

}
