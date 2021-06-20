class Employee {
    int id,salary;
    String name;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
interface IEmployee {
    Employee getdetails(int id);
}

class Employeedataaccess implements IEmployee {
    
    public Employee getdetails(int id) {
        return new Employee(id, "name", 30000);
    }
}

class DataAccess {
    public static IEmployee getdetailsObj() {
        return new Employeedataaccess();
    }
}

class Bal {
    IEmployee details;

    public IEmployee getEmployeeDetails(int id) {
        details = DataAccess.getdetailsObj();
        details.getdetails(id);
        return details;
    }
}