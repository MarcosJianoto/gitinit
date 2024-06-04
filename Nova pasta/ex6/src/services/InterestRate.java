package services;

import java.security.InvalidParameterException;

public interface InterestRate {

    public double getInterestRate();

    default double payment(double amount, int months) {

        if (months < 1) {
            throw new InvalidParameterException("Please digit new number, more than 0");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, months);

    }

}
