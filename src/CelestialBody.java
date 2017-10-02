/**
 * Created by rafalw on 04.06.17.
 */
public abstract class CelestialBody {

    private String name;
    private double a;
    private double b;

    public CelestialBody(String name, double a, double b){
        this.a = a;
        this.b = b;
        this.name = name;

    }

    public abstract Coord getCoord(double t);


    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return name;
    }
}
