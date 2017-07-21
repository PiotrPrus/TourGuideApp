package com.example.prusp.tourguideapp;

/**
 * Created by prusp on 20.07.2017.
 */

public class Restaurant {

    private String restaurantName;
    private String priceRange;
    private String typeOfKitchen;
    private String addressOfRestaurant;

    public Restaurant(String restaurantName, String priceRange, String typeOfKitchen, String addressOfRestaurant) {
        this.restaurantName = restaurantName;
        this.priceRange = priceRange;
        this.typeOfKitchen = typeOfKitchen;
        this.addressOfRestaurant = addressOfRestaurant;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getTypeOfKitchen() {
        return typeOfKitchen;
    }

    public void setTypeOfKitchen(String typeOfKitchen) {
        this.typeOfKitchen = typeOfKitchen;
    }

    public String getAddressOfRestaurant() {
        return addressOfRestaurant;
    }

    public void setAddressOfRestaurant(String addressOfRestaurant) {
        this.addressOfRestaurant = addressOfRestaurant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("restaurantName='").append(restaurantName).append('\'');
        sb.append(", priceRange='").append(priceRange).append('\'');
        sb.append(", typeOfKitchen='").append(typeOfKitchen).append('\'');
        sb.append(", addressOfRestaurant='").append(addressOfRestaurant).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

