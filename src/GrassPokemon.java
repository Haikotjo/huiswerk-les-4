public class GrassPokemon extends Pokemon{

    private int pollenCount ;
    private String leafColor  ;

    private final String type = "Grass";

    public GrassPokemon(String name, int hp, int attack, int defence, int pollenCount, String leafColor){
        super(name, hp, attack, defence);
        this.pollenCount  = pollenCount ;
        this.leafColor  = leafColor ;
    }

    public void leafStorm() {
        System.out.println(getName() + " used leaf storm with " + getAttack() + " attack power." + " and " + pollenCount + " pollen count with " + leafColor + " leaves");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type + " PollenCount: " + pollenCount + ". Leaf color: " + leafColor);
    }

    public int getPollenCount() {
        return pollenCount;
    }

    public void setPollenCount(int pollenCount) {
        this.pollenCount = pollenCount;
    }

    public String geLleafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }
}
