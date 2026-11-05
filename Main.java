package englishVersion.Telewizor;

public class Main {
    public static void main(String[] args) {


        Television tele = new Television(true,2,3,132,90,40);
        Television tele1= new Television();
        Television tele2 = new Television(false,2,5,543,60,50);

        System.out.println(" TV Condition:" +tele.condition+", current channel:"+tele.currentChannel+", Tv volume:"+tele.volume);
        System.out.println(" TV Condition:" +tele1.condition+", current channel:"+tele1.currentChannel+", Tv volume:"+tele1.volume);
        System.out.println(" TV Condition:" +tele2.condition+", current channel:"+tele2.currentChannel+", Tv volume:"+tele2.volume);


        tele.changeChannel(100);
        tele1.changeChannel(60);
        tele2.changeChannel(4);

        tele.changeVolume(8);
        tele1.changeVolume(-6);
        tele2.changeVolume(6);

        System.out.println(" TV Condition:" +tele.condition+", current channel:"+tele.currentChannel+", Tv volume:"+tele.volume);
        System.out.println(" TV Condition:" +tele1.condition+", current channel:"+tele1.currentChannel+", Tv volume:"+tele1.volume);
        System.out.println(" TV Condition:" +tele2.condition+", current channel:"+tele2.currentChannel+", Tv volume:"+tele2.volume);

        tele.volumnUp();
        tele2.volumnDown();
        tele1.changeVolume(40);
        tele1.volumnUp();

        tele.changeChannel(12);
        tele.ChannelUp();

        tele1.changeTechnicalChannel(15);
        System.out.println("Current technical channel:"+ Television.technicalChannel);

        tele1.muteVoice();

        System.out.println(" TV Condition:" +tele1.condition+", current channel:"+tele1.currentChannel+", Tv volume:"+tele1.volume);
    }
}
