package OOP;

public class GameDrone {
    public static void main(String[] args) {
        Drone object = new Drone();

        object.energi = 50;
        object.ketinggian = 10;
        object.kecepatan = 20;
        object.merek = "Telkom School";

        object.terbang();
        object.maju();
        object.belok();
        object.mundur();
        object.turun();
        object.matikanMesin();
    }
}
