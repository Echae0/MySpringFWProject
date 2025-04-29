package mylab.customer.dao.mapper;

import java.util.List;
import mylab.customer.vo.CustomerVo;

public interface CustomerMapper {
    CustomerVo selectCustomer(int id);
    List<CustomerVo> selectAllCustomer();
    void insertCustomer(CustomerVo customer);
}