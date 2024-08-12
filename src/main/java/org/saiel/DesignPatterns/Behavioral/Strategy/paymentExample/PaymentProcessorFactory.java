package org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample;

import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies.CreditCardPaymentStrategy;
import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies.DebitCardPaymentStrategy;
import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies.PaypalPaymentStrategy;
import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies.UpiPaymentStrategy;

public class PaymentProcessorFactory {
    public static PaymentStrategy getCalculatorStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case PaymentType.CREDIT_CARD : return CreditCardPaymentStrategy.getInstance();
            case PaymentType.PAYPAL : return new PaypalPaymentStrategy();
            case PaymentType.UPI : return new UpiPaymentStrategy();
            case PaymentType.DEBIT_CARD : return DebitCardPaymentStrategy.getInstance();
        }
        return null;
    }
}
