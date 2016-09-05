package practice.Pervaya;

public class Converter {
    private final double rate;
    public Converter (double rate){
        this.rate = rate;
    }
    public double convert (double sum){
        return sum/rate;
    }


}
