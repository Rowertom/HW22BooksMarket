package ru.learnUp.market;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import ru.learnUp.market.dao.AuthorDao;

import java.time.LocalDate;

@SpringBootApplication
public class BooksShopApplication {

    private static final Logger log = LoggerFactory.getLogger(BooksShopApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BooksShopApplication.class, args);

//        Author forUpdate = Author.builder()
//                .author_name("William")
//                .author_surname("Shakespeare")
//                .birth_date(LocalDate.of(1564, 4, 26))
//                .build();
//
//        AuthorDao authorDao = context.getBean(AuthorDao.class);
//        authorDao.save(forUpdate);
//
//        Author author = authorDao.findById(1);
//        log.info("{}", author);
    }

}
