import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rf = new RandomAccessFile("E:/Java and DSA/Java/Files IO Stream/Files/RandomAccessFile.txt", "rw");
        /*File contents: A, B, C, D, E, F, G, H, I, J */

        // At the start file pointer is at 0
        System.out.println((char)rf.read()); // at 0, it read, now after reading pointer will point to next element i.e 1
        System.out.println((char)rf.read()); // at 1, it read, now after reading pointer will point to next element i.e 2
        System.out.println((char)rf.read()); // at 2, it read, now after reading pointer will point to next element i.e 3
        rf.write('d'); // at 3, it overwrote the data at 4, i.e. 'D' by 'd' , now after reading pointer will point to next element i.e 4
        System.out.println((char) rf.read()); // at 4, it read, now after reading pointer will point to next element i.e 5
        rf.skipBytes(3); // at 5, it skipped three bytes from 5, i.e. 5, 6, and 7 are skipped, now pointer is at 8
        System.out.println((char) rf.read()); // at 8, it read, now after reading pointer will point to next element i.e. 9
        rf.seek(3); // at 9, we seek or change the position of pointer to index 3
        System.out.println((char) rf.read()); // at index 3, it read (d), after reading pointer will point to next element i.e. 4
        System.out.println( rf.getFilePointer()); // at 4, we get the FilePointer location, which prints to 4, after that it doesn't increment because no read and write is done.
        rf.seek(rf.getFilePointer() + 1); // at 4, we incremented the filePointer by 1, file pointer will point to 5
        System.out.println(rf.getFilePointer()); // printed the file pointer which is 5, it still points to 5
        System.out.println((char) rf.read()); // printed the element at index 5
    }
}
