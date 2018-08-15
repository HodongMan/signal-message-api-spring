package com.example.signal.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Lob;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    GeneratedValue(strategy = generationType.AUTO)
    private Long id;    

    @NotBlank
    @Size(max=40)
    private String from;
    
    @NotBlank
    @Size(max=40)
    private String to;
    
    private int status;

    @NotBlank
    @Size(max=255)
    private String title;

    @NotBlank
    @Lob
    private String description;

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom() {
        this.from = from;
    }
}

