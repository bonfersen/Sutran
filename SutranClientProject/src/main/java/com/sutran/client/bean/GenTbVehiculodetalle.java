package com.sutran.client.bean;

import java.math.BigDecimal;
import java.util.Date;

public class GenTbVehiculodetalle {
    private Integer idVehiDetalle;

    private BigDecimal latitud;

    private BigDecimal longitud;

    private Integer rumbo;

    private Integer velocidad;

    private String evento;

    private Date fechaRegistroGPS;

    private Integer idVehiculo;

    private String estaTransmitido;

    public Integer getIdVehiDetalle() {
        return idVehiDetalle;
    }

    public void setIdVehiDetalle(Integer idVehiDetalle) {
        this.idVehiDetalle = idVehiDetalle;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public Integer getRumbo() {
        return rumbo;
    }

    public void setRumbo(Integer rumbo) {
        this.rumbo = rumbo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Date getFechaRegistroGPS() {
        return fechaRegistroGPS;
    }

    public void setFechaRegistroGPS(Date fechaRegistroGPS) {
        this.fechaRegistroGPS = fechaRegistroGPS;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getEstaTransmitido() {
        return estaTransmitido;
    }

    public void setEstaTransmitido(String estaTransmitido) {
        this.estaTransmitido = estaTransmitido;
    }
}