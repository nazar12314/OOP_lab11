package org.example.task3;

public class ProxyImage implements MyImage {

    private final String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }


    @Override
    public void display() {
        RealImage image = new RealImage(filename);
        image.display();
    }
}
