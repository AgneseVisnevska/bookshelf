package lv.itlat.bookshelf.persistence.domain;

import javax.persistence.*;

@Entity(name = "User")
@Table(name = "User")
public class User {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
