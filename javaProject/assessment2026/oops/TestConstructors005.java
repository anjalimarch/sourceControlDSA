package assessment2026.oops;




class  MyMainEmployee{

    private int id;
    private String name;


    public  MyMainEmployee(){

        id =45;
        name = "Your- Name - Here";


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

        MyMainEmployee harry = new MyMainEmployee();

       System.out.println(harry.getId());
       System.out.println(harry.getName());





    }
}
