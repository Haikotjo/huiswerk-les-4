public class Main {
    public static void main(String[] args) {
        Pokemon doop =  new Pokemon("Doop", 100, 100, 200);

        doop.caculateHpLeft();
        doop.displayInfo();

        FirePokemon flameboy = new FirePokemon("Flameboy", 150, 200, 100, 5, 200);

        flameboy.displayInfo();
        flameboy.fireLash();
        flameboy.caculateHpLeft();

        ElectricPokemon voltbuddy = new ElectricPokemon("Voltbuddy", 200, 150, 50, 500, 50);

        voltbuddy.displayInfo();
        voltbuddy.thunderPunch();
        voltbuddy.caculateHpLeft();

        GrassPokemon grassweirdo = new GrassPokemon("Grasweirdo", 300, 100, 50, 150, "green");

        grassweirdo.displayInfo();
        grassweirdo.leafStorm();
        grassweirdo.caculateHpLeft();


        WaterPokemon waterdude = new WaterPokemon("Waterdude", 150, 200, 250, 25, 30);

        waterdude.displayInfo();
        waterdude.hydroPump();
        waterdude.caculateHpLeft();

    }
}