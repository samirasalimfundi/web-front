package com.example.costomers.service;

import com.example.costomers.model.Customer;
import com.example.costomers.model.Time;
import com.example.costomers.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {
    @Autowired
    private CustomerRepository customerRepository;

    public void saveDetails(Customer customer) {
        customerRepository.save(customer);
    }

    public void saveList(List<Customer> customerList) {
        customerRepository.saveAll(customerList);
    }

    public List<Customer> getcustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> viewbyId(int custId) {
        return customerRepository.findById(custId);
    }

    public void deletedetails(int id) {
        customerRepository.deleteById(id);
    }

    public Optional<Customer> finddetails(int custId) {
       return customerRepository.findById(custId);
    }


}
