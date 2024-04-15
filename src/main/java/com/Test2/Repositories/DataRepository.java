package com.Test2.Repositories;

import com.Test2.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DataRepository extends JpaRepository<Data,Integer>{
    Optional<Data> findByAge(int Age);
}
