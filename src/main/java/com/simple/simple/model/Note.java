package com.simple.simple.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Note {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String text;
}
