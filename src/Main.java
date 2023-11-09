public class Main {
    public static void main (String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        System.out.println("Сумма кредита: 1 000 000 рублей");
        System.out.println("Срок кредита: 1 год");
        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1_000_000,12));

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 рублей");
        System.out.println("Срок кредита: 2 года ");
        System.out.println("Ежемесячный платеж:");
        System.out.println(service.calculate(1_000_000,24));

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 рублей");
        System.out.println("Срок кредита: 3 года ");
        System.out.println("Ежемесячный платеж: ");
        System.out.println(service.calculate(1_000_000,36));
    }
}
