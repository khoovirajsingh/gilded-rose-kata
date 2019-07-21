package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    void update() {
        incrementQuality();
        if (sellIn < 11) {
            incrementQuality();
        }

        if (sellIn < 6) {
            incrementQuality();
        }
        decrementSellin();
        updateExpired();
    }

    @Override
    void updateExpired() {
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
