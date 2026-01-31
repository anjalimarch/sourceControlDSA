package assessment2026.selenium;

public class PagingNationTest {




   static int totalPages(int total, int size){

      if(total%size==0){

          return total/size;

      }else

          return (total/size)+1;

   }

   static int recordsCountOnLastPage(int total, int size ){

       if(total%size==0){

           return  size;

       }

       return total%size;



   }

   static int startInd(int page, int size){

      return  (page-1)*size+1;


   }

   static int lastInd(int page, int size,int total){

       return Math.min(page*size,total);

   }

   static boolean dynamicXpath(String s){

     for  (char c : s.toCharArray()){
         if(Character.isDigit(c))

             return true;


     }

     return false;
   }

   static boolean dynamicXpathAdv(String s){

         return s.matches(".*\\d+.*");


   }





    public static void main (String args []){

        // how many pages are required
        // how many records on lst page

        int totalRecords = 45;
        int pageSize =10;

        /*
        *
        *
        * 45 / 10 = 4 full pages
       Remaining = 5 → need 1 more page
        Total = 5
       */
        int p=    totalPages(45,10);
        System.out.println("pages --"+p);

        int lastPageRecords = recordsCountOnLastPage(45,10);

        int startIndofPage = startInd(3, 10);

        int lastInd= lastInd(3,10,45);

        boolean dynam= dynamicXpath("//div[@div='product_7890']");
        boolean resDyna= dynamicXpathAdv("//div[@div='product_7890']");

    }

}
