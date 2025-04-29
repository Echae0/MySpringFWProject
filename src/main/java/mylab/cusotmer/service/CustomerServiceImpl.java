package mylab.cusotmer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mylab.customer.dao.CustomerDAO;
import mylab.customer.vo.CustomerVo;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public CustomerVo getCustomerInfo(int id) {
        return customerDAO.selectCustomer(id);
    }

    @Override
    public List<CustomerVo> getAllCustomerList() {
        return customerDAO.selectAllCustomer();
    }

    @Override
    public void insertCustomer(CustomerVo customer) {
        customerDAO.insertCustomer(customer);
    }
}