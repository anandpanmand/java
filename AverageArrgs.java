package practice;

import javax.sound.midi.Soundbank;

public class AverageArrgs {
    static float avg(float ...args){
        float sum = 0;
        for(float i :args){
            sum +=i;
        }
        return sum/args.length;
    }
    public static void main(String[] args) {
        System.out.print("Average of 4,5,6 is :-"+avg(4,5,6,5));
    }
}
