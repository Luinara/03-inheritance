package ohm.softa.a03;

public class DigestingState extends State{
    int restAwakeTime;
    protected DigestingState(int duration) {
        super(duration);
        logger.info("DIGESTING");
    }

    @Override
    State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        return new PlayfulState(restAwakeTime);
    }
    public void setRestAwakeTime(int restAwakeTime) {
        this.restAwakeTime = restAwakeTime;
    }
}
