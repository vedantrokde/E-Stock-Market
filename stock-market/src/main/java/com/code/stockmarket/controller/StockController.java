package com.code.stockmarket.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.stockmarket.model.Stock;
import com.code.stockmarket.service.serviceImpl.StockService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1.0/market/stock/")
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("add")
    public Stock createStock(@Valid @RequestBody Stock stock) {
        return stockService.createStock(stock);
    }

    @GetMapping("get/{companyCode}/{startDate}/{endDate}")
    public List<Stock> fetchCompanyStocks(@PathVariable String companyCode, @PathVariable LocalDateTime startDate,
            @PathVariable LocalDateTime endDate) {
        return stockService.fetchCompanyStocks(companyCode, startDate, endDate);
    }

}
