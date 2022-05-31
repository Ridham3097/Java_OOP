package Assignment6;

/**
 * @ author: RIDHAM PATEL,000831171
 */
public class Elf extends Humanoids {
    /**
     * final name variable
     */
    private final String name = "warrior ";
    /**
     * enemy variable
     */
    private String enemy;

    /**
     * parametrized constructor
     * @param enemy
     */
    public Elf(String enemy) {
        this(5, 5, 5, 5, 5, 5);
        this.enemy = enemy;
    }

    /**
     * parametrized constructor
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param health
     * @param coin
     */
    public Elf(double strength, double dexterity, double armour, double moxie, double health, double coin) {
        super(strength, dexterity, armour, moxie, health, coin);
    }

    /**
     * to print values
     * @return
     */
    @Override
    public String toString() {
        return "Elf{ " +
                "name='" + name +
                ", enemy='" + enemy +  ", " +
                super.toString() +
                '}';
    }
}
