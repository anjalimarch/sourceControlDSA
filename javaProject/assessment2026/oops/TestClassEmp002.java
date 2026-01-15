package assessment2026.oops;




class NewEmployee{

   int salary;
   String name;
   public int getSalary(){

       return  salary;

   }

   public String getName(){

       return name;
   }

   public String setName(String n){

       name=n;

       return name;

   }

}


class CellPhone{
    public void ringing(){

        System.out.println("Ringing ...");
    }
   public void vibrating (){

        System.out.println("Vibrating ...");

   }

   public void callFriend(){
       System.out.println("Calling a friend..");


   }


}

class Square{

    int side;
    public int area(){

        return side*side;
    }

    public int perimeter(){


        return 4*side;
    }



}


class Tommy {

    public void hit(){
        System.out.println("hitting the enemy");

    }
   public void run(){

        System.out.println("Running from enemy");
   }
   public void fire(){

        System.out.println("Firing the enemy ");


   }


}



public class TestClassEmp002 {

   // create a class with following with properties.

    //empolyee
    //salary
    //getSalary
    //name
    //getName
    //setName

    public static void main(String[] args) {
        NewEmployee harry = new NewEmployee();
        harry.setName("Anjali");
        harry.salary= 40000;

        System.out.println(harry.getName());
        System.out.println(harry.getSalary());


        //problem 2

        CellPhone iphone = new CellPhone();

        iphone.callFriend();
        iphone.ringing();
        iphone.vibrating();

        Square sq = new Square();

        //problem 3
        sq.side=3;

        int a = sq.area();
        int p = sq.perimeter();

        System.out.println(a);
        System.out.println(p);

        //problem 4
        Tommy t = new Tommy();
        t.fire();
        t.hit();
        t.run();







    }



}
