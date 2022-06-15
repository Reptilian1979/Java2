import java.security.Principal;

public class Task2 {
    public static void main(String[] args) {
        int accountAmount = 50;
        int payment = 1021;
        boolean necessaryBonus = payment >= 1000;
        int bonus = necessaryBonus ? (payment / 100) : 0;
        System.out.println("Сумма на счете: " + (accountAmount + payment + bonus));
        System.out.println("Из них начисленных бонусов: " + bonus);
    }
}
