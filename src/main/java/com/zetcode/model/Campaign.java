package com.zetcode.model;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.ArrayList;
import java.util.List;

public class Campaign {

    private Long id;
    private String name;
    private List<String> keywords;
    private double bidAmount;
    private double campaignFund;
    private Boolean status;
    private City town;
    private int radius;

    public Campaign() {}

    public Campaign(Long id, String name, List<String> keywords, double bidAmount, double campaignFund, Boolean status, City town, int radius) {
        this.id = id;
        this.name = name;
        this.keywords = new ArrayList(keywords);
	this.bidAmount = bidAmount;
	this.campaignFund = campaignFund;
	this.status = status;
	this.town = town;
	this.radius = radius;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campaign campaign = (Campaign) o;
        return population == city.population &&
                Objects.equals(id, city.id) &&
                Objects.equals(name, city.name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Campaign.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("bid amount=" + bidAmount + " USD")
                .add("campaign fund=" + campaignFund + " USD")
                .add("status=" + status)
                .add("town=" + town)
                .add("radius=" + radius + "km")
                .toString();
    }
}
