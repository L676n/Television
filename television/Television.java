
package television;

public class Television {
    
    private String manufacturer;
    private int screen_size;
    private boolean PowerOn;
    private int channel;
    private int volume;
    
    
    public Television(String brand, int size){
     manufacturer = brand;
     screen_size = size;
     PowerOn = false;
     channel = 2;
     volume = 20;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public int getChannel(){
        return channel;
    }
    
    public String getManuFacturer(){
        return manufacturer;
    }
    
    public int getScreenSize(){
        return screen_size;
    }
    
    
    
     public void setChannel(int station){
         channel = station;
     }
     
     
     public void power(){
         PowerOn = !PowerOn;
     }
     
     
     public void increaseVolume(){
         ++volume;
     }
     
     public void decreaseVolume(){
         --volume;
     }
}
