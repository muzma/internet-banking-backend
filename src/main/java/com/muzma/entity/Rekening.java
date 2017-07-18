package com.muzma.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by muzma on 7/17/17.
 */
@Entity
@Table(name="rekening")
public class Rekening {

    @Id
    private String id;

    @NotNull @NotEmpty @Size(min = 10, max = 100)
    @Column(unique = true)
    private String nomer;

    @NotNull @NotEmpty
    @Size(min = 3, max = 255)
    private String nama;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
