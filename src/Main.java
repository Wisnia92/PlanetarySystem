import java.util.Scanner;

/**
 * Created by rafalw on 04.06.17.
 */
public class Main {

    public static void main(String[] args) {

        String names;
        String switcher;
        String switcher2;
        String exit = "";
        double a;
        double b;




        Planet planet;
        Moon moon;

        System.out.println("Podaj nazwę nowego systemy planetarnego: ");
        Scanner reader = new Scanner(System.in);
        names = reader.nextLine();
        PlanetSystem planetSystem = new PlanetSystem(names);

        System.out.println("Dodaj gwiazde to systemu planetarnego " + planetSystem.getName());
        reader = new Scanner(System.in);
        names = reader.nextLine();
        System.out.println("Długość półosi a");
        reader = new Scanner(System.in);
        a = reader.nextDouble();
        reader = new Scanner(System.in);
        System.out.println("Długość półosi b");
        b = reader.nextDouble();
        Star star = new Star(names, a, b);
        planetSystem.add(star);


        while (!exit.equals("exit")) {
            System.out.println("Jeśli chcesz dodać planete i jej ksieżyc wpisz:\t\t\t add\n" +
                    "Jeśli chcesz sprawdzić obiekty w systemie " + planetSystem.getName() + "wpisz:\t\t check\n" +
                    "Jeśli chcesz sprawdzić kolizje wpisz:\t\t\t\t\t collision\n" +
                    "Jeśli chcesz zakończyc wpisz:\t\t\t\t\t\t\t exit");
            reader = new Scanner(System.in);
            switcher = reader.nextLine().toLowerCase();

            switch (switcher){
                case "add":
                    System.out.println("Podaj nazwe planety");
                    reader = new Scanner(System.in);
                    names = reader.nextLine();
                    reader = new Scanner(System.in);
                    System.out.println("Długość półosi a");
                    a = reader.nextDouble();
                    reader = new Scanner(System.in);
                    System.out.println("Długość półosi a");
                    b = reader.nextDouble();
                    planet = new Planet(star, names, a, b);
                    planetSystem.add(planet);
                    System.out.println("Jeśli chcesz dodać do niej księżyc wpisz: tak");
                    reader = new Scanner(System.in);
                    switcher2 = reader.nextLine().toLowerCase();
                    while (switcher2.equals("tak")){
                        System.out.println("Podaj nazwe księżyca");
                        reader = new Scanner(System.in);
                        names = reader.nextLine();
                        System.out.println("Podaj długość półosi a");
                        reader = new Scanner(System.in);
                        a = reader.nextDouble();
                        System.out.println("Podaj długość półosi b");
                        reader = new Scanner(System.in);
                        b = reader.nextDouble();
                        moon = new Moon(planet, names, a, b);
                        planetSystem.add(moon);

                        System.out.println("Jeśli chcesz dodać kolejny księżyc wpisz: tak");
                        reader = new Scanner(System.in);
                        switcher2 = reader.nextLine().toLowerCase();
                    }
                    break;
                case "check":
                    System.out.println("===========================");
                    System.out.println(planetSystem.toString());
                    System.out.println("===========================");
                    break;
                case "collision":
                    System.out.println("===========================");
                    for (Collision col: planetSystem.getCollision().values()) {
                        System.out.println(col.toString());
                    }
                    System.out.println("===========================");
                    break;
                case "exit":
                    exit = "exit";
                    break;
            }

        }

    }
}
