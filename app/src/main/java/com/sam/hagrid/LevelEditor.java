package com.sam.hagrid;

import processing.core.PApplet;

class LevelEditor extends Container {

    private boolean isSelected = true;
    private int colorDefault;
    private int colorSelected;

    LevelEditor(PApplet app, int x, int y, int width, int height) {
        super(app, x, y, width, height);
        colorDefault = app.color(255);
        colorSelected = app.color(200);
    }

    void mouseClicked() {
        isSelected = !isSelected;
        if (isSelected) {
            int centeredX = x + margin + (w / 2) - (grid.getWidth() / 2);
            int centeredY = y + margin + (h / 2) - (grid.getHeight() / 2);
            getGrid().setSize(centeredX, centeredY, w - 2 * margin, h - 2 * margin);
            setColor(colorSelected);
        }
        else {
            int centeredX = (h > w ? 0 : (w - h) / 2);
            int centeredY = (h > w ? (h - w) / 2 : 0);
            getGrid().setSize(centeredX, centeredY, w, h);
            setColor(colorDefault);
        }
    }

}
