/**
 * Created by Ted on 8/13/2016.
 */
public class Time {

    private int time;

    public Time(int i){
        if(i >= 0 && i < 86400){
            this.time = i;
        }
    }
    public Time(String s){

    }
}
