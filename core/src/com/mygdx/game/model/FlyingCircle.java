package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class FlyingCircle {
    private int x;
    private int y;
    private float vx;
    private float vy;
    private Texture texture;
    public void render(Batch batch) {

        texture = new Texture("circle.png");
        batch.draw(texture, this.x, this.y);
    }

    public FlyingCircle(int x, int y, float vx, float vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public float getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }

}
