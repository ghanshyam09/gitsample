

class Person {
     int accountno;
     String name;

    Person(int no, String n) {
        accountno = no;
        name = n;
    }
}

class Bank {
    Person person;
    String IFSC;

    Bank(Person p, String code) {
        person = p;
        IFSC = code;
    }
}

class Printdetails {
    private Bank b;

    public Printdetails(Bank b) {
        this.b = b;
    }

    public void print() {
        System.out.println(b.IFSC + " " + b.person.name + " " + b.person.accountno + " $");

    }
}

class Solidp {
    public static void main(String[] args) {
        
    }
}


 
