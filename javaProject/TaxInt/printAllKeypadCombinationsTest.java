package TaxInt;

public class printAllKeypadCombinationsTest {


    public static String[] keypad= {
            ".",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tu",
            "vwx",
            "yz"

    };


    public  static void printCombination(String s, int idx, String combination){

        if(idx==s.length()){

            System.out.println(combination);
            return;


        }
        char currChar=s.charAt(idx);
        String mapping =keypad[currChar-'0'];
      for(int i=0;i<mapping.length();i++){

            printCombination(s,idx+1,combination+mapping.charAt(i));

        }

    }
    public static void main(String args []){
        String s="23";
        printCombination(s,0,"");
    }

}



/*
*
* printCombination(idx=0, combination="")  ← ENTER
│
├─ currChar='2', mapping="def"
│
├─ i=0 → 'd'
│  └─ printCombination(idx=1, combination="d")  ← ENTER
│     │
│     ├─ currChar='3', mapping="ghi"
│     │
│     ├─ i=0 → 'g'
│     │  └─ printCombination(idx=2, combination="dg")  ← ENTER
│     │     ├─ idx == length → PRINT "dg"
│     │     └─ RETURN
│     │
│     ├─ back to idx=1, combination="d", i=0 done
│     │
│     ├─ i=1 → 'h'
│     │  └─ printCombination(idx=2, combination="dh")  ← ENTER
│     │     ├─ PRINT "dh"
│     │     └─ RETURN
│     │
│     ├─ back to idx=1, combination="d", i=1 done
│     │
│     ├─ i=2 → 'i'
│     │  └─ printCombination(idx=2, combination="di")  ← ENTER
│     │     ├─ PRINT "di"
│     │     └─ RETURN
│     │
│     └─ EXIT printCombination(idx=1, combination="d")
│
├─ back to idx=0, combination="", i=0 done
│
├─ i=1 → 'e'
│  └─ printCombination(idx=1, combination="e")  ← ENTER
│     │
│     ├─ i=0 → 'g'
│     │  └─ printCombination(idx=2, combination="eg")
│     │     ├─ PRINT "eg"
│     │     └─ RETURN
│     │
│     ├─ i=1 → 'h'
│     │  └─ printCombination(idx=2, combination="eh")
│     │     ├─ PRINT "eh"
│     │     └─ RETURN
│     │
│     ├─ i=2 → 'i'
│     │  └─ printCombination(idx=2, combination="ei")
│     │     ├─ PRINT "ei"
│     │     └─ RETURN
│     │
│     └─ EXIT printCombination(idx=1, combination="e")
│
├─ back to idx=0, combination="", i=1 done
│
├─ i=2 → 'f'
│  └─ printCombination(idx=1, combination="f")  ← ENTER
│     │
│     ├─ i=0 → 'g'
│     │  └─ printCombination(idx=2, combination="fg")
│     │     ├─ PRINT "fg"
│     │     └─ RETURN
│     │
│     ├─ i=1 → 'h'
│     │  └─ printCombination(idx=2, combination="fh")
│     │     ├─ PRINT "fh"
│     │     └─ RETURN
│     │
│     ├─ i=2 → 'i'
│     │  └─ printCombination(idx=2, combination="fi")
│     │     ├─ PRINT "fi"
│     │     └─ RETURN
│     │
│     └─ EXIT printCombination(idx=1, combination="f")
│
└─ EXIT printCombination(idx=0, combination="")

*
*
*
*
*
*
* */
