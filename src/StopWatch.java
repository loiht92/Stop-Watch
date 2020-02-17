import java.time.LocalTime;

public class StopWatch {
    private double startTime;
    private double endTime ;
    long milistart;
    long milistop;

    public StopWatch() {
        LocalTime startTime = LocalTime.now();

    }

    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime ;
        this.endTime = endTime ;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void  start() {
        LocalTime startTime = LocalTime.now();
        System.out.println("Thoi gian bat dau" +startTime);
        this.milistart = System.nanoTime();


    }

    public void stop() {
        LocalTime endTime = LocalTime.now();
        System.out.println("Thoi gian ket thuc" +endTime);
        this.milistop = System.nanoTime();
    }
    public void getElapsedTime() {
        long elapsed = System.nanoTime();
        System.out.println("Thoi gian da troi qua" +elapsed);

    }

}
