
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
public class user extends Base {
    @Id
    @SequenceGenerator(name = "propertySEQ", sequenceName = "Property_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "propertySEQ")
    @Column(name = "codeKala")
    long codeKala;


    @Pattern(regexp = "^[1-9]$", message = "Invalid userCode")
    @Column(name = "userCode")
    long userCode;

    @Pattern(regexp = "^[1-9]$", message = "Invalid personCode")
    @Column(name = "personCode")
    long personCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$", message = "Invalid departmentCode")
    @Column(name = "departmentCode", length = 50)
    String departmentCode;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$", message = "Invalid userName")
    @Column(name = "userName", length = 50)
    String userName;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$", message = "Invalid password")
    @Column(name = "password", length = 50)
    String password;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$", message = "you don't have permission")
    @Column(name = "specificPermission", length = 50)
    String specificPermision;

    @Pattern(regexp = "^[a-zA-Z\\s]{3,50}$", message = "Invalid role")
    @Column(name = "role", length = 50)
    String role;

    @Column(name = "year", length = 15)
    LocalDateTime year;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status", length = 20)
    Enum status;

    @Enumerated(EnumType.STRING)
    @Column(name = "PropertyType", length = 20)
    Enum propertyType;
}


