package com.TransfertNational.demo.Shared.dto;

import java.io.Serializable;
import java.util.Date;

public class TransfertDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
    private String transfertId;
    private String referenceTransfert;
    private String pin;
    private String etat = "A servir";
    private float montant;
    private String motif;
    private Boolean notification = false;
    private Boolean GAB_BOA = false;
    private String clientDonneurId;
    private String clientBeneficaireId;
    private Date dateTransfert;
    private Date dateReception;
    private int delaiTransfert = 7;
    private String typeTransfert;

    public String getTypeTransfert() {
        return typeTransfert;
    }

    public void setTypeTransfert(String typeTransfert) {
        this.typeTransfert = typeTransfert;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTransfertId() {
        return transfertId;
    }

    public void setTransfertId(String transfertId) {
        this.transfertId = transfertId;
    }

    public String getReferenceTransfert() {
        return referenceTransfert;
    }

    public void setReferenceTransfert(String referenceTransfert) {
        this.referenceTransfert = referenceTransfert;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Boolean getNotification() {
        return notification;
    }

    public void setNotification(Boolean notification) {
        this.notification = notification;
    }

    public Boolean getGAB_BOA() {
        return GAB_BOA;
    }

    public void setGAB_BOA(Boolean GAB_BOA) {
        this.GAB_BOA = GAB_BOA;
    }

    public String getClientDonneurId() {
        return clientDonneurId;
    }

    public void setClientDonneurId(String clientDonneurId) {
        this.clientDonneurId = clientDonneurId;
    }

    public String getClientBeneficaireId() {
        return clientBeneficaireId;
    }

    public void setClientBeneficaireId(String clientBeneficaireId) {
        this.clientBeneficaireId = clientBeneficaireId;
    }

    public Date getDateTransfert() {
        return dateTransfert;
    }

    public void setDateTransfert(Date dateTransfert) {
        this.dateTransfert = dateTransfert;
    }

    public int getDelaiTransfert() {
        return delaiTransfert;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public void setDelaiTransfert(int delaiTransfert) {
        this.delaiTransfert = delaiTransfert;
    }
}
