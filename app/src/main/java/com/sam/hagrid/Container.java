package com.sam.hagrid;

import processing.core.PApplet;

public class Container {
    PApplet app;
    Grid grid;
    private int x;
    private int y;
    private int w;
    private int h;
    private int margin;
    private int smallestSide;

    Container(PApplet app, int x, int y, int width, int height) {
        this.app = app;
        this.x = x;
        this.y = y;
        w = width;
        h = height;
        smallestSide = Math.min(width, height);
        margin = smallestSide / 5;
        grid = new Grid(app, x + margin, y + margin, w - 2 * margin, h - 2 * margin);
    }

    void display() {
        app.rect(x, y, w, h);
        grid.display();
    }
}
