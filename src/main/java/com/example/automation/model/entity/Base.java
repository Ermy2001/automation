package com.example.automation.model.entity;

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@MappedSuperclass
@ToString

public class Base  {
    @Version
    @JsonbTransient
    private Long versionId;
    @JsonbTransient
    private boolean editing = false;
    @JsonbTransient
    private boolean deleted = false;
    @JsonbTransient
    private boolean locked;
}