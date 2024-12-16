public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Циклы\"\n");

        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 5
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4){
            System.out.println(year + " год является високосным");
        }
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //Задача 8
        System.out.println("Задача 8");
        int jar = 0;
        int salary = 29000;
        for (int i = 0; i < 12; i++){
            jar = jar + salary;
            System.out.println("Месяц " + (i+1) +", сумма накоплений равна " + jar +" рублей");
        }
        System.out.println();

        //Задача 9
        System.out.println("Задача 9");
        double bank = 0;
        salary = 29000;
        for (int i = 0; i < 12; i++){
            bank = bank*1.01 + salary;
            System.out.println("Месяц " + (i+1) +", сумма накоплений равна " + Math.round(bank*100.0)/100.0 +" рублей");
        }
        System.out.println();

        //Задача 10
        System.out.println("Задача 10");
        int firstMultiplier = 2;
        int result;
        for (int secondMultiplier = 1; secondMultiplier <= 10; secondMultiplier++){
            result = firstMultiplier * secondMultiplier;
            System.out.println(firstMultiplier + "*" + secondMultiplier + "=" + result);
        }
    }
}