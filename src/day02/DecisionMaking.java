package day02;

public class DecisionMaking {
    public static void main(String[] args) {


        //// Operators
        // Arithmetic operators +, -, * (multiplication), /(division), % (remaing)
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Relational operators
        // ==
        // <
        // >
        // >=
        // <=
        // !=

        // Logical operator
        // either or - ||
        // and - &&

        // Assignment - '='

        // Increment ++, decrement --
        int inc = ++a;// pre increment
        int dec = --b;
        System.out.println(inc);
        System.out.println(dec);
        System.out.println(a);
        System.out.println(b);
        int c = 50;
        System.out.println(c++);// post increment
        System.out.println(c);


        // 1. if --> voting
        int age = 21;
        System.out.println(18 <= age);
/*        if(COND){
            // STMT
        }*/
        if (18 <= age) {
            System.out.println("You are eligible to vote...");
        }

        // 2. if-else --> odd or even
        int number = 27;
        if ((number % 2) == 0) {
            System.out.println(number + " is even!!!");
        } else {
            System.out.println(number + " is odd!!!");
        }

        // 3. if-elseif-else --> Grading system => 80<-A, 60<-b, 40<-c, 40>-D
        int avg_mark = 40;
        if (avg_mark >= 80 && avg_mark <= 100) {
            System.out.println("A");
        } else if (avg_mark >= 60 && avg_mark < 80) {
            System.out.println("B");
        } else if (avg_mark >= 40 && avg_mark < 60) {
            System.out.println("C");
        } else if (avg_mark >= 0 && avg_mark < 40) {
            System.out.println("D");
        } else {
            System.out.println("Please provide valid!!!");
        }


        // 4. Switch - Electrical switch
        String turn_on = "fan";
        switch (turn_on) {
            case "fan":
                System.out.println("Fan is running!!!");
                break;
            case "light":
                System.out.println("Light is burning!!!");
                break;
            case "refridgerator":
                System.out.println("Refridgerator is running!!!");
                break;
            default:
                System.out.println("No Connection for this switch!!!");
                break;
        }

        // 5. for loop (count control)
        // for(start, condition, increment/decrement) { }
        // increment
        for (int f = 0; f <= 5; f++) {
            System.out.println(f);
        }
        // decrement
        // for(int f=5; f>=0; f--) {
        for (int f = 5; f > 0; f--) {
            System.out.println(f);
        }
        // Example: Swimming - 6hours
        for (int f = 6; f >= 0; f--) {
            if (f == 0) {
                System.out.println("Time Up!!!");
            } else {
                System.out.println(f + " hours left!!!");
            }
        }

        // 6. While (conditinal) - PVR Movie Ticket
        // while(condition) { }
        int no_of_movies_per_ticket = 4;
        int no_of_movies_watched = 0;
        while (no_of_movies_watched < no_of_movies_per_ticket) {
            no_of_movies_watched++;
            System.out.println("Watched my " + no_of_movies_watched + " movie!!!");
        }
        int no_movies_remaining = no_of_movies_per_ticket;
        while (no_movies_remaining != 0) {
            no_movies_remaining--;
            System.out.println("Movies count remaining: " + no_movies_remaining);
        }

        // 7. do-while - Cutting apples till getting rotten one
        int apples = 10;
        int rot_attempt = 7;
        boolean rotten = false;
        int attempt = 0;
        do {
            attempt++;
            System.out.println("Cutting the apple: " + attempt);
            if (rot_attempt == attempt) {
                rotten = true;
                System.out.println("Apple found rotten at attempt: " + attempt);
            }
        } while (!rotten && (apples > attempt));


    }
}
