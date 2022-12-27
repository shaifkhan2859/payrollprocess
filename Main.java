public class Main{
 public static void main(String[] args){
  EmployeStore e1 = new EmployeStore("SHAIFALI","CSE79CDCS","CSE",40000F,"SDE",88682263,"ABC");
  Employee ob1 = new Employee(e1);
  EmployeStore e2 = new EmployeStore("mohammad","CSE01CDCS","CSE",45000F,"Tech Lead",94168541,"XYZ");
  Employee ob2 = new Employee(e2);
  EmployeStore e3 = new EmployeStore("hashan","CSE02CDCS","CSE",60000F,"Project Manager", 66524445, "PQR");
  Employee ob3 = new Employee(e3);
  ob1.display();
  ob2.display();
  ob3.display();
 }
}
class EmployeStore{
  String name,address,design,dept,id;
  Float BasicSalary;
  long phNo;
 public EmployeStore(String name,String id,String dept,Float salary,String design,long phNo,String address){
    this.name = name;
    this.id = id;
    this.dept = dept;
    this.BasicSalary = salary;
    this.design = design;
    this.phNo = phNo;
    this.address = address;
 }
 public String getName(){
  return name;
 }
 public String getId(){
  return id;
 }
 public String getDept(){
  return dept;
 }
 public Float getSalary(){
  return BasicSalary;
 }
 public String getDesign(){
  return design;
 }
 public long getPhNo(){
  return phNo;
 }
 public String getAddress(){
  return address;
 }
}
class Employee{
 EmployeStore e;
 Float salary;
 Employee(EmployeStore e){
  this.e=e;
 }
 public String generateAccessKey(){
  int i=0;
  String name = this.e.getName();
  String s = name.substring(0,2)+ this.e.id.substring(this.e.id.length()-2) + this.e.dept.substring(0,2);
  return s.toUpperCase();
 }
 public double CalgrossSal(){
  Float baseSalary = this.e.getSalary();
  String design = this.e.getDesign();
  if(design.equals("SW")) salary = baseSalary + (50*baseSalary)/100;
  else if(design.equals("Tech Lead")) salary = baseSalary + (55*baseSalary)/100;
  else if(design.equals("Project Manager")) salary = baseSalary + (60*baseSalary)/100;
  else salary = baseSalary + (65*baseSalary)/100;
 
  return salary;
 }
 public void display(){
  System.out.println();
  System.out.println("Name = "+this.e.getName());
  System.out.println("Id = "+this.e.getId());
  System.out.println("Department =  "+this.e.getDept());
  System.out.println("Salary = "+this.CalgrossSal());
  System.out.println("Designation = "+this.e.getDesign());
  System.out.println("Contact number = "+this.e.getPhNo());
  System.out.println("Address =  "+this.e.getAddress());
  System.out.println("Access Key =  "+this.generateAccessKey());
  System.out.println("--------------------------------------");
 }
}