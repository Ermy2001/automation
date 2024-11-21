
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
public class Attached extends Base {
    @Id
    @SequenceGenerator(name = "propertySEQ", sequenceName = "Property_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propertySEQ")
    @Column(name = "codeKala")
    long codeKala;


    @Pattern(regexp = "^[1-9]$" , message = "Invalid attachedCode")
    @Column(name = "attachedCode")
    long attachedCode;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid referenceNumber")
    @Column(name = "referenceNumber")
    long referenceNumber;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid attachedTitel")
    @Column(name = "attachedTitel" , length = 50)
    String attachedTitel;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid attachedType")
    @Column(name = "attachedType")
    long attachedType;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,150}$" , message = "Invalid address")
    @Column(name = "address" , length = 150)
    String address;

    @Pattern(regexp = "^[1-9]$" , message = "you don't have permission")
    @Column(name = "permission")
    long peermission;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status" , length = 20)
    Enum status;

    @Enumerated(EnumType.STRING)
    @Column(name = "PropertyType" , length = 20)
    Enum propertyType;
}

