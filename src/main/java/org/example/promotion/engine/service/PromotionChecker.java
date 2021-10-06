package org.example.promotion.engine.service;

import java.util.List;

/**
 * This code is for Promotion Checker and calculate total product counts and their costs.
 *
 */

public class PromotionChecker {
    //returns PromotionID and count of promotions
    public static double GetTotalPrice(Order ord, Promotion prom)
    {
        double d = 0;
        //get count of promoted products in order
        int copp = ord.products.stream()
                .map(x -> x.id)
                .filter(grp -> prom.productInfo.Any(y=>grp.Key==y.Key && grp.Count()>=y.Value))
                .Select(grp=> grp.Count())
                .Sum();

        int totalPriceOfA = (((counterOfA / 3)
                * 130)
                + (counterOfA % (3 * priceOfA)));
        int totalPriceOfB = (((counterOfB / 2)
                * 45)
                + (counterOfB % (2 * priceOfB)));
        int totalPriceOfC = (counterOfC * priceOfC);
        int totalPriceOfD = (counterOfD * priceOfD);
        return (totalPriceOfA
                + (totalPriceOfB
                + (totalPriceOfC + totalPriceOfD)));
        for(Product product : ord.products ){

        }
        //get count of promoted products from promotion
        int ppc = prom.productInfo.Sum(kvp=> kvp.Value);
        while(copp>= ppc)
        {
            d +=  prom.promoPrice;
            copp -= ppc;
        }
        return d;
    }
}
