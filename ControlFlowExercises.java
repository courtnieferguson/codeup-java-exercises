public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 5;

        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }


        int counter = 0

        do {
            System.out.println(counter);
            counter += 2;
            counter = counter + 2;
        }while (counter <= 100);

        int backwardsCounter = 100;

        do {
            System.out.println(backwardsCounter);
            backwardsCounter -= 5;

        }while (backwardsCounter >= -10);

        for (int i = 100; i >= -10; i -= 5) {
        System.out.println(i);
        }

//        long counter = 2L;
//
//        do {
//            System.out.println(twoCounter);
//            twoCounter *= twoCounter;
//            teoCounter = twoCounter * twoCounter;
//        }while (twoCounter < 1000000L);


        for (long i = 2L; i < 1000000L; i *= i) {
            System.out.println(i);
        }



    }
}
