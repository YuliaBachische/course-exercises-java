package lections_exercises;

public class time {
        public static int sec;
        public static int min;
        public static int hour;
        public static void main(String[]args) {
            time sec = new time(500);
            sec.showTime();
        }
        public static void showTime() {
            time.min = sec/60;
            time.sec %= 60;
            time.hour = min/60;
            if(min>=60) {
                min = min - hour * 60;
            }
            System.out.println("Часы: " + hour + " " + " Минуты: " + min + " " + " " + "Секунды: " + sec);
        }
        public time (int sec){
            this.sec = sec;
        }
        public static void showSec(){
            time.min = min*60;
            time.hour = hour*3600;
            time.sec = sec;
            System.out.println(min + hour + sec);
        }
        public time(int sec, int min, int hour){
            this.min = min;
            this.hour = hour;
            this.sec = sec;
        }
    }

