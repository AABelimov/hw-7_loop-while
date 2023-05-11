public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1(){
        int contrib = 15000;
        int sum = 0;
        int month = 0;

        System.out.println("Task1:");
        while(sum < 2_459_000){
            month++;
            sum += contrib;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", month, sum);
        }
    }

    public static void task2(){
        int count = 0;

        System.out.println("Task2:");
        while(count < 10){
            count++;
            System.out.printf("%d ", count);
        }

        System.out.println();
        for(; count >= 1; count--) System.out.printf("%d ", count);
        System.out.println();
    }

    public static void task3(){
        double population = 12_000_000.0;
        double bornInThousand = 0.017;
        double diesInThousand = 0.008;
        int year = 0;

        System.out.println("Task3:");
        while(year < 10){
            year++;
            population = population + (population * bornInThousand) - (population * diesInThousand);
            System.out.printf("Год %d, численность населения составляет %.0f\n", year, population);
        }
    }

    public static void task4(){
        int month = 0;
        double sum = 15000.0;

        System.out.println("Task4:");
        while(sum < 12_000_000.0){
            month++;
            sum *= 1.07;
            System.out.printf("Месяц %d, сумма %.2f\n", month, sum);
        }
    }

    public static void task5(){
        int month = 0;
        double sum = 15000.0;

        System.out.println("Task5:");
        while(sum < 12_000_000.0){
            month++;
            sum *= 1.07;
            if(month % 6 == 0) System.out.printf("Месяц %d, сумма %.2f\n", month, sum);
        }
    }

    public static void task6(){
        int month = 0;
        double sum = 15000.0;

        System.out.println("Task6:");
        while(month < 9 * 12){
            month++;
            sum *= 1.07;
            if(month % 6 == 0) System.out.printf("Месяц %d, сумма %.2f\n", month, sum);
        }
    }

    public static void task7(){
        int friday = 3;

        System.out.println("Task7:");
        while(friday <= 31){
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday += 7;
        }
    }

    public static void task8(){
        int givenYear = 2023;
        int startYear = givenYear - 200;
        int endYear = givenYear + 100;
        int year = 0;

        System.out.println("Task8:");
        while(year <= endYear){
            year += 79;
            if(year >= startYear && year <= endYear){
                System.out.println(year);
            }
        }
    }
}