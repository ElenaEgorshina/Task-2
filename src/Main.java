public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int initial = 50; // начальный счет
        int add = 1200; // сумма пополнения
        int bonus; // бонус начисляется за каждые 100 руб.
        int total; // итоговая сумма

        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус:");
        System.out.println(bonus = add / 100);
        System.out.println("Итоговая сумма:");
        System.out.println(total = initial + add + bonus);

    }
}