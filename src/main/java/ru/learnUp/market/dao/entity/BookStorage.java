package ru.learnUp.market.dao.entity;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BookStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookStorageId;

    @ManyToOne
    @JoinColumn
    private Book book;

    @Column
    private int booksCount;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookStorage that = (BookStorage) o;
        return bookStorageId != null && Objects.equals(bookStorageId, that.bookStorageId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
