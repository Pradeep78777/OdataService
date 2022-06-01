package com.aldi.sap.odata.repository;

import com.aldi.sap.odata.entity.FreeTextMessageEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  FreeTextMessageRepository extends JpaRepository<FreeTextMessageEntity, Long> {
    
}
