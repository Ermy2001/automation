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
public class Organizatioin extends Base {
    @Id
    @SequenceGenerator(name = "propertySEQ", sequenceName = "Property_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propertySEQ")
    @Column(name = "codeKala")
    long codeKala;


    @Pattern(regexp = "^[1-9]$" , message = "Invalid organizationCode")
    @Column(name = "organizationCode")
    long organizationCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid organizationName")
    @Column(name = "organizationName" , length = 50)
    String organizationName;

    @Pattern(regexp = "^[a-zA-Z1-9\\s]{10,30}$" , message = "Invalid slogan")
    @Column(name = "slogan" , length = 30)
    String slogan;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid logo")
    @Column(name = "logo" , length = 5)
    long logo;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,150}$" , message = "Invalid activityDescription")
    @Column(name = "activityDescription" , length = 150)
    String activityDescription;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid ceoCode")
    @Column(name = "ceoCode")
    long ceoCode;
    @Pattern(regexp = "^[a-zA-Z\\s]{3,150}$" , message = "Invalid address")
    @Column(name = "address" , length = 150)
    String address;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid phone")
    @Column(name = "phone")
    long phone;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,150}$" , message = "Invalid comment")
    @Column(name = "comment" , length = 150)
    String comment;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status" , length = 20)
    Enum status;

    @Enumerated(EnumType.STRING)
    @Column(name = "PropertyType" , length = 20)
    Enum propertyType;
}

