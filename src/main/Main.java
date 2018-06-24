package main;
import media.Radio;
import media.Television;

public class Main {
    public static void main(String[] args) {
       
       Television tv1 = new Television();
       
       tv1.setCurrentProgram(2);
       tv1.setTvOnOff(true);
       tv1.setVolume(22);
       
       tv1.showData();
       
       Radio r1 = new Radio();
       
       r1.setFmFrequency(104.5);
       r1.setAmFrequency(750);
       r1.setBand('F');
       
       r1.showData();
       
    }
    
}
