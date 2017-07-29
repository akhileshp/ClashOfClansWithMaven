package com.clashofclans;

import com.clashofclans.exception.BarbarianKilledException;
import com.clashofclans.model.Barbarian;
import com.clashofclans.model.Cannon;
import com.clashofclans.service.Game;
import org.junit.Test;

public class TestAttack {
    @Test(expected = BarbarianKilledException.class)
    public void shouldDefenceWinWithOneBarbarianAndOneCannon(){

        final Cannon cannon = new Cannon(10, 3);
        final Barbarian barbarian = new Barbarian(8, 45);

        new Game().armyAttackOnVillage(cannon, barbarian);

    }
}
