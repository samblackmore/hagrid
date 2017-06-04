package com.sam.hagrid;

import processing.core.PApplet;

public class Sketch extends PApplet {

    LevelEditor levelEditor;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        levelEditor = new LevelEditor(this, 0, 0, width, height);
    }

    public void draw() {
        levelEditor.display();
    }

    public void mouseReleased() {
        levelEditor.mouseClicked();
    }

    public void mouseClicked() {
        levelEditor.mouseClicked();
    }
}
