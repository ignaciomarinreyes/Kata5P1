package kata5p1;

import java.io.IOException;
import java.util.List;

public class Kata5P1 {

    public static void main(String[] args) throws IOException {
        CrearTabla.createNewTable();
        String rutaEmail = "email";

        List<String> mailList = MailListReader.read(rutaEmail);
        for (int i = 0; i < mailList.size(); i++) {
            InsertarDatosTabla.insert(mailList.get(i));
        }
    }
}
