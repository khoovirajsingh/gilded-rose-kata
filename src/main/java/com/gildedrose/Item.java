package com.gildedrose;

public class Item {

    public String name;
    public int sellIn;
    public int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
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
        if (sellIn < 0) {
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

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
