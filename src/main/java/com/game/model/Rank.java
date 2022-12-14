package com.game.model;

public enum Rank {

        ACE("A", 1),
        TWO("2", 2),
        THREE("3", 3),
        FOUR("4", 4),
        FIVE("5", 5),
        SIX("6", 6),
        SEVEN("7", 7),
        EIGHT("8", 8),
        NINE("9", 9),
        TEN("10", 10),
        JACK("J", 11),
        QUEEN("Q", 12),
        KING("K", 13);

    private String face;

    private Integer value;

    Rank(String aFace, Integer aValue) {
        this.face = aFace;
        this.value = aValue;
    }

    public Integer getValue() {
        return this.value;
    }
}
