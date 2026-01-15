package assessment2026.oops;




class  MyMainEmployee{

    private int id;
    private String name;


    public  MyMainEmployee(){

        id =45;
        name = "Your- Name - Here";


    }

    public  MyMainEmployee(String name){


        this.name = name;


    }
    public  MyMainEmployee(String name, int id){
        this.id= id;

        this.name = name;


    }
    void setId(int i ){
        id = i;


    }

    void setName(String name){

        this.name=name;
    }

    int getId(){

        return id;

    }
    String getName(){


        return name;
    }



}



public class TestConstructors005 {


    public static void main(String[] args) {

        MyMainEmployee potter = new MyMainEmployee();

        MyMainEmployee harry = new MyMainEmployee("Mishra");
        MyMainEmployee anjali = new MyMainEmployee("pochuBeta", 30);

         System.out.println(harry.getId());
         System.out.println(harry.getName());
        System.out.println(anjali.getId());
        System.out.println(anjali.getName());
        System.out.println(potter.getId());
        System.out.println(potter.getName());





    }
}
