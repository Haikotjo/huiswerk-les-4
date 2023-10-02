public class ElectricPokemon extends Pokemon{
    private int voltage;
    private int resistance ;
    private final String type = "Electric";

    public ElectricPokemon(String name, int hp, int attack, int defence, int voltage, int resistance){
        super(name, hp, attack, defence);
        this.voltage  = voltage ;
        this.resistance  = resistance ;
    }

    public void thunderPunch() {
        System.out.println(getName() + " used thunder punch with " + getAttack() + " attack power." + " and " + voltage + " voltage and " + resistance + " resistance");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type + " Voltage: " + voltage + ". Resistance: " + resistance);
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
}
