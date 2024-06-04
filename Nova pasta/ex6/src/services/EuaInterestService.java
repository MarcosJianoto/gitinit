package services;

import java.security.InvalidParameterException;

public class EuaInterestService implements InterestRate {

    private double interestRate;

    public EuaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

}
