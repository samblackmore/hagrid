package com.sam.hagrid;

import processing.core.PApplet;

public class LevelEditor extends Container {

    boolean isSelected = true;
    int colorDefault;
    int colorSelected;

    LevelEditor(PApplet app, int x, int y, int width, int height) {
        super(app, x, y, width, height);
    }

    void mouseClicked() {
        isSelected = !isSelected;
        if (isSelected) {
            getGrid().setSize(x + margin, y + margin, w - 2 * margin, h - 2 * margin);
            setColor(app.color(200));
        }
        else {
            getGrid().setSize(x, y, w, h);
            setColor(app.color(255));
        }
    }

}
