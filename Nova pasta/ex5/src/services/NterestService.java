package services;

import java.security.InvalidParameterException;

public interface NterestService {

    public double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("please, more than 0");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100, months);
    }
}
