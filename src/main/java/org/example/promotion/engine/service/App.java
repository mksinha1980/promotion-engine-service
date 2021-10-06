package org.example.promotion.engine.service;

import java.util.*;

/**
 * This code is for Promotion Engine code test.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //create list of promotions
        //we need to add information about Product's count
        Map<String, Integer> d1 = new HashMap<>();
        d1.put("A", 3);

        Map<String, Integer> d2 = new HashMap<>();
        d2.put("B", 2);

        Map<String, Integer> d3 = new HashMap<String, int>();
        d3.put("C", 1);
        d3.put("D", 1);

        List<Promotion> promotions = Arrays.asList(new Promotion(1, d1, 130),
                new Promotion(2, d2, 45),
                new Promotion(3, d3, 30));

        //create orders
        List<Order> orders = new ArrayList<>();

        Order order1 = new Order(1, Arrays.asList(new Product("A"), new Product("A"), new Product("B"), new Product("B"), new Product("C"), new Product("D"));
        Order order2 = new Order(2, Arrays.asList(new Product("A"), new Product("A"), new Product("A"), new Product("A"), new Product("A"), new Product("A"),  new Product("B"));
        Order order3 = new Order(3, Arrays.asList( new Product("A"), new Product("A"), new Product("D"), new Product("B"), new Product("B"));
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        //check if order meets promotion
        for(Order ord : orders)
        {
            List<Double> promoprices = promotions
                    .Select(promo => PromotionChecker.GetTotalPrice(ord, promo))
                    .ToList();
            double origprice = ord.products.Sum(x=>x.Price);
            double promoprice = promoprices.Sum();
            "OrderID: {ord.OrderID} => Original price: {origprice.ToString("0.00")} | Rebate: {promoprice.ToString("0.00")} | Final price: {(origprice - promoprice).ToString("0.00")}");
            System.out.println();
        }
    }
}
