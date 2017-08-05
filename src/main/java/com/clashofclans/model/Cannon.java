package com.clashofclans.model;


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
    }

    public boolean isAlive() {
        return hitPoints >= 0;
    }
}
