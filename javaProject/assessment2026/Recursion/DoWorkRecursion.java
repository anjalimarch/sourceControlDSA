package assessment2026.Recursion;

public class DoWorkRecursion {

    static void doWork(int x) {

        System.out.println("ENTER doWork(" + x + ")");

        // base case
        if (x == 2) {
            System.out.println("BASE reached at x = " + x);
            System.out.println("RETURN from doWork(" + x + ")");
            return;
        }

        // loop inside recursion
        for (int i = 0; i < 2; i++) {
            System.out.println("  Loop i = " + i + " in doWork(" + x + ")");
            doWork(x + 1);
            System.out.println("  Back to loop i = " + i + " in doWork(" + x + ")");
        }

        System.out.println("EXIT doWork(" + x + ")");
    }

    public static void main(String[] args) {
        doWork(0);
    }
}


/*
*
*
*
*
*
* doWork(x=0)  ← ENTER
│
├─ i=0
│  └─ doWork(x=1)  ← ENTER   (0 + 1)
│     │
│     ├─ i=0
│     │  └─ doWork(x=2)  ← ENTER   (1 + 1)
│     │     └─ RETURN (x=2)  ← BASE
│     │
│     ├─ back to doWork(x=1), i=0 done
│     │
│     ├─ i=1
│     │  └─ doWork(x=2)  ← ENTER   (1 + 1)
│     │     └─ RETURN (x=2)  ← BASE
│     │
│     └─ EXIT doWork(x=1)
│
├─ back to doWork(x=0), i=0 done
│
├─ i=1
│  └─ doWork(x=1)  ← ENTER   (0 + 1)
│     │
│     ├─ i=0
│     │  └─ doWork(x=2)  ← ENTER   (1 + 1)
│     │     └─ RETURN (x=2)  ← BASE
│     │
│     ├─ back to doWork(x=1), i=0 done
│     │
│     ├─ i=1
│     │  └─ doWork(x=2)  ← ENTER   (1 + 1)
│     │     └─ RETURN (x=2)  ← BASE
│     │
│     └─ EXIT doWork(x=1)
│
└─ EXIT doWork(x=0)

*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */