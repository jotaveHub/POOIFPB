package model;

import java.io.IOException;

public class GenericDao<T> implements Dao<T> {

    private File file;

    public GenericDao(String path) throws IOException {
        file = new File(path);
        if(!file.exists()) {
            File parent = new File(file.getAbsoluteFile().getParent());
            parent.mkdir();
            file.createNewFile();
        }
    }

    @Override

}
