public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Task2
        System.out.println("\nTask 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Task3
        System.out.println("\nTask 3");
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }
}