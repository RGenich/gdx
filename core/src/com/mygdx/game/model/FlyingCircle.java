package com.mygdx.game.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

public class FlyingCircle {
    private Vector2 position;
    private Vector2 velocity;
    private Texture texture;

    public void render(Batch batch) {

        if (this.texture == null) this.texture = new Texture("r2.png");
        ckeckScreeEnds();
        this.position.add(velocity);
        if (Gdx.input.isTouched()) {
            Vector2 mouseVec = new Vector2(Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY());
            Vector2 newVelocity = mouseVec.sub(position);
            this.velocity = newVelocity;
        }
        batch.draw(this.texture, this.position.x, this.position.y);

    }

    private void ckeckScreeEnds() {
        if (position.x <= 0 || position.x >= Gdx.graphics.getWidth() - texture.getWidth()) {
            this.velocity.x = -1 * velocity.x;
        }
        if (position.y <= 0 || position.y >= Gdx.graphics.getHeight() - texture.getHeight()) {
            this.velocity.y = -1 * velocity.y;
        }
    }


    public FlyingCircle(Vector2 pos, Vector2 vel) {
        this.position = pos;
        this.velocity = vel;
    }

    public float getX() {
        return this.position.x;
    }

    public void setX(float x) {
        this.position.x = x;
    }

    public float getY() {
        return this.position.y;
    }

    public void setY(float y) {
        this.position.y = y;
    }

}
