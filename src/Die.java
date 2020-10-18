import java.util.Random;

import static java.lang.Math.random;

public class Die {
    Random rand = new Random();
    private int roll = rand.nextInt(6) + 1;

    public int getRoll(){
        return roll;
    }

    public void setRoll(int newRoll){
        this.roll = newRoll;
    }
}
