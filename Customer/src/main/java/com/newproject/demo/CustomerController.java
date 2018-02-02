package com.newproject.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {
//    @RequestMapping("/")
//    public Customer HomePage(){
//        return new Customer();
//    }
//
//    @RequestMapping("/new")
//    public Customer CreateCustomer(@RequestParam(value="name", defaultValue = "JeanClaude")String name,
//                                   @RequestParam(value="age", defaultValue = "21") Integer age){
//        return new Customer(name,age);
//    }
//
//    @RequestMapping(value = "/new", method = RequestMethod.POST)
//    public Customer CreateCustomerFromPost(@RequestParam(value="name", defaultValue = "JeanClaude")String name,
//                                           @RequestParam(value="age", defaultValue = "21") Integer age){
//        return new Customer(name,age);
//    }


    @Autowired
    public CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers(){return customerService.getAllCustomers(); }

    @RequestMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return  customerService.getCustomer(id);}

    @RequestMapping(method = RequestMethod.POST, value = "/customers")
    public void addCustomer(@RequestBody Customer customer){customerService.addCustomer(customer);}

    @RequestMapping(method = RequestMethod.DELETE, value = "/customers/{id}" )
    public void deleteCustomer(@PathVariable Long id){customerService.deleteCustomer(id);}

    @RequestMapping(method = RequestMethod.PUT, value = "/customers/{id}")
    public void updateCustomer(@RequestBody Customer customer,@PathVariable Long id){customerService.updateCustomer(id,customer);}
}

