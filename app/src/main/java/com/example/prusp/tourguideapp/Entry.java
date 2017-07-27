package com.example.prusp.tourguideapp;

/**
 * Created by Piotr Prus on 20.07.2017.
 */

public class Entry {

    private String entryName;
    private String priceRange;
    private String typeOfKitchen;
    private String entryAddress;
    private double entryLocalizationN;
    private double entryLocalizationE;
    private int entryResourceId;
    private String entryDescription;

    public Entry(String entryName, String priceRange, String typeOfKitchen, String entryAddress) {
        this.entryName = entryName;
        this.priceRange = priceRange;
        this.typeOfKitchen = typeOfKitchen;
        this.entryAddress = entryAddress;
    }

    public Entry(String entryName, double entryLocalizationN, double entryLocalizationE, int entryResourceId) {
        this.entryName = entryName;
        this.entryLocalizationN = entryLocalizationN;
        this.entryLocalizationE = entryLocalizationE;
        this.entryResourceId = entryResourceId;
    }

    public Entry(String entryName, String entryAddress, String entryDescription) {
        this.entryName = entryName;
        this.entryAddress = entryAddress;
        this.entryDescription = entryDescription;
    }

    public Entry(String entryName, String entryAddress, int entryResourceId) {
        this.entryName = entryName;
        this.entryAddress = entryAddress;
        this.entryResourceId = entryResourceId;
    }

    public String getEntryName() {
        return entryName;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public String getTypeOfKitchen() {
        return typeOfKitchen;
    }

    public String getEntryAddress() {
        return entryAddress;
    }

    public double getEntryLocalizationN() {
        return entryLocalizationN;
    }

    public double getEntryLocalizationE() {
        return entryLocalizationE;
    }

    public int getEntryResourceId() {
        return entryResourceId;
    }

    public String getEntryDescription() {
        return entryDescription;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entry{");
        sb.append("entryName='").append(entryName).append('\'');
        sb.append(", priceRange='").append(priceRange).append('\'');
        sb.append(", typeOfKitchen='").append(typeOfKitchen).append('\'');
        sb.append(", entryAddress='").append(entryAddress).append('\'');
        sb.append(", entryLocalizationN=").append(entryLocalizationN);
        sb.append(", entryLocalizationE=").append(entryLocalizationE);
        sb.append(", entryResourceId=").append(entryResourceId);
        sb.append(", entryDescription='").append(entryDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

