public class exercise11 {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        // make it smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= e;
        // please cube of e's value
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2) {
            boolean bigger = true;
            System.out.println(bigger);
        } else {
            boolean bigger = false;
            System.out.println(bigger);
        }

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if ((2*g2) > g1) {
            boolean biggertrue = true;
            System.out.println(biggertrue);
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h % 11 == 0) {
            boolean divisor = true;
            System.out.println(divisor);
        } else {
            boolean divisor = false;
            System.out.println(divisor);
        }

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)





        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j % 3 == 0 || j % 5 == 0) {
            boolean dividable = true;
            System.out.println(dividable);
        } else {
            boolean dividable =false;
            System.out.println(dividable);

        }




        String k = "Apple";
        //fill the k variable with its cotnent 4 times


        System.out.println(k);
    }
}
