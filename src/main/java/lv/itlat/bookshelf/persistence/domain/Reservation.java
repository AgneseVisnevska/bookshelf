package lv.itlat.bookshelf.persistence.domain;

import javax.persistence.*;

@Entity(name = "Reservation")
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
