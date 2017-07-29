package com.clashofclans.service;


import com.clashofclans.model.Barbarian;
import com.clashofclans.model.Cannon;

public class Game {

    public void armyAttackOnVillage(Cannon cannon,
                                    Barbarian barbarian) {

        final int cannonDamagePerHit = cannon.getDamagePerHit();
        final int barbarianDamagePerHit = barbarian.getDamagePerHit();
        while (true) {

            barbarian.hitByEnemy(cannonDamagePerHit);
            cannon.hitByEnemy(barbarianDamagePerHit);

        }
    }
}
