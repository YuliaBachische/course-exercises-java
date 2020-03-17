package lections_exercises09;
public class ClassForTest {
    int theTimeInSecs;
    int theTimeInMins;

    public ClassForTest(int theTimeInSecs, int theTimeInMins) {
        this.theTimeInSecs = theTimeInSecs;
        this.theTimeInMins = theTimeInMins;
    }
    @Transaction
    public int calcTime(int magic){
        int min = theTimeInMins;
        int sec = theTimeInSecs;
        return ((min/60)+sec)*magic;
    }
    public void printTime(int m){
        System.out.println(m);
    }
}
