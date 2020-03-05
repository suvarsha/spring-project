package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.StockExchange;


public interface StockExchangeRepository extends CrudRepository<StockExchange,Integer> {

}
