package ohm.softa.a03;

public class PlayfulState extends State{
    protected PlayfulState(int duration) {
        super(duration);
        logger.info("PLAYFUL");
    }

    @Override
    State successor(Cat cat) {
        logger.info("Yoan... getting tired!");
        return new SleepingState(cat.getSleep());
    }

}
