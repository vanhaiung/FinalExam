package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanPTest {

    LoanP loanP = new LoanP("100", "Van", 1000.0, 2, "Personal");

    @Test
    void testObject() {
        assertEquals("Van", loanP.getClientName());
        assertEquals("Personal", loanP.getTypeOfLoan());
    }

    @Test
    void isEmpty() {
        loanP.setClientNumber(null);
        assertNotNull(loanP.getClientNumber());
    }
}