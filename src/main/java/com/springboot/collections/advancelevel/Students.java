package com.springboot.collections.advancelevel;

/**
 * @author prabhakar, @Date 16-05-2025
 */

public class Students {
    int id;
    String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Students)) return false;
        Students other = (Students) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
