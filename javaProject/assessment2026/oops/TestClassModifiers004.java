package assessment2026.oops;




class  MyEmployee{

    private int id;
    private String name;



    void setId(int id ){
        this.id = id;


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



public class TestClassModifiers004 {


    public static void main(String[] args) {

        MyEmployee harry = new MyEmployee();

        harry.setId(3);
        harry.setName("Anjali");



           int id = harry.getId();
           String name= harry.getName();
           System.out.println(id+"--"+name);


    }



}
