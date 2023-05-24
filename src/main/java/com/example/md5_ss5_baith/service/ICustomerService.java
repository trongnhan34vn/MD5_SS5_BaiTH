package com.example.md5_ss5_baith.service;

import com.example.md5_ss5_baith.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void deleteById(Long id);

    void save(Customer customer);

}
