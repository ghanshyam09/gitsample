import java.util.*;
class student 
{
    String name;
    int id ;
    String dept;
      
    student(String name, int id, String dept) 
    {
          
        this.name = name;
        this.id = id;
        this.dept = dept;
          
    }
}
  

class Department {

    String name;
    private List<student> st;

    Department(String name, List<student> st) {

        this.name = name;
        this.st = st;

    }

    public List<student> getstudents() {
        return st;
    }
}


class Aggregation {
    public static void main(String[] args) {
        student s1 = new student("ABC", 1, "CSE");
        student s2 = new student("DEF", 2, "CSE");
    

        List <student> ST = new ArrayList<student>();
        ST.add(s1);
        ST.add(s2);
 
        Department CSE = new Department("CSE", ST);

       
    }
}
