package com.example.costomers.controller;

import com.example.costomers.model.Customer;
import com.example.costomers.service.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
@RestController
public class customerController {
    @Autowired
    private CustomerServices customerServices;

    //display welcome message
    @GetMapping("/")
    public String showMessage(){

        return "Welcome to my site";
    }

    //save data inff
    @PostMapping("/save")
    public String saveData(@RequestBody Customer customer){
        customerServices.saveDetails(customer);
        return "You havebeen success registered";
    }
    //save many data
    @PostMapping("/list")
    public String Listdata (@RequestBody List<Customer> customerList){
        customerServices.saveList(customerList);
        return "customerList";

    }
    @GetMapping("/view")
    public List<Customer> viewall(){
        return customerServices.getcustomer();
    }
    @GetMapping("/customer/{custId}")
    public Optional<Customer> viewId(@PathVariable int custId){
        return customerServices.finddetails(custId);
    }
    @DeleteMapping("/delete/{id}")
    public String DeleteCustomer(@PathVariable int id){
        customerServices.deletedetails(id);
        return "customer has been deleted";
    }
    @PutMapping("/update/{id}")
    public String updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {

        return "Customer has updated";
    }
}
