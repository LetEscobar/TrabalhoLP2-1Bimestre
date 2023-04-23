package br.com.trabalhoLP2.trabalhoLP2.repository;

import br.com.trabalhoLP2.trabalhoLP2.javabeans.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
