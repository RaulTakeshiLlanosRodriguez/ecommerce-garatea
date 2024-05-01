package com.vidrieriagaratea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidrieriagaratea.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
