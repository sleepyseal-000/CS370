public class Main {

    public static void main(String[] args) {
        Duck d = new Duck();
        d.talk();

        Guck g = new Guck();

        // TODO: this code should work
        // A Guck will walk like a duck and talk like a goose.
        System.out.println();
        g.talk();
        g.walk();

    }
}
