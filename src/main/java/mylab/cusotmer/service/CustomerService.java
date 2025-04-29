package mylab.cusotmer.service;

import java.util.List;
import mylab.customer.vo.CustomerVo;

public interface CustomerService {
    CustomerVo getCustomerInfo(int id);
    List<CustomerVo> getAllCustomerList();
    void insertCustomer(CustomerVo customer);
}