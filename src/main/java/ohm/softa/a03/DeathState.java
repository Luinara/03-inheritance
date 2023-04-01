package ohm.softa.a03;

public class DeathState extends State{
    protected DeathState(int duration) {
        super(duration);
        logger.info("DEATH");
    }

    @Override
    State successor(Cat cat) {
        return null;
    }
}
