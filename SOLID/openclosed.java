interface Bankreceipts {
    void transactions();
}

class Bankk implements Bankreceipts{
    public void transactions() {
        ///show transactions of each one who implements this method
    }
}
///open close
class Customer implements Bankreceipts {
    public void transactions() {
        ///show transactions of each one who implements this method
    }
}
//Integration Seegregation principle

public class openclosed {
    public static void main(String[] args) {
        Customer m = new Customer();
    }
}
