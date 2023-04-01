package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    protected static final Logger logger = LogManager.getLogger();
    private int time;
    private final int duration;

    protected State(int duration) {
        this.duration = duration;
        this.time = 0;
    }

    final State tick(Cat cat){
        logger.info("tick()");
        time = time + 1;
        if (time == duration) {
            return successor(cat);
        }
        return this;
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return time;
    }
}
