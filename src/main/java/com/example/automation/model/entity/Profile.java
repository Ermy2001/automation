package com.example.automation.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@SuperBuilder
@Getter
@Setter

@Entity(name = "propertyEntity")
@Table(name = "Property_Entity")
public class Profile extends Base {
    @Id
    @SequenceGenerator(name = "propertySEQ", sequenceName = "Property_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propertySEQ")
    @Column(name = "codeKala")
    long codeKala;


    @Pattern(regexp = "^[1-9]$" , message = "Invalid personCode")
    @Column(name = "personCode")
    long personCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid gender")
    @Column(name = "gender" , length = 20)
    String gender;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid name")
    @Column(name = "name" , length = 50)
    String name;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid family")
    @Column(name = "family" , length = 50)
    String family;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid National Code")
    @Column(name = "nationalCode")
    long nationalCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status" , length = 20)
    Enum status;

    @Enumerated(EnumType.STRING)
    @Column(name = "PropertyType" , length = 20)
    Enum propertyType;
}

