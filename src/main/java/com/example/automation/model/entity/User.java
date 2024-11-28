package com.example.automation.model.entity;

import com.example.automation.model.entity.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;


@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString


@Entity(name = "userEntity")
@Table(name = "user_tbl")

public class User extends Base {

    @Id
    @SequenceGenerator(name = "userSeq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq")
    @JsonProperty("ردیف :")
    private Long id;

    @Column(name = "user_firstName", length = 30)
    @Pattern(regexp = "^[a-zA-Z]{2,30}$", message = "invalid name !")
    @JsonProperty("نام :") //todo --> not work!
    private String name;

    @Column(name = "user_lastName", length = 40)
    @Pattern(regexp = "^[a-zA-Z]{2,40}$", message = "invalid family")
    @JsonProperty("نام خانوادگی :")
    private String family;

    @Column(name = "user_national_id", length = 10)
    @Pattern(regexp = "^[0-9]{3,10}$", message = "invalid national id !")
    @JsonProperty("کد ملی :")
    private String nationalId;

    @Column(name = "user_birth_date")
    @JsonProperty("تاریخ تولد :")
    private LocalDate birthDate;

    @Column(name = "user_phone_number", length = 13)
    @Pattern(regexp = "^[0-9]{3,13}$", message = "invalid phone number !")
    @JsonProperty("شماره تماس :")
    private String phoneNumber;

    @Column(name = "user_gender")
    @Enumerated(EnumType.ORDINAL)
    @JsonProperty("جنسیت :")
    private Gender gender;

}