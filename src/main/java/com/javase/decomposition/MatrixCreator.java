package com.javase.decomposition;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;

public class MatrixCreator implements MatrixFiller {


    public static void fillRandomized(Matrix t, int start, int end) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                try {
                    int value = (int)(Math.random() * (end - start) + start);
                    t.setElement(i, j, value);
                } catch (MatrixException me) {
                    me.printStackTrace();
                }
            }
        }
    }

    @Override
    public void fillFromFile(Matrix t, File file) {}

    @Override
    public void fillFromStream(Matrix t, InputStream inputStream) {}

    @Override
    public void fillFromDatabase(Matrix t, Connection connection) {}
}
