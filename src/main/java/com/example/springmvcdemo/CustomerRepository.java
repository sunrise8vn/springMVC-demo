package com.example.springmvcdemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findCustomerById(Integer id);

//    @Query(value = "select id, first_name, last_name from customers c where c.id =? and c.is_deleted = 0", nativeQuery = true)
//    Customer findCustomerById(Integer id);
//    Customer findCustomerById(@Param("id") int id);

//    public static final String FIND_CUSTOMER_BY_ID = "select id, first_name, last_name from customers c where c.id =? and c.is_deleted = 0";
//
//    @Query(value = FIND_CUSTOMER_BY_ID, nativeQuery = true)
//    Customer findCustomerById(Integer id);
}

