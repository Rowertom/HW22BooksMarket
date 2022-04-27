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
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailsId;

    @ManyToOne
    @JoinColumn
    private BooksOrder order;

    @OneToOne
    @JoinColumn
    private BookStorage bookStorage;

    @Column
    private int booksCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderDetails that = (OrderDetails) o;
        return orderDetailsId != null && Objects.equals(orderDetailsId, that.orderDetailsId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
