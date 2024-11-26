//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("\nЗадача 1:");
        int targetSumSavings=2459000;
        int monthlySavings=15000;
        int months=0;
        int sumSavings=0;
        for (;sumSavings<=targetSumSavings;sumSavings+=monthlySavings) {
            months++;
        }
        System.out.println("Целевая сумма сбережений: " + targetSumSavings);
        System.out.println("Ежемесячный взнос: " + monthlySavings);
        System.out.println("Месяц " + months + ", сумма накоплений равна " + sumSavings + " рублей");

        //Задача 2
        System.out.println("\nЗадача 2:");
        int i=1;
        while (i<=10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i=10;i>0;) {
            System.out.print(i-- + " ");
        }
        System.out.println();

        //Задача 3
        System.out.println("\nЗадача 3:");
        int populationY=12000000;
        int popGrowth=17;
        int popDecline=8;
        for (int y=1;y<=10;y++) {
            populationY+=(popGrowth-popDecline)*populationY/1000;
            System.out.println("Год " + y + ", численность населения составляет " + populationY);
        }

        //Задача 4
        System.out.println("\nЗадача 4:");
        double monthlyInterestVasily=0.07;
        int sumSavingsVasily=15000;
        int month=1;
        int targetSumVasily=12000000;
        while (sumSavingsVasily<targetSumVasily) {
            sumSavingsVasily*=(1+monthlyInterestVasily);
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + sumSavingsVasily);
        }

        //Задача 5
        System.out.println("\nЗадача 5:");
        sumSavingsVasily=15000;
        month=0;
        while (sumSavingsVasily<targetSumVasily) {
            sumSavingsVasily *= (1 + monthlyInterestVasily);
            if (month++ % 6 == 5) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sumSavingsVasily + " рублей");
            }
        }

        //Задача 6
        System.out.println("\nЗадача 6:");
        int targetYears=9;
        sumSavingsVasily=15000;
        for (month=1;month<=12*targetYears;month++) {
            sumSavingsVasily *= (1 + monthlyInterestVasily);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sumSavingsVasily + " рублей");
            }
        }

        //Задача 7
        System.out.println("\nЗадача 7:");
        int firstFriday=6;
        for (int d=firstFriday;d<=31;d+=7) {
            System.out.println("Сегодня пятница, " + d + "-е число. Необходимо подготовить отчет");
        }

        //Задача 8
        System.out.println("\nЗадача 8:");
        int cometPeriod=79;
        int thisYear=2024;
        for (int cometYear=0;cometYear<=thisYear+100;cometYear+=cometPeriod) {
            if (cometYear>=thisYear-200) {
                System.out.println(cometYear);
            }
        }
    }
}