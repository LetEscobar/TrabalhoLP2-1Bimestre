package br.com.trabalhoLP2.trabalhoLP2.service;

import br.com.trabalhoLP2.trabalhoLP2.javabeans.Supplier;
import br.com.trabalhoLP2.trabalhoLP2.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    public Supplier saveSupplier(Supplier supplier) {
        return supplier;
    }
    public Supplier updateSupplier(Long id, Supplier supplier) {
        Supplier existingSupplier = supplierRepository.findById(id).orElse(null);
        if (existingSupplier != null) {
            existingSupplier.setName(supplier.getName());
            existingSupplier.setEmail(supplier.getEmail());
            return supplierRepository.save(existingSupplier);
        }
        return null;
    }

    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
