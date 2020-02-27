package lections_exercises;

public class Time {
        public static int sec;
        public static int min;
        public static int hour;
        public static void main(String[]args) {
            Time sec = new Time(500);
            sec.showTime();
        }
        public static void showTime() {
            Time.min = sec/60;
            Time.sec %= 60;
            Time.hour = min/60;
            if(min>=60) {
                min = min - hour * 60;
            }
            System.out.println("Часы: " + hour + " " + " Минуты: " + min + " " + " " + "Секунды: " + sec);
        }
        public Time (int sec){
            this.sec = sec;
        }
        public static void showSec(){
            Time.min = min*60;
            Time.hour = hour*3600;
            Time.sec = sec;
            System.out.println(min + hour + sec);
        }
        public Time(int sec, int min, int hour){
            this.min = min;
            this.hour = hour;
            this.sec = sec;
        }
    }

