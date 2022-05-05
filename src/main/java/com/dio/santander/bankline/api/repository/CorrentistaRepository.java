package com.dio.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankline.api.model.Correntista;

//aqui o bando postgres recebera os dados
public interface CorrentistaRepository extends JpaRepository<Correntista, Integer>{

}
