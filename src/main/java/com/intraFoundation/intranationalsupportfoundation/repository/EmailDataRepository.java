package com.intraFoundation.intranationalsupportfoundation.repository;

import com.intraFoundation.intranationalsupportfoundation.repository.model.EmailDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailDataRepository extends CrudRepository<EmailDataEntity, Long> {
}
