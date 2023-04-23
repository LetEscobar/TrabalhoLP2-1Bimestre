package br.com.trabalhoLP2.trabalhoLP2.service;

import br.com.trabalhoLP2.trabalhoLP2.javabeans.Stock;
import br.com.trabalhoLP2.trabalhoLP2.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Stock getStockById(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Long id, Stock stock) {
        Stock existingStock = stockRepository.findById(id).orElse(null);
        if (existingStock != null) {
            existingStock.setProduct(stock.getProduct());
            existingStock.setQuantity(stock.getQuantity());
            return stockRepository.save(existingStock);
        }
        return null;
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }
}
