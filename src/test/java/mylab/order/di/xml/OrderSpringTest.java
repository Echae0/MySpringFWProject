package mylab.order.di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderSpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mylab-order-di.xml");

        System.out.println("ShoppingCart 테스트:");
        ShoppingCart cart = context.getBean("shoppingCart", ShoppingCart.class);
        System.out.println(cart);
        System.out.println("총합: " + cart.getTotalPrice() + "원");

        System.out.println("\nOrderService 테스트:");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        System.out.println("주문 총액: " + orderService.calculateOrderTotal() + "원");
    }
}