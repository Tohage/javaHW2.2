public class Main {
    public static void main(String[] args) {
        System.out.println("Расчет колличества бонусных рублей");

        int onTheClientAccount = 300;
        int replenishmentAccount = 1211;
        int totalAmountAccount = onTheClientAccount + replenishmentAccount;

        System.out.println("На счету у клиента - " + onTheClientAccount + " p");
        System.out.println("Пополнение счета на - " + replenishmentAccount + " p");

        if (replenishmentAccount >= 1100) {
            int bonus = replenishmentAccount / 100;

            System.out.println("Итого на счету - " + (totalAmountAccount + bonus) + " p");
            System.out.println("Начисленные бонусы - " + bonus + " p");
        } else {
            System.out.println("Итого на счету - " + totalAmountAccount + " p");
            System.out.println("Начисленные бонусы - 0 p");

        }

    }
}