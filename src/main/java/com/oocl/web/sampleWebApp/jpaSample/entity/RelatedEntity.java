package com.oocl.web.sampleWebApp.jpaSample.entity;

import javax.persistence.*;

@Entity
public class RelatedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 64)
    private String name;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private SingleEntity singleEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SingleEntity getSingleEntity() {
        return singleEntity;
    }

    public void setSingleEntity(SingleEntity singleEntity) {
        this.singleEntity = singleEntity;
    }
}
