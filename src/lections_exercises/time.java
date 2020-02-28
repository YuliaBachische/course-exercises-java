package lections_exercises;

public class time {
    public  int sec;
    public  int min;
    public  int hour;
    public static void main(String[]args) {
        time sec = new time(5557);
        sec.showTime();
    }
    public  void showTime() {
        this.min = sec/60;
        this.sec %= 60;
        this.hour = min/60;
        if(sec<=0){
            System.out.println(0);
        }
        if(min>=60) {
            min = min - hour * 60;
            System.out.println("Часы: " + hour + " " + " Минуты: " + min + " " + " " + "Секунды: " + sec);
        }
    }
    public time (int sec){
        this.sec = sec;
    }
    public void showSec(){
        this.min = min*60;
        this.hour = hour*3600;
        System.out.println(min + hour + sec);
    }
    public time(int sec, int min, int hour){
        this.min = min;
        this.hour = hour;
        this.sec = sec;
    }
}


