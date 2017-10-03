import java.util.*;


/**
 * Created by rafalw on 04.06.17.
 */
public class PlanetSystem {

    private String name;
    private Map<Double, Collision> collision = new TreeMap<>();

    private List<CelestialBody> system;

    public PlanetSystem(String name){
        this.name = name;
        system = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<CelestialBody> getSystem(){
        return system;
    }

    public void calculateCollisions(){
        for (double t = -1*Math.PI; t < Math.PI; t+= 0.01){
            for (CelestialBody cb: system) {
                for (CelestialBody cb2: system) {
                    if (!cb.equals(cb2) && cb.getCoord(t).equals(cb2.getCoord(t))){
                        collision.put(t, new Collision(cb, cb2, t));
                    }
                }
            }
        }
    }

    public Map<Double, Collision> getCollision() {
        return collision;
    }

    public void add(CelestialBody cb){
        system.add(cb);
        calculateCollisions();
    }

    @Override
    public String toString() {
        return "Obiekty uklady planetarnego " + name + " :\t"
                 + system;
    }
}
