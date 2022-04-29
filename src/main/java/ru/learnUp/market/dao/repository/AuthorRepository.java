package ru.learnUp.market.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.learnUp.market.dao.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
