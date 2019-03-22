public class megan_bonus {
    public static void main(String[] args) {




//        1) create three variables, start, end, and sum. Use a loop to find the summation of all the numbers between start and end (inclusive)

//        int start = 1;
//        int end = 10;
//        int sum = 0;
//        for(int i = start; i <= end; i+=1 ){
//            sum = sum + i;
//        System.out.println(sum);
//        }






//        2) write a loop which will output all the prime numbers (evenly divisible by only 1 and themselves) between 10 and 10000



    // From JavaCodeGeeks Example

//        int max = 100;
//
//        System.out.println("Generate Prime numbers between 1 and " + max);
//
//        // loop through the numbers one by one
//        for (int i = 1; i<max; i++) {
//
//            boolean isPrimeNumber = true;
//
//            // check to see if the number is prime
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrimeNumber = false;
//                    break; // exit the inner for loop
//                }
//            }
//
//            // print the number if prime
//            if (isPrimeNumber) {
//                System.out.print(i + " ");
//            }
//        }


//       long prime = 0;
//        for(long i = 0; i <= 13; i+=1){
//            if(i % i == 0){
//                System.out.println(i);
//            }
//        }





//        3) output a table representing the binary representations of the powers of 2
//        decimal       |       binary
//        1     |     00000001
//        2     |     00000010
//        4     |     00000100 (edited)


        int input=5;

        System.out.println("decimal | binary");
        System.out.println("------- | ------");
        for(int i = 1; i <= input; i++) {
            System.out.print(i + " "); //show integer
            System.out.println(Integer.toBinaryString(i) + " "); //show binary
        }



    }
}

