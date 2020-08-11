package com.company;

public class Personal extends LoanP implements Generate{

    private final double INTEREST_RATE = 0.06;

    public Personal(String clientNumber, String clientName, double loanAmount, int numberOfYears, String typeOfLoan) {
        super(clientNumber, clientName, loanAmount, numberOfYears, typeOfLoan);
    }

    private double computeMonthlyPersonal() {
        double monthlyRate = INTEREST_RATE / 12;
        double termInMonths = getNumberOfYears() * 12; // computed by multiplying the years with 12

        double monthlyPayment = (getLoanAmount()*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));

        return monthlyPayment;
    }

    @Override
    public void generateTable() {

    }
}
