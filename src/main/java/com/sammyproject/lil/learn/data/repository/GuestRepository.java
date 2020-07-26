package com.sammyproject.lil.learn.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sammyproject.lil.learn.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

}
