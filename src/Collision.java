/**
 * Created by rafalw on 04.06.17.
 */
public class Collision {

    private CelestialBody cb;
    private CelestialBody cb2;
    double t;

    public Collision(CelestialBody cb, CelestialBody cb2, double t){
        this.cb = cb;
        this.cb2 = cb2;
        this.t = t;
    }


    @Override
    public String toString() {
        return "Kolizja w pkt " + cb.getCoord(t) + " pomiędzy " + cb + " a " + cb2;
    }
}
