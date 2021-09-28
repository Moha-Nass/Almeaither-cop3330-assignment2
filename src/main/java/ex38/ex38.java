package ex38;

public class ex38 {
    public static void main(String... args) {
        System.out.print("\nExercise 38\n");
        System.out.print("Enter a list of numbers separated by space: ");
        String str38 = in.nextLine();
        String []arr = str38.split(" ");

        int[] num = new int[100];

        for (int i8 = 0; i8 < arr.length; i8++) {
            num[i8] = Integer.parseInt(arr[i8]);
        }

        filterEvenNumber(num,arr.length);

    }
}
