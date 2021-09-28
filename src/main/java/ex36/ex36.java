package ex36;

public class ex36 {
    public static void main(String... args) {

        System.out.print("Numbers: ");

        for(int i6=0;i6< counter;i6++) {
            System.out.print(myIntArray[i6] + " ");
        }

        System.out.println("\nThe average is: " + (double)sum/(double)(counter));
        System.out.println("The minimum is "+ min);
        System.out.println("The maximum is "+ max);


        double standardDeviation = 0.0;
        double mean = (double)sum/(double)(counter);

        for(double num: myIntArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        double std = Math.sqrt(standardDeviation/counter);
        System.out.print("The standard deviation: " + std);


    }
}