// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int check = 300;
        int add = 2500;
        int bonus = add / 100;
        if (add > 1000) {
            int sum = check + add + bonus;
            System.out.println("Начислено бонусов:" +bonus);
            System.out.println("Итоговая сумма на счету:" + sum);
        } else {
            int sum = check + add;
            System.out.println("Бонусов нет");
            System.out.println("Итоговая сумма на счету:" + sum);
        }
    }
}