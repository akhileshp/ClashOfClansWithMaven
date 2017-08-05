package com.clashofclans.model;


public class Barbarian {
    private final int damagePerHit;
    private int health;

    public Barbarian(final int damagePerHit, final int health) {
        this.damagePerHit = damagePerHit;
        this.health = health;
    }

    public int getDamagePerHit() {
        return damagePerHit;
    }

    public int getHealth() {
        return health;
    }

    public void hitByEnemy(int hitPower) {
        health -= hitPower;
    }

    public boolean isAlive() {
        return health >= 0;
    }
}
