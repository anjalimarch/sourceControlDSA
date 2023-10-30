package PackageName;

public class MoveAllXToendTest {

    public static void main(String args []){

        String s = "axbxcbxdxddbca";
        moveXtoEnd(s, 0, "",0);

    }
    public static void moveXtoEnd(String s, int idx,String newS,int count){

        if(idx==s.length()){

            for(int i=0;i<count; i++){


                newS=newS+'x';



            }
            System.out.println(newS);
            return;


        }

    if(s.charAt(idx)!='x'){

          moveXtoEnd(s, idx+1,newS+s.charAt(idx), count);


       }else{

            count= count +1;
            moveXtoEnd(s, idx+1,newS, count);

          }


    }
}
