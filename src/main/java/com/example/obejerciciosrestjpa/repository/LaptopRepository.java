package com.example.obejerciciosrestjpa.repository;

import com.example.obejerciciosrestjpa.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {}
