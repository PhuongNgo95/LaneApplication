package src.sample.RFID.Controller;

import java.net.ServerSocket;
import java.net.Socket;
import com.reader.sdk.*;

public class RFIDController {

    Reader reader = new Reader(new CLIInterface());
    String hostname = "titan-02733334";
    ReaderInterface readerInterface = new ReaderInterface();

    
}
