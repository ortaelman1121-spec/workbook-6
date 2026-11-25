package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset {

    // Constructor for the House class
// A constructor has the same name as its class
// It runs when we create a new House object

    private BigDecimal value;

// TODO Write a public constructor named House
// TODO For now, give it one String parameter named description

    public House(String description, BigDecimal value) {
        //calls the parents costructor
        super(description);
        this.value = value;
    }

    // This method will return the monetary value of the house
    // implementing the getValue() method from FixedAsset
    @Override
    public BigDecimal getValue() {
        return this.value;
    }

}
