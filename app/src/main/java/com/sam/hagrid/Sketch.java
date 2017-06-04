package com.sam.hagrid;

import processing.core.PApplet;

public class Sketch extends PApplet {
    public void settings() {
        fullScreen();
    }

    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
