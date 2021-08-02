package com.urpagin;

import com.sun.xml.internal.ws.api.pipe.Engine;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        setTitle("Window!");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Window t = new Window();
    }
}