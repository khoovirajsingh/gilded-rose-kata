package com.gildedrose;

public class Item {

    String name;
    int sellIn;
    int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrie(sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass(sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfurus(sellIn, quality);
            case "Conjured":
                return new Conjured(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }

    void update() {
        decrementQuality();
        decrementSellin();
        updateExpired();
    }

    void updateExpired() {
        if (isExpired()) {
            decrementQuality();
        }
    }

    void decrementSellin() {
        sellIn--;
    }

    void decrementQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    void incrementQuality() {
        if (quality < 50) {
            quality++;
        }
    }

    boolean isExpired() {
        return sellIn < 0;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
