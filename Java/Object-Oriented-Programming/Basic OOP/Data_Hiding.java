class NewRectangle {
    private int length;
    private int breadth;

    public void setLength( int l ) {
        if(l>0)
            length = l;
        else
            length = 0;
    }
    public int getLength() {
        return length;
    }

}
public class Data_Hiding {
    public static void main(String[] args) {
        NewRectangle r = new NewRectangle();
        r.setLength(    3);
        System.out.println(r.getLength());
    }
}
