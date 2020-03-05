package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StockExchangeRepository;
import com.example.demo.pojos.StockExchange;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/stockExchange")
public class StockExchangeController {


	@Autowired
	private StockExchangeRepository stockexchangeRepository;
	@RequestMapping("/getAllStockExchange")
	public Iterable<StockExchange>getAllUser()
	{
		return stockexchangeRepository.findAll();
	}
	@PostMapping("/saveStockExchange")
	public StockExchange saveStock(@RequestBody StockExchange stock)
	{
		System.out.println(stock);
	stockexchangeRepository.save(stock);
		return stock;
	}
	@PutMapping("/putstockExchange/{id}")
	public StockExchange updateStock(@RequestBody StockExchange stock,@PathVariable("id") Integer id)
	{
		
		stock.setId(id);
		System.out.println(stock);
		
		stockexchangeRepository.save(stock);
		return stock;
	}
	@DeleteMapping("/deletestockExchange/{id}")
	public boolean deleteStock(@PathVariable("id") Integer id)
	{
		
	
		System.out.println(id);
		
		stockexchangeRepository.deleteById(id);
		return true;
	}
	@GetMapping("/findstockExchange/{id}")
	public StockExchange findAllinOne(@PathVariable("id") Integer id)
	{
	
	Optional<StockExchange> stock=stockexchangeRepository.findById(id);
		return stock.get();
	}
	
}
