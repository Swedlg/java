package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                FrameParking frameParking = new FrameParking();
                frameParking.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
