public class Main {
    public static void main(String[] args) {

        /**
         * Задание 1
         */

        int num = 0;
        while(num <= 50){
            if (num % 3 == 0){
                System.out.println(num);
            }
            num++;
        }
        /**
         * Задание 2
         */

        int result = 0;
        for(int numTwo = 0;numTwo <= 100; numTwo++)
        {
            result = result + numTwo;
            System.out.println(result);
        }

    }
}