public class Main {
    public static void main(String[] args) {
        car lada = new car("Lada", "Vesta cross", 2.8);
        car porshe = new car("Porshe", "Panamera", 3.0);
        car ferrari = new car("Ferrari", "Enzo", 3.4);
        car delorian = new car("Delorian", "V2.0", 2.0);
        autobus paz = new autobus("PAZ", "turbo", 4.0);
        autobus vw = new autobus("Volks Wagen", "Big bug", 3.0);
        autobus volvo = new autobus("Volvo", "S900", 4.0);
        autobus mersedes = new autobus("Mersedes", "grand s200", 3.8);
        truck kamaz = new truck("KAMAZ", "cybertruck", 4.2);
        truck belaz = new truck("BELAZ", "Gigatruck", 5.2);
        truck man = new truck("MAN", "woman", 4.0);
        truck zil = new truck("ZIL", "old shool", 4.6);
        System.out.println(zil);
        zil.Start();
        zil.pitStop();
        zil.End();
        zil.maxSpeed("280 км/ч");
        zil.bestLapTime("2:30");
        transport.seprator();
        System.out.println(man);
        man.Start();
        man.pitStop();
        man.End();
        man.maxSpeed("300 км/ч");
        man.bestLapTime("2:20");
        transport.seprator();
        System.out.println(belaz);
        belaz.Start();
        belaz.pitStop();
        belaz.End();
        belaz.maxSpeed("260 км/ч");
        belaz.bestLapTime("2:40");
        transport.seprator();
        System.out.println(kamaz);
        kamaz.Start();
        kamaz.pitStop();
        kamaz.End();
        kamaz.maxSpeed("290 км/ч");
        kamaz.bestLapTime("2:24");
        transport.seprator();
        driver<truck> volk = new driver<>("Volkov", 'C', 12);
volk.driveStart(zil);
driver<car> lev = new driver<>("Levchenko", 'A', 10);
lev.driveStart(delorian);


    }
}