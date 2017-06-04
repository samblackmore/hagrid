package com.sam.hagrid;

import processing.core.PApplet;

class Grid {
    private PApplet app;
    private int rows = 3;
    private int cols = 3;
    private int x;
    private int y;
    private int w;
    private int h;
    private int cellW;
    private int cellH;
    private int targetX;
    private int targetY;
    private int targetWidth;
    private int targetHeight;
    private float lerpiness = .2f;

    Grid(PApplet app, int x, int y, int width, int height) {
        this.app = app;
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
        targetX = x;
        targetY = y;
        targetWidth = width;
        targetHeight = height;
    }

    void display() {
        x = Math.round(PApplet.lerp(x, targetX, lerpiness));
        y = Math.round(PApplet.lerp(y, targetY, lerpiness));
        w = Math.round(PApplet.lerp(w, targetWidth, lerpiness));
        h = Math.round(PApplet.lerp(h, targetHeight, lerpiness));
        cellW = w / cols;
        cellH = h / rows;
        // Make cells always be square
        if (cellW > cellH) cellW = cellH;
        else cellH = cellW;
        // Set new grid dimensions
        w = cols * cellW;
        h = rows * cellH;

        app.stroke(0);
        app.fill(255);
        app.rect(x, y, w, h);
        for (int i = 1; i < cols; i++)
            app.line(x + i * cellW, y, x + i * cellW, y + h);
        for (int i = 1; i < rows; i++)
            app.line(x, y + i * cellH, x + w, y + i * cellH);
    }

    void setSize(int x, int y, int width, int height) {
        targetX = x;
        targetY = y;
        targetWidth = width;
        targetHeight = height;
    }

    int getWidth() {
        return w;
    }

    int getHeight() {
        return h;
    }
}
