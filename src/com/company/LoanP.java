package com.company;

public class LoanP {

    private String clientNumber;
    private String clientName;
    private double loanAmount;
    private int numberOfYears;
    private String typeOfLoan;

    public LoanP(String clientNumber, String clientName, double loanAmount, int numberOfYears, String typeOfLoan) {
        this.clientNumber = clientNumber;
        this.clientName = clientName;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.typeOfLoan = typeOfLoan;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public String getTypeOfLoan() {
        return typeOfLoan;
    }

    public void setTypeOfLoan(String typeOfLoan) {
        this.typeOfLoan = typeOfLoan;
    }
}
