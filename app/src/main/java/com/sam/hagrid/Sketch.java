package com.sam.hagrid;

import processing.core.PApplet;

public class Sketch extends PApplet {

    Container container;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        container = new Container(this, 100, 100, 100, 200);
    }

    public void draw() {
        container.display();
    }
}
