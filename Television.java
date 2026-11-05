package englishVersion.Telewizor;

public class Television {

    public boolean condition;
    public int currentChannel;
    public int volume;
    static int defaultVolume = 15;
    final String model = "RXT432";
    public int serialNumber;
    public int numberOfChannels;
    public int maxVolume;
    static int technicalChannel = 13;

    //parameterized constructor
    public Television(boolean startCondition,int startCurrentChannel,int startVolume,int startSerialNumber,int startNumberOfChannels,int startMaxVolume){
        condition = startCondition;
        if(startCondition == true){
            currentChannel = startCurrentChannel;
            volume = startVolume;
        }
        else{
            currentChannel=0;
            volume=0;
        }
        defaultVolume = 15;
        serialNumber = startSerialNumber;
        technicalChannel = 13;
        numberOfChannels = startNumberOfChannels;
        maxVolume = startMaxVolume;
    }

    //parameterless constructor
    public Television(){
        this.condition = true;
        this.currentChannel = 1;
        this.volume = 4;
        this.serialNumber = 0;
        this.numberOfChannels = 90;
        maxVolume = 40;
    }

    //method turn on the TV
    public void turnOn(){
        condition = true;
        currentChannel = 10;
        volume = defaultVolume;
    }

    //method turn off the TV
    public void turnOff(){
        condition = false;
        currentChannel = 0;
        volume = 0;
    }

    //method to change the channel within the range of 1 to the maximum number of channels
    public void changeChannel(int newChannel){
        if(!condition){
            System.out.println("First, turn on the TV to perform this action!");
        }
        else if (newChannel >= 1 && newChannel <= numberOfChannels) {
            currentChannel = newChannel;
            System.out.println("Changed to channel: " + currentChannel);
        }
        else{
            System.out.println("Incorrect channel!");
        }
    }

    //method for changing the volume within a range from 0 to the maximum volume
    public void changeVolume(int newVoulme){
        if(!condition){
            System.out.println("First, turn on the TV to perform this action!");
        }
        else if(newVoulme <= maxVolume && newVoulme >=0){
            volume = newVoulme;
            System.out.println("Changed volume to: "+ volume);
        }
        else{
            System.out.println("Incorrect voulme!");
        }
    }

    //method to volume up by 1
    public void volumnUp(){
        if(!condition){
            System.out.println("First, turn on the TV to perform this action!");
        }
        else if(volume < maxVolume){
            volume++;
            System.out.println("Volume:" + volume);
        }
        else{
            System.out.println("You have reached maximum volume!");
        }
    }

    //method to voulme down by 1
    public void volumnDown(){
        if(!condition){
            System.out.println("First, turn on the TV to perform this action!");
        }
        else if(volume >0){
            volume--;
            System.out.println("Volume:" + volume);
        }
        else{
            System.out.println("You have reached minimum volume!");
        }
    }

    //method to channel up by 1
    public void ChannelUp(){
        if(!condition){
            System.out.println("First, turn on the TV to perform this action!");
            return;
        }
        if(currentChannel == numberOfChannels){
            currentChannel = 1;
        }
        else if(currentChannel + 1 == technicalChannel){
            currentChannel=currentChannel+2;
        }
        else{
            currentChannel++;
        }

        System.out.println("Current channel: " + currentChannel);
    }

    //method to channel down by 1
    public void ChannelDown(){
        if (!condition) {
            System.out.println("First, turn on the TV to perform this action!");
            return;
        }
        if (currentChannel <= 1) {
            currentChannel = numberOfChannels;
        }
        else if (currentChannel - 1 == technicalChannel) {
            currentChannel =currentChannel- 2;
        }
        else {
            currentChannel--;
        }
        System.out.println("Current channel: " + currentChannel);
    }

    //method for changing the technical channel
    public void changeTechnicalChannel(int newTechnicalChannel){
        technicalChannel =newTechnicalChannel;
    }

    //method for quieting the voice
    public void muteVoice(){
        volume=0;
    }
}
