package ex35;

public class ex35 {
    public static void main(String... args) {

        System.out.println("\nExercise 35");

        List<String> winner_list = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name: ");
            String team_name = in.nextLine();
            if (team_name.length() < 2) {
                break;
            } else {
                winner_list.add(team_name);
            }

        }
        int rnd_winner = (int) ((Math.random() * (winner_list.size())));
        System.out.println("The winner is " + winner_list.get(rnd_winner));

    }
}