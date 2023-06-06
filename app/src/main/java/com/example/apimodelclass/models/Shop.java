package com.example.apimodelclass.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Shop {

    @SerializedName("_id")
    private String serverId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private  String adminGraphqlApiId;
    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private  boolean buyerAcceptsMarketing;
    @SerializedName("cancel_reason")
    private String cancelReason;
    @SerializedName("cancelled_at")
    private String cancelledAt;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Integer checkoutId;
    @SerializedName("checkout_token")
    private String checkoutToken;
    //Todo; another class
    @SerializedName("client_details")
    private ClientDetails clientDetails;
    @SerializedName("closed_at")
    private String closedAt;
    @SerializedName("confirmed")
    private boolean confirmed;
    @SerializedName("created_at")
    private String createdAt;
    private String currency;
    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;
    @SerializedName("current_subtotal_price_set")
    private PriceSet currentSubtotalPriceSet;
    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;
    @SerializedName("current_total_discounts_set")
    private PriceSet currentTotalDiscountsSet;
    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;
    @SerializedName("current_total_price")
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    private PriceSet currentTotalPriceSet;
    @SerializedName("current_total_tax")
    private String currentTotalTax;
    @SerializedName("current_total_tax_set")
    private PriceSet currentTotalTaxSet;
    @SerializedName("customer_locale")
    private String customerLocale;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("discount_codes")
    private ArrayList<String> discountCodes;
    @SerializedName("estimated_taxes")
    private boolean estimatedTaxes;
    @SerializedName("financial_status")
    private String financialStatus;
    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;
    private String gateway;
    @SerializedName("landing_site")
    private String landingSite;
    @SerializedName("landing_site_ref")
    private String landingSiteRef;
    @SerializedName("location_id")
    private String locationId;
    private String name;
    private String note;
    @SerializedName("note_attributes")
    private ArrayList<String> noteAttributes;
    private Integer number;
    @SerializedName("order_number")
    private Integer orderNumber;
    @SerializedName("order_status_url")
    private String orderStatusUrl;
    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;
    @SerializedName("payment_gateway_names")
    private ArrayList<String > paymentGatewayNames;
    @SerializedName("presentment_currency")
    private String presentmentCurrency;
    @SerializedName("processed_at")
    private String processedAt;
    @SerializedName("processing_method")
    private String processingMethod;
    private String reference;
    @SerializedName("referring_site")
    private String referringSite;
    @SerializedName("source_identifier")
    private String sourceIdentifier;
    @SerializedName("source_name")
    private String sourceName;
    @SerializedName("source_url")
    private String sourceUrl;
    @SerializedName("subtotal_price")
    private String subtotalPrice;
    @SerializedName("subtotal_price_set")
    private PriceSet subtotalPriceSet;
    private String tags;
    @SerializedName("taxes_included")
    private boolean taxesIncluded;
    private boolean test;
    private String token;
    @SerializedName("total_discounts")
    private String totalDiscounts;
    @SerializedName("total_discounts_set")
    private PriceSet totalDiscountsSet;
    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;
    @SerializedName("total_line_items_price_set")
    private PriceSet totalLineItemsPriceSet;
    @SerializedName("total_outstanding")
    private String totalOutstanding;
    @SerializedName("total_price")
    private String totalPrice;
    @SerializedName("total_price_set")
    private PriceSet totalPriceSet;
    @SerializedName("total_price_usd")
    private String totalPriceUsd;
    @SerializedName("total_shipping_price_set")
    private PriceSet totalShippingPriceSet;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("total_tax_set")
    private PriceSet totalTaxSet;
    @SerializedName("total_tip_received")
    private String totalTipReceived;
    @SerializedName("total_weight")
    private Integer totalWeight;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("discount_applications")
    private ArrayList<String> discountApplications;
    @SerializedName("fulfillments")
    private ArrayList<String> fulfillments;
    @SerializedName("line_items")
    public ArrayList<LineItems> lineItems;
    @SerializedName("payment_terms")
    private String paymentTerms;
    private ArrayList<String> refunds;


}

