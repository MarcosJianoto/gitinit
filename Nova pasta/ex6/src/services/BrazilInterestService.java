package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestRate{

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

}
