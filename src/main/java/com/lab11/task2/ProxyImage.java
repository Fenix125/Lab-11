package com.lab11.task2;

public class ProxyImage implements MyImage{
    private RealImage realImage;
    private String filepath;

    public ProxyImage(String filepath){
        this.filepath = filepath;
    }
    
    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(filepath);
        }
        realImage.display();
    }
}
