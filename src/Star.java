/**
 * Created by rafalw on 04.06.17.
 */
public class Star extends CelestialBody{


    public Star(String name, double a, double b){
        super(name, a, b);

    }

    public Coord getCoord(double t){
        double setX;
        double setY;
        setX = (getA() * Math.cos(t));
        setY = (getB() * Math.sin(t));
        return new Coord(setX, setY);
    }

}
