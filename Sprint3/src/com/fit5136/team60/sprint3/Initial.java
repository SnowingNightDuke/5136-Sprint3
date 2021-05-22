package com.fit5136.team60.sprint3;

import javax.swing.*;

public class Initial {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Chair(null);
            }
        });
    }
}
