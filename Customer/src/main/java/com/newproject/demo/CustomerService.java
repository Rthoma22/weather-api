package com.newproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {
    //Customer customer = new Customer();

//    private List<Customer> customer = new ArrayList<Customer>(Arrays.asList(
//            new Customer("Bill", 37 ),
//            new Customer("Steve", 19 )
//
//    ));
//
//
    @Autowired
    CustomerRepository customerRepository;

public List<Customer> getAllCustomers(){
    List<Customer>customer = new ArrayList<>();
    customerRepository.findAll().forEach(customer::add);
    return customer;
}

public Customer getCustomer(Long id){
    return customerRepository.findOne(id);
}

public void addCustomer(Customer customer){
    customerRepository.save(customer);
}


public void deleteCustomer(Long id){
    customerRepository.delete(id);
}

public void updateCustomer(Long id, Customer customer){
   customerRepository.save(customer);
}

}


