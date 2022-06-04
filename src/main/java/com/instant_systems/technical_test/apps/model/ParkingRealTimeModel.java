package com.instant_systems.technical_test.apps.model;

import lombok.Data;

@Data
public class ParkingRealTimeModel {

    private double taux_doccupation;
    private long capacite;
    private long places_restantes;
    private String nom;
    private String id;
    private double[] geo_point_2d;


    public Double getTaux_doccupation() {
        return taux_doccupation;
    }

    public void setTaux_doccupation(Double taux_doccupation) {
        this.taux_doccupation = taux_doccupation;
    }

    public Long getCapacite() {
        return capacite;
    }

    public void setCapacite(Long capacite) {
        this.capacite = capacite;
    }

    public Long getPlaces_restantes() {
        return places_restantes;
    }

    public void setPlaces_restantes(Long places_restantes) {
        this.places_restantes = places_restantes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double[] getGeo_point_2d() {
        return geo_point_2d;
    }

    public void setGeo_point_2d(double[] geo_point_2d) {
        this.geo_point_2d = geo_point_2d;
    }
}
