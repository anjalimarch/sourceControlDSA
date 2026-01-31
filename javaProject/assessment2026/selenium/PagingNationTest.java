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
   static int countNth(String [] s ){
       int count =0;

       for(String a: s){

           if (a.contains("nth-child"))
                 count ++;

       }

       return count;

   }


   static String longestXpath(String [] a ){

       String max ="";
       for(String s: a){


          if(s.length()>max.length())

                   max =s;

       }


       return max;
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
        System.out.println("lastPageRecords --"+lastPageRecords);
        int startIndofPage = startInd(3, 10);
        System.out.println("startIndofPage --"+startIndofPage);
        int lastInd= lastInd(3,10,45);
        System.out.println("lastInd --"+lastInd);
        boolean dynam= dynamicXpath("//div[@div='product_7890']");

        System.out.println("dynam --"+dynam);
        boolean resDyna= dynamicXpathAdv("//div[@div='product_7890']");

        System.out.println("resDyna --"+resDyna);
        String [] anth= {"div:nth-child(2)", "span", "li:nth-child(4)", "a"};
        int  nthChild= countNth(anth);

        System.out.println("nthChild --"+nthChild);

        String [] arr = {

                "//div",
                "//div/span/input",
                "//a"


        };

        String longXpath = longestXpath(arr);
        System.out.println("longXpath --"+longXpath);



    }

}
