package Assignment6;

import java.util.Scanner;

/**
 * main class of the programme
 * @ author: RIDHAM PATEL,000831171
 */

public class FakeWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /**
         * create object of Elf
         */
        Elf e = new Elf("fighter");
        /**
         * create object of Fighter
         */
        Fighter f = new Fighter();
        /**
         * create object of Wizard
         */
        Wizard w = new Wizard(20);
        /**
         * create object of Hobbits
         */
        Hobbits ho = new Hobbits();

        while (true) {
            /**
             * to initialize methods through ho objects
             */
            ho.steal();
            ho.damage();
            ho.health();

            /**
             * to initialize methods through e objects
             */
            e.damage();
            e.health();
            /**
             * to initialize methods through ojects
             */
            f.damage();
            f.health();

            /**
             * to initialize methods through ho objects
             */
            w.healing();
            w.health();
            w.damage();

            System.out.println(e);
            System.out.println(" ");
            System.out.println(w);
            System.out.println(" ");
            System.out.println(ho);
            System.out.println("Press Enter");
            s.nextLine();
        }
    }
}
