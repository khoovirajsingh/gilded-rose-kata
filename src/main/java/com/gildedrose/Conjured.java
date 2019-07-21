package com.gildedrose;

public class Conjured extends Item {
    Conjured(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    void update() {
        decrementQuality();
        decrementQuality();
        decrementSellin();
        updateExpired();
    }

    @Override
    void updateExpired() {
        if (isExpired()) {
            decrementQuality();
            decrementQuality();
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }
}
