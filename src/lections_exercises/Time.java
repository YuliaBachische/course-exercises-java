package lections_exercises;

public class Time {
    public int sec;
    public int min;
    public int hour;
    public static void main(String[]args) {
        Time sec = new Time(8, 8, 8);
        sec.showSec();
    }
    public  void showTime() {
        System.out.println("Часы: " + hour + " " + " Минуты: " + min + " " + " " + "Секунды: " + sec);
    }

    public Time(int sec, int min, int hour){
        this.min = sec/60;
        this.hour = min/60;
        this.sec = sec;
        this.min = min*60;
        this.hour = hour*3600;
    }
    public void showSec(){
        System.out.println(min + hour + sec);
    }
    public Time(int sec){
        this.min = sec/60;
        this.sec %= 60;
        this.hour = min/60;
        if(sec<=0){
            System.out.println(0);
        }
        if(min>=60) {
            min = min - hour * 60;
        }
    }
}