package com.example.grocerystore.models;

public class ModelShop {
    private String uid, email, name, shopName, phone, deliveryFee, country, state,
            city, address, timestamp, accountType, online, profileImage;
    private boolean shopOpen;
    private double longitude ,latitude;

    public ModelShop() {
    }

    public ModelShop(String uid, String email, String name, String shopName, String phone, String deliveryFee, String country, String state, String city, String address, String timestamp, String accountType, String online, String profileImage, boolean shopOpen, double longitude, double latitude) {
        this.uid = uid;
        this.email = email;
        this.name = name;
        this.shopName = shopName;
        this.phone = phone;
        this.deliveryFee = deliveryFee;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.timestamp = timestamp;
        this.accountType = accountType;
        this.online = online;
        this.profileImage = profileImage;
        this.shopOpen = shopOpen;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public boolean isShopOpen() {
        return shopOpen;
    }

    public void setShopOpen(boolean shopOpen) {
        this.shopOpen = shopOpen;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
