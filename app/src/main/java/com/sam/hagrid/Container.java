package com.sam.hagrid;

import processing.core.PApplet;

public class Container {
    PApplet app;
    Grid grid;
    int x;
    int y;
    int w;
    int h;
    int margin;
    int smallestSide;
    private int background;
    private int targetBackground;
    private float lerpiness = .2f;

    Container(PApplet app, int x, int y, int width, int height) {
        this.app = app;
        this.x = x;
        this.y = y;
        w = width;
        h = height;
        smallestSide = Math.min(width, height);
        margin = smallestSide / 5;
        grid = new Grid(app, x + margin, y + margin, w - 2 * margin, h - 2 * margin);
        background = app.color(255, 255, 255);
    }

    void display() {
        background = Math.round(app.lerpColor(background, targetBackground, lerpiness));
        app.fill(background);
        app.noStroke();
        app.rect(x, y, w, h);
        grid.display();
    }

    public void setColor(int color) {
        this.targetBackground = color;
    }

    Grid getGrid() {
        return grid;
    }
}
