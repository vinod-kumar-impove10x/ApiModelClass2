package com.example.apimodelclass;

import com.google.gson.annotations.SerializedName;

public class Money {
    @SerializedName("shop_money")
    private ShopMoney shopMoney;
    @SerializedName("presentment_money")
    private PresentmentMoney presentmentMoney;

}

class ShopMoney {
    @SerializedName("amount")
    private String amount;
    @SerializedName("currency_code")
    private String currencyCode;
}

class PresentmentMoney{
    @SerializedName("amount")
    private String amount;
    @SerializedName("currency_code")
    private String currencyCode;
}