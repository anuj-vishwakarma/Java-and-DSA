import org.w3c.dom.ls.LSOutput;

class Phone {
    public void call() {
        System.out.println("Phone Call");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}
    interface ICamera{
        void click();
        void record();
    }
    interface IMusicPlayer{
        void play();
        void pause();
    }
    class SmartPhone extends Phone implements ICamera,IMusicPlayer{
        public void videoCall(){
            System.out.println("SmartPhone video calling");
        }
        public void click(){
            System.out.println("SmartPhone clicking Photo");
        }
        public void record(){
            System.out.println("Smartphone recording video");
        }
        public void play(){
            System.out.println("Smartphone playing music");
        }
        public void pause(){
            System.out.println("Smartphone paused music");
        }

    }

public class Example2 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
            sp.click();
            sp.record();
            sp.play();
            sp.pause();
            sp.sms();
            sp.call();
            sp.videoCall();

        Phone p = sp; // Phone reference is used, i.e. We're referring the smartphone for the use of a phone, so we'll only be able to
        // use the methods available for phone i.e. Call and Sms
//        Analogy: If your friend takes Phone of yours and says I'to call then he must only call and that's why only call and sms methods
//        are available

//See the beauty of object-oriented programming we've the object of smarthphone only and by using different references we can use the
//smartphone,for different use

            p.call();
            p.sms();


        ICamera c = sp;// similar analogy as above
            c.click();
            c.record();

        IMusicPlayer m = sp;
            m.play();
            m.pause();


    }
}
