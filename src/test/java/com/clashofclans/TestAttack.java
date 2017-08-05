package com.clashofclans;

import com.clashofclans.model.Barbarian;
import com.clashofclans.model.Cannon;
import com.clashofclans.service.Game;
import org.junit.Test;

public class TestAttack {
    @Test
    public void shouldDefenceWinWithOneBarbarianAndOneCannon(){

        final Cannon cannon = new Cannon(10, 390);
        final Barbarian barbarian = new Barbarian(8, 45);

        final String winner = new Game().armyAttackOnVillage(cannon, barbarian);

        assert "Defence Wins".equals(winner);

    }
}
