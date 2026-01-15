package assessment2026.oops;


class  Cylinder{

   private int radius;
    private  int height;


    Cylinder(int radius, int height){

         this.radius=radius;
         this.height= height;

    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

   public double surfaceArea(){

        return 2*3.14* radius*radius+ 2*3.14*radius*height;
   }

    public double volume(){

        return Math.PI* radius*radius*height;
    }


}


 class Rectangel{

    int length;
    int breadth;


    public Rectangel(){

        this.length=4;
        this.breadth=5;

    }

    public Rectangel(int length, int breadth){

       this.length= length;
       this.breadth= breadth;

    }

     public int getLength() {
         return length;
     }

     public void setLength(int length) {
         this.length = length;
     }

     public int getBreadth() {
         return breadth;
     }

     public void setBreadth(int breadth) {
         this.breadth = breadth;
     }
 }


public class TestAccessModifies006 {





    public static void main(String[] args) {

        // problem 1
         Cylinder myCyl = new Cylinder(4, 5);
        // myCyl.setHeight(22);
        // myCyl.getHeight();

         //System.out.println(myCyl.getHeight());

        // myCyl.setRadius(35);
         System.out.println(myCyl.getRadius());
        System.out.println(myCyl.surfaceArea());
        System.out.println(myCyl.volume());
        System.out.println(myCyl.getHeight());

         //problem 2

        Rectangel r = new Rectangel(12,56);

        System.out.println(r.getBreadth());
        System.out.println(r.getLength());





    }
}
