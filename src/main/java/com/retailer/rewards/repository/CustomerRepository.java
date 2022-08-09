package com.retailer.rewards.repository;

import org.springframework.stereotype.Repository;

import com.retailer.rewards.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
