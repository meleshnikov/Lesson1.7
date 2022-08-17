public class Main {
    public static void main(String[] args) {
        //Task1
        System.out.println("Task 1");
        String firstName = "семён";
        String middleName = "семёнович";
        String lastName = "семёнов";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("ФИО сотрудника — " + fullName);

        //Task2
        System.out.println("\nTask 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Task3
        System.out.println("\nTask 3");
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

        //Task4
        System.out.println("\nTask 4");
        fullName = fullName.trim(); // отбрасывем пустые символы в начале и в конце навсякий случай
        char ch = ' ';
        fullName = fullName.replaceAll("\\s+", String.valueOf(ch)); // заменяем пустоты между словами на ch = ' '

        //1 вариант
        int firstIndex = fullName.indexOf(ch); // находим индекс, где заканчивается фамилия и начинается имя
        int lastIndex = fullName.lastIndexOf(ch); // находим индекс, где кончается имя и начинается отчество
        String lName = fullName.substring(0, firstIndex);
        String fName = fullName.substring(firstIndex + 1, lastIndex);
        String mName = fullName.substring(lastIndex + 1);

        /*
        //2 вариант
        String[] flmNames = fullName.split(String.valueOf(ch));
        lName = flmNames[0];
        fName = flmNames[1];
        mName = flmNames[2];
         */

        //печатаем
        System.out.println("Имя сотрудника — " + fName);
        System.out.println("Фамилия сотрудника — " + lName);
        System.out.println("Отчество сотрудника — " + mName);

        //Task5
        System.out.println("\nTask 5");
        char[] fullNameChars = fullName.toCharArray();
        fullNameChars[0] = Character.toUpperCase(fullNameChars[0]);
        for (int i = 1; i < fullNameChars.length - 1; i++) {
            if (fullNameChars[i] == ch) {
                fullNameChars[i + 1] = Character.toUpperCase(fullNameChars[i + 1]);
            }
        }
        fullName = new String(fullNameChars);
        System.out.println(fullName);
    }
}