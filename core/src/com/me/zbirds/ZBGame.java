package com.me.zbirds;

import com.badlogic.gdx.Game;
import com.me.zbirds.Screens.GameScreen;

public class ZBGame extends Game {
	@Override
	public void create () {
        setScreen(new GameScreen());
	}

	@Override
	public void render () {
	}
}
