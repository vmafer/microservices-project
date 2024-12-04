package com.micservproject.accounts.respository;

import com.micservproject.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, Long>{

    Optional<Customer> findByMobileNumber(String mobileNumber);

}
