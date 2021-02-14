package com.vcgmuse.repositories;
//Stopped on Number 17 on the Initialize Data on Spring with Udemy

import com.vcgmuse.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
