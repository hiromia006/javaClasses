package oops.interface1;

public class CityBank implements Bank {
    @Override
    public float getInterestRate() {
        return 11.25f;
    }

    public void givenLoan() {
        System.out.println("CityBank  provides Islamic Loan");
    }
}
