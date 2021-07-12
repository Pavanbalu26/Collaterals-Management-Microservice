package com.cts.training.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.training.model.CustomerLoan;

/**
 * Customer Loan Crud Repository 
 */
@Repository
public interface CustomerLoanRepo extends CrudRepository<CustomerLoan, Integer> {

}
