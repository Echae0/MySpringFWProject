package mylab.customer;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import mylab.cusotmer.service.CustomerService;
import mylab.customer.vo.CustomerVo;

@SpringJUnitConfig(locations = "classpath:spring-beans.xml")
public class CustomerSpringTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void testInsertAndSelectCustomer() {
        CustomerVo customer = new CustomerVo(1, "홍길동", "hong@example.com");
        customerService.insertCustomer(customer);

        CustomerVo retrieved = customerService.getCustomerInfo(1);
        assertNotNull(retrieved);
        assertEquals("홍길동", retrieved.getName());
        assertEquals("hong@example.com", retrieved.getEmail());
    }

    @Test
    public void testSelectAllCustomers() {
        List<CustomerVo> customers = customerService.getAllCustomerList();
        assertNotNull(customers);
        assertTrue(customers.size() > 0);
    }
}