package ohm.softa.a03;

public class HungryState extends State{

    protected HungryState(int duration) {
        super(duration);
        logger.info("HUNGRY");
    }

    @Override
    State successor(Cat cat) {
        logger.info("I've starved for a too long time...good bye...");
        return new DeathState(0);
    }

    State feed(Cat cat){
        logger.info("You feed the cat...");
        DigestingState state = new DigestingState(cat.getDigest());
        int restAwakeTime = cat.getAwake()-getTime()-cat.getDigest();
        if (restAwakeTime < 0) restAwakeTime = 0;
        state.setRestAwakeTime(restAwakeTime);
        return state;
    }
}
