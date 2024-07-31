package com.example.PracticaDEML31072024.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PracticaDEML31072024.modelos.ProductoDEML;

public interface IProductoDEMLRepository extends JpaRepository<ProductoDEML, Long> {
}
