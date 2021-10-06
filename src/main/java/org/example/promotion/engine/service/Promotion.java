package org.example.promotion.engine.service;

import java.util.Map;
/**
 * This code is for product and their Promotions.
 *
 */

public class Promotion {
    public int promotionID;
    public Map<String, Integer> productInfo;
    public double promoPrice;

    public Promotion(int promotionID, Map<String, Integer> productInfo, double promoPrice)
    {
        this.promotionID = promotionID;
        this.productInfo = productInfo;
        this.promoPrice = promoPrice;
    }

    public int getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(int promotionID) {
        this.promotionID = promotionID;
    }

    public Map<String, Integer> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(Map<String, Integer> productInfo) {
        this.productInfo = productInfo;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }
}
