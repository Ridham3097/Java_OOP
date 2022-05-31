package Assignment6;

/**
 * this class conatins healing methods
 * @ author: RIDHAM PATEL,000831171
 */
public class Wizard extends Humanos {
    /**
     * magicScore variable
     */
    private double magicScore;

    /**
     * parametrized constructor of class
     * set dafault values for parent constructor
     * @param magicScore
     */
    public Wizard(double magicScore) {
        super(5, 5, 5, 5, 5, 5);
        this.magicScore = magicScore;
    }

    /**
     * parametrized constructor of class
     * @param strength
     * @param dexterity
     * @param armour
     * @param moxie
     * @param health
     * @param coin
     * @param magicScore
     */
    public Wizard(double strength, double dexterity, double armour, double moxie, double health, double coin, double magicScore) {
        super(strength, dexterity, armour, moxie, health, coin);
        this.magicScore = magicScore;
    }

    /**
     * healingb method to increase health
     */
    public void healing() {
        setHealth(getHealth() + (magicScore / 2));
        magicScore = magicScore - 3;
    }

    /**
     * tostring method to print values
     * @return
     */
    @Override
    public String toString() {
        if (magicScore > 0) {
            return "Wizard{ " +
                    "magicScore=" + magicScore + ", " +
                    super.toString() +
                    '}';
        } else {
            return " Wizard can not heal";
        }
    }
}
