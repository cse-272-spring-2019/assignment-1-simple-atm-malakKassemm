package sample;

import java.util.List;
import java.util.ArrayList;


public class Array {

    public static List<String> History = new ArrayList(6);

    public static List<String> getHistory() {
        return History;
    }

    public static void setHistory(List<String> history) {
        History = history;
    }
}
