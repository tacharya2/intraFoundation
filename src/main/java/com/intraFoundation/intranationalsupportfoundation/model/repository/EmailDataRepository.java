package com.intraFoundation.intranationalsupportfoundation.model.repository;

import com.intraFoundation.intranationalsupportfoundation.model.repository.model.EmailData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailDataRepository extends CrudRepository<EmailData, Long> {
}
