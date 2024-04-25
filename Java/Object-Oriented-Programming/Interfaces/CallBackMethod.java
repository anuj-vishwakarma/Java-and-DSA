interface  Member{
    public void callback();
    default void print(){
        System.out.println("Hi");
    }
}
class Store{
    Member members[] = new Member[10];
    int count = 0;
    Store(){

    }
    void register(Member m) {
        members[count++] = m;
    }
    void inviteSale(){
            for (int i = 0; i < count; i++) {
                members[i].callback();
            }
        }
}
class Customer implements Member{
    String name;
    Customer(String name){
        this.name = name;
    }
    @Override
    public void callback(){
        System.out.println("Ok, I'll visit\nRegards, \n"+name);
    }

}

public class CallBackMethod {
    public static void main(String[] args) {
        Store store = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Dohmingo");
        store.register(c1);
        store.register(c2);

        store.inviteSale();
    }
}
