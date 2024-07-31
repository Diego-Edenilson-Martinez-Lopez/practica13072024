package com.example.PracticaDEML31072024.modelos;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull; 

@Entity
@Table(name = "productodeml")
public class ProductoDEML {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es requerido")
    private String nombreDEML;

    @NotBlank(message = "La descripción es requerida")
    private String descripcionDEML;

    @NotNull(message = "El precio es requerido")
    private BigDecimal precioDEML;

    @NotNull(message = "La fecha de vencimiento es requerida")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimientoDEML;

    @NotNull(message = "El estatus es requerido")
    private Byte estatusDEML;

    @NotNull(message = "La existencia es requerida")
    private Integer existenciaDEML;

    public ProductoDEML() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreDEML() {
        return nombreDEML;
    }

    public void setNombreDEML(String nombreDEML) {
        this.nombreDEML = nombreDEML;
    }

    public String getDescripcionDEML() {
        return descripcionDEML;
    }

    public void setDescripcionDEML(String descripcionDEML) {
        this.descripcionDEML = descripcionDEML;
    }

    public BigDecimal getPrecioDEML() {
        return precioDEML;
    }

    public void setPrecioDEML(BigDecimal precioDEML) {
        this.precioDEML = precioDEML;
    }

    public Date getFechaVencimientoDEML() {
        return fechaVencimientoDEML;
    }

    public void setFechaVencimientoDEML(Date fechaVencimientoDEML) {
        this.fechaVencimientoDEML = fechaVencimientoDEML;
    }

    public Byte getEstatusDEML() {
        return estatusDEML;
    }

    public void setEstatusDEML(Byte estatusDEML) {
        this.estatusDEML = estatusDEML;
    }

    public Integer getExistenciaDEML() {
        return existenciaDEML;
    }

    public void setExistenciaDEML(Integer existenciaDEML) {
        this.existenciaDEML = existenciaDEML;
    }
    

}