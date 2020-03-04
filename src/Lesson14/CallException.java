package Lesson14;

import com.sun.applet2.preloader.CancelException;

import javax.activity.ActivityCompletedException;
import javax.naming.ConfigurationException;

public class CallException {
    public static void callFirstException() throws ActivityCompletedException {
        CheckedException.firstException();
    }

    public static void callSecondException() throws CancelException {
        CheckedException.secondException();
    }

    public static void callThirdException() throws ConfigurationException {
        CheckedException.thirdException();
    }
}
