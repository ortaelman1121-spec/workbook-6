package com.pluralsight.finance;
import java.math.BigDecimal;


//fixed assets will represent assests such as
//houses, jewelery
public abstract class FixedAsset implements Valuable {


    //store the description of our asset
    private String description;

    //contructor runs when i create a fixedasset object
    //string description is a parameter that receives text
    public FixedAsset(String description) {

        this.description = description;
    }

    // This method returns the monetary value of an asset
    // House and Jewelry will provide their own implementation
    // Because this method is abstract, it has no method body

    @Override
    public abstract BigDecimal getValue();




}
