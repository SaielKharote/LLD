package org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy payment1 = PaymentProcessorFactory.getCalculatorStrategy(PaymentType.CREDIT_CARD);
        payment1.makePayment(400);

        PaymentStrategy payment2 = PaymentProcessorFactory.getCalculatorStrategy(PaymentType.UPI);
        payment2.makePayment(900);

        PaymentStrategy payment3 = PaymentProcessorFactory.getCalculatorStrategy(PaymentType.DEBIT_CARD);
        payment3.makePayment(200);

    }
}
