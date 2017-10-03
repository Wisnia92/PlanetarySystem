/**
 * Created by rafalw on 04.06.17.
 */
public class Moon extends CelestialBody{

    private Planet planet;

    public Moon(Planet planet, String name, double a, double b){
        super(name, a, b);
        this.planet = planet;

    }


    public Coord getCoord(double t){
        double setX;
        double setY;
        Coord planetCoord = planet.getCoord(t);
        setX = (getA() * Math.cos(t)) + planetCoord.getX();
        setY = (getB() * Math.sin(t)) + planetCoord.getY();
        return new Coord(setX, setY);
    }

}
