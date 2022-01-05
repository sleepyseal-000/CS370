// TODO :
// Guck is a Bird, but it should
// talk like a Duck
// walk like a Goose

// use Bird class for your contract
// use delegation rather than repeating code
public class Guck extends Bird   {

    Bird d = new Duck();
    Bird g = new Goose();

    @Override
    public void walk() {

        d.walk();
    }

    @Override
    public void talk() {

        g.talk();
    }
}
