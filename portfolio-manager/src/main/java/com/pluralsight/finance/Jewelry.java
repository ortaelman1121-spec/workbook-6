package com.pluralsight.finance;


import java.math.BigDecimal;

//inherit from parents class
public class Jewelry extends FixedAsset {

    //store the monetary value of this jewelry object
    private BigDecimal value;

    //construtor needs to receive 2 pieces of info, descrip and BigDecimal/money
    public Jewelry(String description, BigDecimal value) {
        //sends decrip to FixedAsset
        super(description);
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return this.value;
    }
}
