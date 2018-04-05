package com.javase.decomposition;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;

public interface MatrixFiller {
    void fillRandomized(Matrix t, int start, int end);
    void fillFromFile(Matrix t, File file);
    void fillFromStream(Matrix t, InputStream inputStream);
    void fillFromDatabase(Matrix t, Connection connection);
}
