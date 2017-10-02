/**
 * Created by rafalw on 04.06.17.
 */
public class Planet extends CelestialBody{

    private Star star;


    public Planet(Star star, String name, double a, double b){
        super(name, a, b);
        this.star = star;

    }

    public Coord getCoord(double t){
        double setX;
        double setY;
        Coord starCoord = star.getCoord(t);
        setX = (getA() * Math.cos(t)) + starCoord.getX();
        setY = (getB() * Math.sin(t)) + starCoord.getY();
        return new Coord(setX, setY);
    }



}
