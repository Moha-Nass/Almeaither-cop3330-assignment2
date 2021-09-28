package ex33;

public class ex33 {
    public static void main(String... args) {
        System.out.println("\nExercise 33");
        String choices[] = {"Yes", "No","Maybe", "Ask again later"};

        int selection = (int)(Math.random()*4+1);
        System.out.println("What is your question? ");
        String question = in.next();
        System.out.print(choices[selection-1]);

    }
}