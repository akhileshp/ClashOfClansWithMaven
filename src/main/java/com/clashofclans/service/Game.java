package com.clashofclans.service;


import com.clashofclans.model.Barbarian;
import com.clashofclans.model.Cannon;

public class Game {

    public String armyAttackOnVillage(Cannon cannon,
                                    Barbarian barbarian) {

        final int cannonDamagePerHit = cannon.getDamagePerHit();
        final int barbarianDamagePerHit = barbarian.getDamagePerHit();
        while (true) {

            barbarian.hitByEnemy(cannonDamagePerHit);
            cannon.hitByEnemy(barbarianDamagePerHit);
            if(barbarian.isAlive() && cannon.isAlive()){
                continue;
            }
            if(!barbarian.isAlive()){
                return "Defence Wins";
            } else if(!cannon.isAlive()){
                return "Attack Wins";
            }
        }
    }
}
