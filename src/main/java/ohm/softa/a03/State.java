package ohm.softa.a03;

public abstract class State {
    int time;
    final int duration;

    protected State(int duration) {
        this.duration = duration;
        this.time = duration;
    }

    final State tick(Cat cat){
        return null;
    }

    abstract State successor();

    public int getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }
}
