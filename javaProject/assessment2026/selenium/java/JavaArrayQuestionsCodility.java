package assessment2026.selenium.java;

import java.util.HashSet;
import java.util.Set;

public class JavaArrayQuestionsCodility {


static int largestNum(int [] a){

    int max =0;

    for(int i: a){
        if(i>max){

            max=i;


        }


    }

    return max;


}



static int evenNumCount(int [] a){

    int count =0;

    for(int i :a){
        if(i%2==0){
            count++;


        }



    }

    return count;


}


static void reverseanArray(int [] a, int i, int j){
    if(i>=j)

    {

        return ;
    }


    int temp = a[i];
    a[i]=a[j];
    a[j]= temp;

    reverseanArray(a, i+1, j-1);

}




  static int [] rotateAnArrayRightByK(int [] a, int k ){
     int n =a.length;
     k=k%n;

     int [] res = new int[n];


     for(int i=0; i<n; i++){

         int newInd= (i+k)%n;

         res[newInd]=a[i];


     }

     return res;


  }


//no recursion reverse an array

    static void reverseArrayNoRecursion(int [] a){

      int i =0; int j=a.length-1;

      while(i<j){

          int temp = a[i];
          a[i]=a[j];
          a[j]=temp;
          i++;
          j--;

      }




    }

static void printArray(int [] a){

    for(int k: a){

        System.out.println(k);

    }

}


static int sum(int [] a){
    int sum =0;

    for(int k : a){


        sum +=k;
    }

    return sum;

}


  static int countNegativeNum(int [] a){
        int count =0;
      for(int k : a){


          if(k<0){
              count++;


          }
      }
    return count;

  }


  static boolean isSorted(int [] a){

    boolean sorted= true;
     for (int i =0; i<a.length-1; i++){


         if(a[i]>a[i+1]){

             sorted= false;


         }


     }





    return sorted;
  }


  static int firstRepeatedElement(int [] a){

      Set seen = new HashSet<>();
      int firstRepeated =-1;

      for(int k : a){
          if(!seen.add(k)){

              firstRepeated= k;
              break;


          }



      }

      return firstRepeated;



  }


  static  int findMissingNum(int [] a){

    int n = a.length +1;
    int sum = n*(n+1)/2;
    for(int i : a){

        sum = sum -i;


    }

    return sum;

  }

  static int[] removeDuplicate(int [] a){

    Set<Integer> set = new HashSet<>();

    for(int x: a){



        set.add(x);


    }

    int [] res = new int[set.size()];
    int i =0;

    for (int k : set){
        res[i++]=k;


    }


    return res;

  }



   static int [] mergeTwoSortedArrays(int [] a, int [] b){

    int [] m = new int [a.length+b.length];

    int i =0 ;
    int j=0;
    int k =0;

     while (i<a.length &&j<b.length){

           if(a[i]<b[j]){

               m[k]= a[i];
               i++;
               k++;

           }else {

               m[k]= b[j];
               j++;
               k++;



           }


     }

       while (i<a.length){
           m[k]=a[i];
           i++;
           k++;


       }

       while (j<b.length){
           m[k]=b[j];
           j++;
           k++;


       }

     return m;

   }


   static int sumOfDigit(int n){
    int r;
       int s=0;
     while(n>0) {
         r = n % 10;
         s += r;
         n = n / 10;

     }

    return s;

   }


   static int revInt(int n){

       int r;
       int s=0;
       while(n>0) {
           r = n % 10;
           s=s*10+r;
           n = n / 10;

       }

       return s;




   }


   static boolean isPrimeNumber(int n ){

      for(int i =2; i<=Math.sqrt(n);i++){

          if (n%i==0){

              return false;

          }
          else{


              return true;
          }

      }


    return false;

   }

   static  int secondLargestInAnArray(int [] a){

       int max= a[0];
       int Smax= a[1];


       if(a[1]>a[0]){


           Smax= a[0];
           max= a[1];




       } else{

           max= a[0];
           Smax= a[1];


       }


       for(int i =2; i<a.length; i++){


           if(a[i]>max){
               Smax= max;
               max = a[i];




           }
           else  if(a[i]>Smax){
               Smax=a[i];



           }


       }

       return Smax;


   }



   static Set<Integer> intersection (int [] a, int [] b ){

      Set one = new HashSet<Integer>();
      Set two = new HashSet<Integer>();


      for(int k : a){

          one.add(k);




      }

      for(int j :b){

          if(one.contains(j)){

              two.add(j);





          }

      }



    return two;

   }


   static int countDistinct(int [] n ){

    Set <Integer> x = new HashSet<>();


    for(int k : n ){

        x.add(k);

    }

    return x.size();





   }

   static int kadanesAlgo(int [] input ){

    int currSum = input[0];
    int max = input[0];

    for(int i =1; i<input.length; i++){


        currSum= Math.max(input[i], currSum+input[i]);
        max =Math.max(max, currSum);


    }

    return max;


   }






public static void main(String args []){

      int [] a = {3,7,2,9,2};
     int [] input = {-3,7,-2,9,4};
     int [] check = {1,2,3,4,5,6};

     int [] ms = {1,2,4,5};
      int val = largestNum(a);
      //System.out.println(val);

      int val1= evenNumCount(a);
      //System.out.println(val1);

     // reverseanArray(a, 0,a.length-1);
      //printArray(a);
   //  reverseArrayNoRecursion(a);
   //  printArray(a);


     /*
     * ratate an array right by 2
     *
     * | Old Index | Value | New Index |
| --------- | ----- | --------- |
| 0         | 1     | 2         |
| 1         | 2     | 3         |
| 2         | 3     | 4         |
| 3         | 4     | 0         |
| 4         | 5     | 1         |

     *
     *
     *
     * */




    int [] result=   rotateAnArrayRightByK(a,2);
    // printArray(result);


     int res = sum(a);
    // System.out.println(res);

     int valp= countNegativeNum(input);
   //  System.out.println(valp);

  //  System.out.println( isSorted(check));
  //  System.out.println( firstRepeatedElement(a));
    //findMissingNum(ms);

   // System.out.println(   findMissingNum(ms));


    int [] d =    removeDuplicate(a);

     printArray(d);

     int [] one = {1,3,5};
     int [] two = {2,4,6};
    int [] three = {2,4,6,5,8,9};
    int [] interA= {2,4,6,5,8,9};
    int [] interB= {12,14,16,5,4,6};
    int [] countDis= {12,14,16,5,14,16,12};

     int [] merged = mergeTwoSortedArrays(one,two);
     printArray(merged);


     int n= 1234;
     sumOfDigit(n);

    revInt(n);
    int np = 7;

   System.out.println(isPrimeNumber(np));

    System.out.println(secondLargestInAnArray(three));
    System.out.println(intersection(interA,interB));

   ;

    System.out.println( countDistinct(countDis));
    int [] inputArray = {3,-2,5,-1};

      kadanesAlgo(inputArray);
    //largestSum

  System.out.println(kadanesAlgo(inputArray));







}




}
