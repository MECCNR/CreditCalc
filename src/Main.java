// Ваш банк выдаёт кредиты с сроком от 3ёх месяцев до 5ти лет
// Выдадим ему проценты (сейчас это 23 процента)
// Сумма кредита указывается в creditsum (рубли), а длительность указывается в месяцах (months)

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditsum = 1000000;
        int months = 12;
        double monthly = service.calculate(creditsum, months);
        int result = (int) monthly;
        System.out.println("Ваш ежемесячный платёж составляет: " + result);

        creditsum = 888888;
        months = 5;
        monthly = service.calculate(creditsum, months);
        result = (int) monthly;
        System.out.println("Ваш ежемесячный платёж составляет: " + result);

        creditsum = 50000;
        months = 8;
        monthly = service.calculate(creditsum, months);
        result = (int) monthly;
        System.out.println("Ваш ежемесячный платёж составляет: " + result);
    }
}
