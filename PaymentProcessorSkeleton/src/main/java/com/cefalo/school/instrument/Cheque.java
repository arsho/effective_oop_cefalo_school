package com.cefalo.school.instrument;
public class Cheque implements Instrument{
    private String financialOrganizationName;
    private String customerName;
    private InstrumentType instrumentType;
    private String checkNumber;
    private String checkBankName;

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCheckBankName() {
        return checkBankName;
    }

    public void setCheckBankName(String checkBankName) {
        this.checkBankName = checkBankName;
    }

    @Override
    public void setFinancialOrganizationName(String financialOrganizationName) {
        this.financialOrganizationName = financialOrganizationName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    @Override
    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getFinancialOrganizationName() {
        return this.financialOrganizationName;
    }
    
}
