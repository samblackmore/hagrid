package com.sam.hagrid;

import processing.core.PApplet;

class Grid {
    private PApplet app;
    private int rows = 2;
    private int cols = 2;
    private int x;
    private int y;
    private int w;
    private int h;
    private int cellW;
    private int cellH;
    private int smallestSide;

    Grid(PApplet app, int x, int y, int width, int height) {
        this.app = app;
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
        smallestSide = Math.min(width, height);
        cellW = width / cols;
        cellH = height / rows;
        // Make cells always be square
        if (cellW > cellH) cellW = cellH;
        else cellH = cellW;
        // Set new grid dimensions
        w = cols * cellW;
        h = rows * cellH;
    }

    void display() {
        app.rect(x, y, w, h);
        for (int i = 1; i < cols; i++)
            app.line(x + i * cellW, y, x + i * cellW, y + h);
        for (int i = 1; i < rows; i++)
            app.line(x, y + i * cellH, x + w, y + i * cellH);
    }
}
