package com.cefalo.school.processor;


import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.instrument.InstrumentType;

public class PaymentProcessor {
    public  void process(Instrument instrument, double amount) throws Exception{
        if(instrument.getInstrumentType().equals(InstrumentType.Card)){
            System.out.println("Payment by card");
        }
        else if(instrument.getInstrumentType().equals(InstrumentType.Cheque)){
            System.out.println("Payment by cheque");
        }
        else if(instrument.getInstrumentType().equals(InstrumentType.MobilePayment)){
            System.out.println("Payment by Mobile Payment");
        }
        else{
            System.out.println("Else executed");
        }
    }
    
    

    public void saveIntoDatabase(Instrument instrument, double amount){
        System.out.println("Saving data into database");
    }

}
