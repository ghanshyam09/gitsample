class Paysalary {
    public float calculatesalary() {
        System.out.println("calcuate salary");
        return 0;
    }

    
}

class Details extends Paysalary{
    public void Timecarddetails() {
        System.out.println("total Card details");

    }
}
class Hourlysalary extends Details{

    public void Timecarddetails() {
        System.out.println("Hourly Card details");

    }
}

class Commisionsalary extends Paysalary{
    public float calculatesalary() {
        System.out.println("calcuate salary");
        return 0;
    }
}

public class Liskov {
    public static void main(String[] args) {
        Paysalary p = new Commisionsalary();
        p.calculatesalary();
    }

}
//for this create interfaces with common methods