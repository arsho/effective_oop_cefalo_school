### Introduction ###

Now a days online activities more popular in our country. We all are using different types of online services for our daily needs. Every service has some sort of financial model by which it earns money. And when it comes to money, each service support different payment mechanism. The more option for payment you support, more likely to success your venture. 

Now in our country, there are several types of Payment mechanism.
*   Cash
*   Card
*   Mobile Payment
*   Cash on delivery.

### Problem ###
Each payment option have different properties but one thing is common, taking payment. We need to save the different properties also for future reference. Our goal is to create a system that will take any type of payment option and save it to future reference. We also need to adopt quickly new payment options without interfering our existing system.

### Helper interface ###
```
public interface IProcessor {
    public void process(Instrument instrument, double amount);
}

```

```
public interface Instrument {
    public void setFinancialOrganizationName(String financialOrganizationName);
    public void setCustomerName(String customerName);
    public void setInstrumentType(InstrumentType instrumentType);
    public InstrumentType getInstrumentType();
}
```


### Task ###
Define different instrument.

And then use that instrument in IProcessor

```aidl
Instrument debitCard = new DebitCard();

PaymentProcessor processor = new PaymentProcessor();
processor.process(debitCard, 2000);

```

### Design Goal ###
Design in a way that new instrument can be processed easily with rewriting or 
refactor minimal code.
            
      