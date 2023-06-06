package com.example.apimodelclass.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TaxLines {

    @SerializedName("channel_liable")
    private boolean channelLiable;
    private String price;
    @SerializedName("price_set")
    private PriceSet priceSet;
    private Float rate;
    private String title;
}
