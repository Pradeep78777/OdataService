package com.aldi.sap.odata.controller;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.aldi.sap.odata.entity.FreeTextMessageEntity;
import com.aldi.sap.odata.repository.FreeTextMessageRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RequestMapping("/test")
@CrossOrigin
public class Test {
    @Autowired
    FreeTextMessageRepository freeTextMessageRepository;
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @GetMapping(value = "/method")
    public List<FreeTextMessageEntity> hi() {
        List<FreeTextMessageEntity> testEntity = freeTextMessageRepository.findAll();
        return testEntity;
    }

    @GetMapping(value = "/dbConnect")
    public void testOne(DataSource dataSource) throws SQLException {
        logger.info("Database connection valid = {}", dataSource.getConnection().isValid(1000));
        // try (Connection connection = dataSource.getConnection()) {
        //     logger.info("catalog:" + connection.getCatalog());
        // }
    }

}
