package interviewQuestions;

public class TestNumber {

    //i/p = 12345, 15, 6



    public  static  void main(String args[] ){
        int num= 12345;

        addNumbers(num, 0);


    }


    public  static void addNumbers(int num ,int s){


         if(num<10 && num>0){
             System.out.println(num);
                return ;


          }


        int r;


        while (num>0){

            int addition;
             r = num%10;
             s= s+r;
             num= num/10;

             addition=s;

        }
     //   System.out.println(addition);

        addNumbers(s,0);






















    }


}
