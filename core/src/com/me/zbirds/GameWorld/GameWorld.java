package com.me.zbirds.GameWorld;

import com.me.zbirds.GameObjects.Bird;
import com.me.zbirds.GameObjects.ScrollHandler;

/**
 * Created by mohheader on 16/07/14.
 */
public class GameWorld {
    private Bird bird;
    private ScrollHandler scroller;

    public GameWorld(int midPointY) {
        bird = new Bird(33, midPointY - 5, 17, 12);
        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {
        return bird;
    }
    public ScrollHandler getScroller() {
        return scroller;
    }
}
