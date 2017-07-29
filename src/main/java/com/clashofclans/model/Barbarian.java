package com.clashofclans.model;


import com.clashofclans.exception.BarbarianKilledException;

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
        if (health <= 0) {
            throw new BarbarianKilledException();
        }
    }
}
