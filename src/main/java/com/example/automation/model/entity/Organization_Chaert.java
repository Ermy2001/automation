
package com.example.automation.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@SuperBuilder
@Getter
@Setter

@Entity(name = "propertyEntity")
@Table(name = "Property_Entity")
public class Organization_Chaert extends Base {
    @Id
    @SequenceGenerator(name = "propertySEQ", sequenceName = "Property_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propertySEQ")
    @Column(name = "codeKala")
    long codeKala;


    @Pattern(regexp = "^[1-9]$" , message = "Invalid departmentCode")
    @Column(name = "departmentCode")
    long departmentCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid departmentName")
    @Column(name = "departmentName" , length = 50)
    String departmentName;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid headCode")
    @Column(name = "headCode")
    long headCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,150}$" , message = "Invalid dutisDescription")
    @Column(name = "dutiesDescription" , length = 150)
    String dutiesDescription;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid managerCode")
    @Column(name = "managerCode")
    long managerCode;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid deputyCode")
    @Column(name = "deputyCode")
    long deputyCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$" , message = "Invalid administrativeUnit")
    @Column(name = "administrativeUnit" , length = 50)
    String administrativeUnit;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid phone")
    @Column(name = "phone")
    long phone;

    @Pattern(regexp = "^[1-9]$" , message = "Invalid voipNumber")
    @Column(name = "voipNumber")
    long voipNumber;

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

