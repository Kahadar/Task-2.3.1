package web.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @Size(min = 3, max = 50, message = "Name length should be between 3 and 50 characters")
    private String name;

    @Column(name = "profession")
    private String profession;


    @Column(name = "age")
    @Min(value = 1, message = "Minimal age is 1")
    private int age;

}
