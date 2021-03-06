
package media;

public class Television {
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn = false;
    
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public int getCurrentProgram(){
        return currentProgram;
    }
    
    public void setCurrentProgram(int programNo){
        this.currentProgram = programNo;
    }
    
    public boolean isTvOn(){
        return turnOn;
    }
    
    public void setTvOnOff(boolean onOff){
        this.turnOn = onOff;
    }
    
    public void showData(){
        System.out.println("Tv is on(true)/off (false): " + isTvOn());
        System.out.println("Program no: " + getCurrentProgram());
        System.out.println("Volume: " + getVolume());
        System.out.println("");
    }
}
