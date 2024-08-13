import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingContentInAFile {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("E:/Java and DSA/Java/File IO Stream files/Test2.txt")) {

            String str = "Best example of buffer: \nHere in India, not everyone takes bath in shower we take bucket to store water and then bath. \n" +
                    "Now if you kept a bucket inside the tap you'll not start bathing even when the water level is low nor you'll do if the bucket is full, we used to do it when water gets filled up to some level (say half) then we start taking bath it's because our speed of bath is fast and the water from tap is slow, so the bucket acts as buffer and when we bath the bucket kept filling and the you can bath freely without wasting time because of overflow nor you're waiting to fill the bucket and then start bath again. \n";

            byte [] b = str.getBytes();
//            fos.write(b);

//            for(byte x : str.getBytes() /* or b only */)
//                fos.write(x);

            fos.write(b, 0, 52);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
