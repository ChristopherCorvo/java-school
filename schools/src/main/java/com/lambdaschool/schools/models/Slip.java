package com.lambdaschool.schools.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Slip
{
    //----------- Class fields ------------
    private String advice;

    // ---------- Getter and Setters ---------
    public String getAdvice()
    {
        return advice;
    }

    public void setAdvice(String advice)
    {
        this.advice = advice;
    }

    // --------- Additional Methods ------------

//    @Override
//    public String toString()
//    {
//        return super.toString();
//    }
}
