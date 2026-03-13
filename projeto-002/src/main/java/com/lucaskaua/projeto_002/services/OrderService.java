package com.lucaskaua.projeto_002.services;

import com.lucaskaua.projeto_002.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total (Order order) {
        double total = order.getBasic() - order.getBasic() * order.getDiscount() / 100.0;

        return total + shippingService.shipment(order);
    }
}
