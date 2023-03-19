package com.example.tinkoffservice.controllers;

import com.example.tinkoffservice.model.Stock;
import com.example.tinkoffservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockController {
private  final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock (@PathVariable String ticker){
       return stockService.getStockByTicker(ticker);

    }
}
