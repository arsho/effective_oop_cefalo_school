/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cefalo.school.instrument;

/**
 *
 * @author cefalo
 */
public class Bkash implements Instrument{
    private String financialOrganizationName;
    private String customerName;
    private InstrumentType instrumentType;
    private String mobileNumber;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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
