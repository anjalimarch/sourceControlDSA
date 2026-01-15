package assessment2026.oops;


class Employee{

    int id;
    String name;
    int salary;

    public void printDetails(){

        System.out.println( "My Id --"+id);
        System.out.println("My Name --"+name);

    }

    public int getSalary(){

        return salary;
    }


}







public class TestClassCustom001 {



    public static void main(String args []){
        Employee harry = new Employee();
        harry.id=12;
        harry.name= "Mishra";
        harry.salary=3000000;


        harry.printDetails();
      int sal=  harry.getSalary();
      System.out.println(sal);




    }


}
