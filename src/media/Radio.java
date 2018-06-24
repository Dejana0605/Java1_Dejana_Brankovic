package media;

public class Radio {
    private double fmFrequency = 91.8;
    private int amFrquency = 600;
    private char band = 'A';
    
    public double getFmFrequency(){
        return fmFrequency;
    }
    
    public void setFmFrequency(double fmFrquency){
        this.fmFrequency = fmFrquency;
    }
    
    public int getAmFrequency(){
        return amFrquency;
    }
    
    public void setAmFrequency(int amFrequency){
        this.amFrquency = amFrequency;
    }
    
    public char getBand(){
        return band;
    }
    
    public void setBand(char band){
        this.band = band;
    }
}
