package com.vcgmuse.repositories;

import com.sun.xml.bind.v2.model.core.ID;
import com.vcgmuse.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
