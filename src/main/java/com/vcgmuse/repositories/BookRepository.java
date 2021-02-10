package com.vcgmuse.repositories;

import com.vcgmuse.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
