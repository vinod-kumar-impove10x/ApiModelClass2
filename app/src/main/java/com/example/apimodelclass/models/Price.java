package com.example.apimodelclass.models;

import com.google.gson.annotations.SerializedName;

public class Price {

    private String amount;
    @SerializedName("currency_code")
    private String currencyCode;
}
