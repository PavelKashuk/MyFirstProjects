package Lesson14;

import com.sun.applet2.preloader.CancelException;

import javax.activity.ActivityCompletedException;
import javax.naming.ConfigurationException;

public class CheckedException {
    public static void firstException() throws ActivityCompletedException {
        throw new ActivityCompletedException("Exception one");
    }

    public static void secondException() throws CancelException {
        throw new CancelException("Exception two");
    }

    public static void thirdException() throws ConfigurationException {
        throw new ConfigurationException("Exception three");
    }
}
