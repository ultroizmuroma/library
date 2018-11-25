package ru.barinov.library.repository;

import org.springframework.data.repository.CrudRepository;
import ru.barinov.library.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
