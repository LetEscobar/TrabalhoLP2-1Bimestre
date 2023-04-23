package br.com.trabalhoLP2.trabalhoLP2.repository;

import br.com.trabalhoLP2.trabalhoLP2.javabeans.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
