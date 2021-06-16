var b="Hello world"
console.log(b);

var employee = {
  id: 1,
  name: "ALbert",
  salary: 30000,
  calculatepf() {
    return 0.12 * employee.salary;
  }
}
console.log(employee.calculatepf())


class Bank{
  id: number;
  name: string;
  salary:number
  constructor(id,name,salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
  getloanapproved() {
    if (this.salary < 5000) {
      return false;
    } else {
      return true;
   }
 }
}
var bank = new Bank(1, "ABC", 30000);
console.log(bank.getloanapproved());


class Department{
  id: number;
  constructor(id) {
    this.id = id;
  }
}
class CSE extends Department{
  name: string;
  roll: number;
  constructor(name, roll,id) {
    super(id);
    this.name = name;
    this.roll = roll;
  }
}
var student = new CSE("scott", 1, 101);
console.log(student.id);

interface student{
  firstname:string;
  lastname: string;
}
class A implements student{
  firstname;
  lastname
}