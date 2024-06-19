package practice;


import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 * FarenighttToCelsius
 */
public class FarenighttToCelsius {

    public static void main(String[] args) {
        System.out.println("Enter Temperatuer in fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        int far = sc.nextInt();
        float ces = (far-32)/(9.0f/5);
        System.out.println(ces);
    }
}