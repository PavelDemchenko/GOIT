package Task1;

public class Main {
    public static void main(String[] args) {

        Converter converter1 = new Converter(8);
        Converter converter2 = new Converter(15);
        Converter converter3 = new Converter(26.4);
        double sumObmen = 480;


        //Converter hrn = new Converter(25.64);
        //double result = hrn.convert(480);
        //System.out.println(result);

        System.out.println(converter1.sumObmen);
        System.out.println(converter2.convert(480));
        System.out.println(converter3.convert(480));
    }
}
