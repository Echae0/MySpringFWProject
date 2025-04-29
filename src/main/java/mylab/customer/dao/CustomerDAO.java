package mylab.customer.dao;

import java.util.List;
import mylab.customer.vo.CustomerVo;

public interface CustomerDAO {
    CustomerVo selectCustomer(int id);
    List<CustomerVo> selectAllCustomer();
    void insertCustomer(CustomerVo customer);
}