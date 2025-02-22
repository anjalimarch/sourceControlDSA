package interviewQuestions;

public class questionTwo {
    public static void main(String args [])
    {

        //0,1,1,2,3,5,8
        int first=0;
        int second= 1;
        System.out.println(first);
        System.out.println(second);
        printFib(0,1, 8);

    }

    public static  void printFib(int a, int b,int n){
        int c=a+b;
        if(n==c){
            System.out.println(c);
            return;

        }

        a=b;
        b=c;
        //c=a+b;
        System.out.println(c);
        printFib(a,b,n);







    }

}
