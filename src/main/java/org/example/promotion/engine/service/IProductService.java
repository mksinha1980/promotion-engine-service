package org.example.promotion.engine.service;

import java.util.List;
/**
 * This code is for product interface.
 *
 */

public interface IProductService {
    void GetPriceByType(Product product);
    int GetTotalPrice(List<Product> products);
}
