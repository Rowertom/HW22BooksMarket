package ru.learnUp.market.dao.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
@ToString(exclude = "author")
@RequiredArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @ManyToOne
    @JoinColumn
    private Author author;

    @Column
    private String bookName;

    @Column
    private int issueDate;

    @Column
    private int leavesCount;

    @Column
    private int price;

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BookStorage> bookStorage;

}
