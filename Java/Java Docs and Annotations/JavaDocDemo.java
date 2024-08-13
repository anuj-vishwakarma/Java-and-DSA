/** @author anuja
 * @version 1.0.0.0
 * @since 2024
 */

/**
 * @author anuja
 *
 * Class for Library Book
 */
class Book{
    /**
     * @value 10 default value
     */
    static  int val = 10;

    /**
     * Parameterized Constructor
     * @param s Book Name
     */
    public Book(String s){}

    /**
     * Issue a book to a student
     * @param rollNo Rool number of a student
     * @throws Exception If book is not available, throws exception
     */
    public void issue(int rollNo) throws  Exception{}

    /**
     * Check if book is available
     * @param str Book Name
     * @return if Book is available returns true, else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){
        return "";
    }

}
public class JavaDocDemo {
    public static void main(String[] args) {

    }
}
