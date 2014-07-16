package com.me.zbirds;

import com.badlogic.gdx.Game;
import com.me.zbirds.Helpers.AssetLoader;
import com.me.zbirds.Screens.GameScreen;

public class ZBGame extends Game {
    @Override
	public void create(){
        System.out.println("ZBGame - create");
        AssetLoader.load();
        setScreen(new GameScreen());
	}

	@Override
	public void render () {
        super.render();
        System.out.println("ZBGame - render");
	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
