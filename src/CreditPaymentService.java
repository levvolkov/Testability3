public class CreditPaymentService {
   public double calculate(double credit, double time) {
       double percent = 9.99 / 100 / 12;
       double payment = credit * (percent / (1 -Math.pow(( 1+ percent), -time)));
return (int) payment;
   }
}
