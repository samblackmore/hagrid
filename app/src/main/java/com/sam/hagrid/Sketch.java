package com.sam.hagrid;

import processing.core.PApplet;

public class Sketch extends PApplet {

    Grid mainGrid;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        mainGrid = new Grid(this, 100, 100, 100, 200);
    }

    public void draw() {
        mainGrid.display();
    }
}
