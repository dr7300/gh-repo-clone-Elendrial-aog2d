package me.elendrial.aog2d.gameSystems.players.builders;

import me.elendrial.aog2d.gameSystems.gods.God;
import me.elendrial.aog2d.gameSystems.players.Player;

public class StandardPlayerBuilder implements PlayerBuilder {

	private God[] playerGods = new God[] {God.SARADOMIN, God.ZAMORAK, God.GUTHIX};
	
	public StandardPlayerBuilder setGods(God[] gods) {
		if(gods.length != 3) throw new RuntimeException("Must pass an array of length 3 to setGods()");
		playerGods = gods;
		return this;
	}
	
	@Override
	public Player build() {
		Player p = new Player();
		
		p.mana = 100;
		p.victoryPoints = 0;
		p.alignmentLevel.put(God.NEUTRAL, 1);
		
		for(God s : playerGods) p.alignmentLevel.put(s, 0);
		
		return p;
	}

}
