import java.util.ArrayList;

class Phone1 {
    private String name;
    private ArrayList<Integer> contacts = new ArrayList<>();
    public void addContacts(int contact) {
        this.contacts.add(contact);
    }
    public int showContact(int contact){
        return this.contacts.get(this.contacts.indexOf(contact));
    }
}
interface MusicPlayer{
    private void print(){
        System.out.println("Hello");
    }
    default void playMusic(){
        System.out.println("Playing music");
    }
    default void pauseMusic(){
        System.out.println("Music paused");
    }
}
interface Camera{
    default void clickPicture(){
        System.out.println("Picture Clicked");
    }
    default void showPicture(){
        System.out.println("Showing Picture");
    }
}

class Smartphone extends Phone1 implements MusicPlayer, Camera{
    Smartphone (){

    }
}
public class Example3 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.addContacts(9);
        System.out.println(s.showContact(9));
        s.clickPicture();
        s.showPicture();
    }
}
