package br.com.trabalhoLP2.trabalhoLP2.repository;

import br.com.trabalhoLP2.trabalhoLP2.javabeans.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
