import javax.swing.*;
import java.awt.*;

public class Controller {
    public static boolean attemptWriteFile(DTO dto){
        if (!dto.password.equals("rainbow")){
            return false;
        }


        // happy path


        try {
            return Data.writeData(dto.name, dto.c);
        } catch (Data.CouldNotWriteToFileException cnwtfe) {
            
            return false;

        }
    }
    
}
