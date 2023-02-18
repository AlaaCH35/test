package com.example.elib.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public class AbstractEntity implements Serializable {

@Id
@GeneratedValue
// par defaut l'incremention de l'id est Auto
  private  Integer id;
@CreatedDate
@JsonIgnore
@Column(name = "creationDate",nullable = false)
    private Instant creationDate;
@LastModifiedDate
@Column(name = "creationDate")
@JsonIgnore
    private Instant lastupdateDate;



}
