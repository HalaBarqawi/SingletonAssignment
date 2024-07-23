import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogSingelton {
    public static LogSingelton instance;
    private PrintWriter logFile;

    // private constructor as a step to apply the singelton pattern
    private LogSingelton() {
        try {
            logFile = new PrintWriter(new FileWriter("logFile.log"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogSingelton getInstance() {
        if (instance == null) {
            instance = new LogSingelton();
            return instance;

        }
        return instance;

    }

    // function to add new logs to the log file
    public void log(String s) {
        logFile.println(s);
        logFile.flush();

    }

    // to close the log file
    public void closeLogFile() {
        logFile.close();
    }

}
