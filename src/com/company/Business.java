package com.company;

public class Business extends LoanP  implements Generate {

    private final double INTEREST_RATE = 0.09;

    public Business(String clientNumber, String clientName, double loanAmount, int numberOfYears, String typeOfLoan) {
        super(clientNumber, clientName, loanAmount, numberOfYears, typeOfLoan);
    }

    private double computeMonthlyBusiness() {
        double monthlyRate = INTEREST_RATE / 12;
        double termInMonths = getNumberOfYears() * 12; // computed by multiplying the years with 12

        double monthlyPayment = (getLoanAmount()*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));

        return monthlyPayment;
    }

    @Override
    public void generateTable() {

    }
}
