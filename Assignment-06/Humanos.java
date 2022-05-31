package Assignment6;
/**
 * @ author: RIDHAM PATEL,000831171
 */
public class Humanos extends Humanoids {

    /**
     * default constructor
     */
    public Humanos() {
        super(5, 5, 5, 5, 5, 5);
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
    public Humanos(double strength, double dexterity, double armour, double moxie, double health, double coin) {
        super(strength, dexterity, armour, moxie, health, coin);
    }

    /**
     * tostring to print values
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
