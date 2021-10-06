package org.example.promotion.engine.service;

import java.util.List;

public class ProductService implements IProductService{
    @Override
    public void GetPriceByType(Product product) {
        switch (product.getId())
        {
            case "A":
                product.price = 50;

                break;
            case "B":
                product.price = 30;

                break;
            case "C":
                product.price = 20;

                break;
            case "D":
                product.price = 15;
                break;
        }

    }

    @Override
    public int GetTotalPrice(List<Product> products) {
        int counterOfA = 0;
        int priceOfA = 50;
        int counterOfB = 0;
        int priceOfB = 30;
        int counterOfC = 0;
        int priceOfC = 20;
        int counterOfD = 0;
        int priceOfD = 15;

        for(Product pr : products)
        {
            switch (pr.id)
            {
                case "A":
                case "a":
                    counterOfA += 1;
                    break;
                case "B":
                case "b":
                    counterOfB += 1;
                    break;
                case "C":
                case "c":
                    counterOfC += 1;
                    break;
                case "D":
                case "d":
                    counterOfD += 1;
                    break;
            }
        }
        int totalPriceOfA = (counterOfA / 3) * 130 + (counterOfA % 3 * priceOfA);
        int totalPriceOfB = (counterOfB / 2) * 45 + (counterOfB % 2 * priceOfB);
        int totalPriceOfC = (counterOfC * priceOfC);
        int totalPriceOfD = (counterOfD * priceOfD);
        return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;
    }
}
