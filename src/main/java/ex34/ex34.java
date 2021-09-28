package ex34;

public class ex34 {
    public static void main(String... args) {
        System.out.println("\nExercise 34");

        List<String> employee_list = new ArrayList<>();
        employee_list.add("John Smith");
        employee_list.add("Jackie Jackson");
        employee_list.add("Chis Jones");
        employee_list.add("Amanda Cullen");
        employee_list.add("Jeremy Goodwin");


        System.out.println("There are " + employee_list.size() + " employees: ");

        for (String emp : employee_list) {
            System.out.println(emp);
        }


        System.out.print("\nEnter an employee name to remove: ");
        String emp_name = in.nextLine();
        employee_list.remove(emp_name);

        System.out.println("\nThere are " + employee_list.size() + " employees: ");
        for (String emp : employee_list) {
            System.out.println(emp);
        }
    }
}
