package com.clashofclans.model;


import com.clashofclans.exception.CannonKilledException;

public class Cannon {

    private final int damagePerHit;
    private int hitPoints;

    public Cannon(final int damagePerHit, final int hitPoints) {
        this.damagePerHit = damagePerHit;
        this.hitPoints = hitPoints;
    }

    public int getDamagePerHit() {
        return damagePerHit;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void hitByEnemy(int hitPower) {
        hitPoints -= hitPower;
        if (hitPoints <= 0) {
            throw new CannonKilledException();
        }
    }
}
