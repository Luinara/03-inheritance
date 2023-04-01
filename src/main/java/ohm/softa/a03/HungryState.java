package ohm.softa.a03;

public class HungryState extends State{

    protected HungryState(int duration) {
        super(duration);
    }

    @Override
    State successor() {
        return null;
    }
}
