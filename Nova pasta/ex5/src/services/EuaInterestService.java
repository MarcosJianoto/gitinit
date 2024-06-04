package services;

public class EuaInterestService implements NterestService {

    private double interestRate;

    public EuaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
