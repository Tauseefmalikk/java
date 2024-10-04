class phone{
    public void call()
    {
        System.out.println("Phone call");
    }
    public void sms()
    {
        System.out.println("Send Sms");
    }


}
interface Icamera{
    void click();
    void record();

}

interface Imusicplayer{
    void play();
    void pause();
    void resume();
}

class smartphone extends phone implements Icamera,Imusicplayer{
    public void videocall(){
        System.out.println("video call");
    }
    public void click()
    {
        System.out.println("click photo");
    }
    public void record()
    {
        System.out.println("record video");
    }
    public void play()
    {
        System.out.println("play music");
    }
    public void pause()
    {
        System.out.println("pause music");
    }
    public void resume()
    {
        System.out.println("resume music");
    }

}




public class interfaces2 {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
        sp.record();
    }
    
}
