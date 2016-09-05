package practice.Tretja.Z2_2;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double slideAB;
    private double slideBC;
    private double slideCA;


    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        if (isTriangle()){
            //bad logic
        }

        this.slideAB = getLength(pointA, pointB);
        this.slideBC = getLength(pointB, pointC);
        this.slideCA = getLength(pointC, pointA);

    }

    private double calculatePerimetr() {
        return slideAB +slideBC +slideCA;
    }

    public void print (){
        System.out.println("Perimetr:" + calculatePerimetr() + "Area:" + calculateArea());
    }

    private double calculateArea() {
        double halfPerimetr = calculatePerimetr() / 2;
        return Math.sqrt(halh);
    }

    private double getLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(),2 )
                +Math.pow(pointA.getY() - pointB.getY(), 2));
    }
    private boolean isTriangle() {
        int diff1 = pointA.getX() - pointB.getX();
        int diff2 = pointC.getY() - pointB.getY();
        int diff3 = pointA.getY() - pointB.getY();
        int diff4 = pointC.getX() - pointB.getX();
        return diff1 * diff2 != diff3 * diff4;
    }
}
