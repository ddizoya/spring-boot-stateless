package net.vidizzo.repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client implements Serializable {
    public String firstName;
    public String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String username;
    @JsonIgnore
    public String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Package> packages;

}
