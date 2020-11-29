package ua.lviv.lgs.serealization;

import java.io.*;

public class Methods {
    public void serealize(File file, Serializable serializable) throws Exception {
        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream object = new ObjectOutputStream(outputStream);
        object.writeObject(serializable);
        object.close();
    }
    public Serializable deserealize(File file) throws Exception {
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream object = new ObjectInputStream(inputStream);
        Serializable ser = (Serializable) object.readObject();
        object.close();
        inputStream.close();
        return ser;
    }
}
