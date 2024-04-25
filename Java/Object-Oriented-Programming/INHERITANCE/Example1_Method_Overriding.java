class TV {
    public void switchOn() { System.out.println("TV is switched ON");}
    public void changeChannel() { System.out.print("TV channel has changed");}
}
class SmartTV extends TV {
    @Override
    public void switchOn() { System.out.println("SmartTV is switched ON");}

    @Override
    public void changeChannel() { System.out.println("SmartTV channel has changed");}
    public void browse(){ System.out.println("SmartTV is browsing");}
}
    public class Example1_Method_Overriding {
    public static void main(String[] args) {
        TV t = new TV();
        t.switchOn();
        t.changeChannel();
        System.out.println("\n");
        SmartTV st = new SmartTV();
        st.browse();
        st.changeChannel();
        st.switchOn();

        TV tv = new SmartTV();
        tv.changeChannel();
        tv.switchOn();
//        tv.browse();
//        is not possible because, you're using the reference of old TV, it means that you've the smart TV, but you don't know the
//        smart features it has (browsing here) because you're using the reference of an old TV. That's why the tv.browse is not
//        available i.e. you can't use the browse function even it has because you're using the reference of old TV
    }
}
