package com.cefalo.school;

import com.cefalo.school.instrument.Bkash;
import com.cefalo.school.instrument.DebitCard;
import com.cefalo.school.instrument.Cheque;
import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.instrument.InstrumentType;
import com.cefalo.school.processor.PaymentProcessor;

public class Main {
    public  static  void main(String[] args){
        System.out.println("Hello");
        Instrument instrument = new DebitCard();
        instrument.setInstrumentType(InstrumentType.Card);
        Instrument instrument1 = new Cheque();
        instrument1.setInstrumentType(InstrumentType.Cheque);
        Instrument instrument2 = new Bkash();
        instrument2.setInstrumentType(InstrumentType.MobilePayment);
        PaymentProcessor processor = new PaymentProcessor();
        try{
            processor.process(instrument, 100);
            processor.process(instrument1, 100);
            processor.process(instrument2, 100);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
