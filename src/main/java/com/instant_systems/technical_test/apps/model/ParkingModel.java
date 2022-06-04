package com.instant_systems.technical_test.apps.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Getter
@Setter
public class ParkingModel {

    @Id
    private double[] geoPoint2D;
    private String typeUsage;
    private String numSiret;
    private long tarif24H;
    private long gratuit;
    private long nb2REl;
    private String f2H15;
    private long nbVoiture;
    private String nom;
    private String gmlID;
    private String aboReside;
    private long hauteurMa;
    private String aboNonRe;
    private String id;
    private String tarif4H;
    private long nbVelo;
    private long nb2_Rm;
    private long nbCovoit;
    private GeoShape geoShape;
    private String info;
    private double xlong;
    private String adresse;
    private long insee;
    private long nbAutopar;
    private String tarif2H;
    private String url;
    private String nomDuPar;
    private String tarif3H;
    private String typeOuvra;
    private long nbPlaces;
    private String tarif1H;
    private long nbPmr;
    private double ylat;


    public double[] getGeoPoint2D() {
        return geoPoint2D;
    }

    public void setGeoPoint2D(double[] geoPoint2D) {
        this.geoPoint2D = geoPoint2D;
    }

    public String getTypeUsage() {
        return typeUsage;
    }

    public void setTypeUsage(String typeUsage) {
        this.typeUsage = typeUsage;
    }

    public String getNumSiret() {
        return numSiret;
    }

    public void setNumSiret(String numSiret) {
        this.numSiret = numSiret;
    }

    public long getTarif24H() {
        return tarif24H;
    }

    public void setTarif24H(long tarif24H) {
        this.tarif24H = tarif24H;
    }

    public long getGratuit() {
        return gratuit;
    }

    public void setGratuit(long gratuit) {
        this.gratuit = gratuit;
    }

    public long getNb2REl() {
        return nb2REl;
    }

    public void setNb2REl(long nb2REl) {
        this.nb2REl = nb2REl;
    }

    public String getF2H15() {
        return f2H15;
    }

    public void setF2H15(String f2H15) {
        this.f2H15 = f2H15;
    }

    public long getNbVoiture() {
        return nbVoiture;
    }

    public void setNbVoiture(long nbVoiture) {
        this.nbVoiture = nbVoiture;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGmlID() {
        return gmlID;
    }

    public void setGmlID(String gmlID) {
        this.gmlID = gmlID;
    }

    public String getAboReside() {
        return aboReside;
    }

    public void setAboReside(String aboReside) {
        this.aboReside = aboReside;
    }

    public long getHauteurMa() {
        return hauteurMa;
    }

    public void setHauteurMa(long hauteurMa) {
        this.hauteurMa = hauteurMa;
    }

    public String getAboNonRe() {
        return aboNonRe;
    }

    public void setAboNonRe(String aboNonRe) {
        this.aboNonRe = aboNonRe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTarif4H() {
        return tarif4H;
    }

    public void setTarif4H(String tarif4H) {
        this.tarif4H = tarif4H;
    }

    public long getNbVelo() {
        return nbVelo;
    }

    public void setNbVelo(long nbVelo) {
        this.nbVelo = nbVelo;
    }

    public long getNb2_Rm() {
        return nb2_Rm;
    }

    public void setNb2_Rm(long nb2_Rm) {
        this.nb2_Rm = nb2_Rm;
    }

    public long getNbCovoit() {
        return nbCovoit;
    }

    public void setNbCovoit(long nbCovoit) {
        this.nbCovoit = nbCovoit;
    }

    public GeoShape getGeoShape() {
        return geoShape;
    }

    public void setGeoShape(GeoShape geoShape) {
        this.geoShape = geoShape;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public double getXlong() {
        return xlong;
    }

    public void setXlong(double xlong) {
        this.xlong = xlong;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public long getInsee() {
        return insee;
    }

    public void setInsee(long insee) {
        this.insee = insee;
    }

    public long getNbAutopar() {
        return nbAutopar;
    }

    public void setNbAutopar(long nbAutopar) {
        this.nbAutopar = nbAutopar;
    }

    public String getTarif2H() {
        return tarif2H;
    }

    public void setTarif2H(String tarif2H) {
        this.tarif2H = tarif2H;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNomDuPar() {
        return nomDuPar;
    }

    public void setNomDuPar(String nomDuPar) {
        this.nomDuPar = nomDuPar;
    }

    public String getTarif3H() {
        return tarif3H;
    }

    public void setTarif3H(String tarif3H) {
        this.tarif3H = tarif3H;
    }

    public String getTypeOuvra() {
        return typeOuvra;
    }

    public void setTypeOuvra(String typeOuvra) {
        this.typeOuvra = typeOuvra;
    }

    public long getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(long nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public String getTarif1H() {
        return tarif1H;
    }

    public void setTarif1H(String tarif1H) {
        this.tarif1H = tarif1H;
    }

    public long getNbPmr() {
        return nbPmr;
    }

    public void setNbPmr(long nbPmr) {
        this.nbPmr = nbPmr;
    }

    public double getYlat() {
        return ylat;
    }

    public void setYlat(double ylat) {
        this.ylat = ylat;
    }
}
