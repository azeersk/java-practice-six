import javax.imageio.ImageTranscoder;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class basicPractice {

//    public static void fibonacciSeries(int a){
//        int first = 0;
//        int second = 1;
//        System.out.print(first + " ");
//        if (a>1){
//            for(int i=2; i<=a; i++){
//                System.out.print(second + " ");
//                int sum = second;
//                second = first + second;
//                first = sum;
//            }
//        }
//        return;
//    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        int d = a+b+c;
//        System.out.println("average: "+d/3);
//        int a = input.nextInt();
//        int oddSum = 0;
//        for(int i=1; i<=a; i++){
//            if (i%2!=0){
//                oddSum = oddSum + i;
//            }
//        }
//        System.out.println(oddSum);

//        int first = input.nextInt();
//        int second = input.nextInt();
//        if(first>second){
//            System.out.println(first);
//        }
//        else{
//            System.out.println(second);
//        }
//        System.out.print("Enter Radius of the circle: ");
//        int radius = input.nextInt();
//        double circumference = 2*3.14*radius;
//        System.out.println(circumference);

//        int age = input.nextInt();
//        if(age>=18){
//            System.out.println("Voter is eligible to vote!");
//        }
//        else{
//            System.out.println("Not eligible to vote!");
//        }
//        int i = 2;
//        do{
//            System.out.println("infinity loop using do while!");
//        }while (i>0);


//        int a = input.nextInt();
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        for(int i=0; i<a; i++){
//            int number = input.nextInt();
//            if(number>0){
//                positive = positive + 1;
//            }
//            else if(number<0){
//                negative = negative + 1;
//            }
//            else{
//                zero = zero + 1;
//            }
//        }
//        System.out.println(positive);
//        System.out.println(negative);
//        System.out.println(zero);

//        int base = input.nextInt();
//        int power = input.nextInt();
//        double result = Math.pow(base,power);
//        System.out.println(result);

//        int a = input.nextInt();
//        fibonacciSeries(a);
        int a = input.nextInt();
        int b = input.nextInt();

        while(a != b) {
            if (a > b) {
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        System.out.println("GDC: "+ b);

    }
}
