package net.vidizzo.repository;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "package")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Package implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Client client;

    private String status;

    private Date creationDate;

    private Date deliverDate;

}
