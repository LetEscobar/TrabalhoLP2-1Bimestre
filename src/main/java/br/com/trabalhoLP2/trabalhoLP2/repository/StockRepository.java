package br.com.trabalhoLP2.trabalhoLP2.repository;

import br.com.trabalhoLP2.trabalhoLP2.javabeans.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}

