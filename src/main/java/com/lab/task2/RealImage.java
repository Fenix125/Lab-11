package com.lab.task2;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


//create a ProxyImage wrapper that stores the path, and when displaying, only show the image
public class RealImage implements MyImage {
    private JFrame frame;
    private String filepath;
    public RealImage(String filepath) {
        this.filepath = filepath;
        loadImage();
    }
    public void display() {
        frame.setVisible(true);
    }
    private void loadImage(){
        if (frame == null){
            frame = new JFrame();
            ImageIcon icon = new ImageIcon(filepath);
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
        }
    }
}
