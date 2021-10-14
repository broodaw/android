package com.example.findme.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
