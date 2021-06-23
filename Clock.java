public class Clock {

    private long time = 0;

    private Clock(long time) {
        this.time = time;
    }

    public Clock(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;
    }

    public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }

}
/*public class Clock {
    public long time = 0;
}


public class ClockReader {       //this is public constructor
    Clock clock = new Clock();

    public long readClock{
        return clock.time;
    }
}*/
/*public class Clock {
    protected long time = 0;    // time in milliseconds
}


public class SmartClock() extends Clock{ //this is private constructor

    public long getTimeInSeconds() {
        return this.time / 1000;
    }
}*/
