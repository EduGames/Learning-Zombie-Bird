package com.me.zbirds.GameWorld;

import com.me.zbirds.GameObjects.Bird;

/**
 * Created by mohheader on 16/07/14.
 */
public class GameWorld {
    private Bird bird;

    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;

    }
}