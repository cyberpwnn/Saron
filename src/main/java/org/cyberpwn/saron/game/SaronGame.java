package org.cyberpwn.saron.game;

import org.phantomapi.game.GamePlugin;
import org.phantomapi.game.PhantomGame;

public abstract class SaronGame extends PhantomGame implements SaronGameInstance
{
	public SaronGame(GamePlugin plugin)
	{
		super(plugin);
	}
}
