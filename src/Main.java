public class Main {
    public static void main(String[] args) {
        //exercise 1
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};

        boolean[] myArray = new boolean[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random() > 0.5;
        }

        //exercise 2
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ((i != intArray.length - 1) ? ", " : "\n"));
        }

        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i] + ((i != doubleArray.length - 1) ? ", " : "\n"));
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ((i != myArray.length - 1) ? ", " : "\n"));
        }
        System.out.println();

        //exercise 3
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + ((i != 0) ? ", " : "\n"));
        }

        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.print(doubleArray[i] + ((i != 0) ? ", " : "\n"));
        }

        for (int i = myArray.length - 1; i >= 0 ; i--) {
            System.out.print(myArray[i] + ((i != 0) ? ", " : "\n"));
        }
        System.out.println();

        //exercise 4
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0)
                intArray[i] += 1;
            System.out.print(intArray[i] + ((i != intArray.length - 1) ? ", " : "\n"));
        }
    }
}