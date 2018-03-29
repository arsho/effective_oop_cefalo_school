package com.cefalo.school.instrument;

public interface Instrument {
    public void setFinancialOrganizationName(String financialOrganizationName);
    public void setCustomerName(String customerName);
    public void setInstrumentType(InstrumentType instrumentType);
    public InstrumentType getInstrumentType();
    public String getCustomerName();
    public String getFinancialOrganizationName();
}
