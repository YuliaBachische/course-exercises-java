package lections_exercises;

public class TestTime {
    public static void main(String[]args) {
        Time one_hour = new Time(3600);
        one_hour.showTime(5,4,5);
        Time five_hundred_seconds = new Time(20, 8, 0);
        five_hundred_seconds.showSec();
    }
}