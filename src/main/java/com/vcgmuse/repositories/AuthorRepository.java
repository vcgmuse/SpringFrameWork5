package com.vcgmuse.repositories;

import com.vcgmuse.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
