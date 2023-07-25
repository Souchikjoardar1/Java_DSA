class Phone
{
    void call()
    {
        System.out.println("hey make a call!!");
    }
    void message()
    {
        System.out.println("text me !!");
    }
}
interface Camera
{
    void click();// abstract methods
    void record();
}
interface Musicplayer
{
    void play();
    void pause();
    void stop();
}
public class Smartphone extends Phone implements Camera,Musicplayer
{
    void videocall()
    {
        System.out.println("make a video call");
    }
    public void click()
    {
        System.out.println("clicked a photo");
    }
    public void record()
    {
        System.out.println("recorded a video");
    }
    public void play()
    {
        System.out.println("playing a song");
    }    
    public void pause()
    {
        System.out.println("music paused ");
    }
    public void stop()
    {
        System.out.println("music stopped");
    }
    void take_pic(Camera c)
    {
        System.out.println("clicking pics using camera reference c");
        c.click();
    }
    void play_music(Musicplayer m)
    {
        System.out.println("playing music using musicplayer reference m");
        m.play();
    }
    void make_call(Phone p)
    {
        System.out.println("making a call using phone reference p");
        p.call();
    }
    public static void main(String[] A) 
    {
    Smartphone s=new Smartphone();
    Phone p=s;
    Camera c=s;
    Musicplayer m=s;
    s.call();
    s.videocall();
    s.click();
    s.play();
    s.pause();
    s.take_pic(c);
    s.play_music(m);
    s.make_call(p);
    }
}
