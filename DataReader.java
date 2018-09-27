/**
 * This class @ DataReader reads the data from file (fileName)
 * 
 * 
 * 
 */
//package tasktracker;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  Umair
 * @version 2018.09.26
 */
public class DataReader {

    private final String fileName;

    /**
     *
     * @param fileName intakes the file
     */
    public DataReader(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     * @return the taskList
     */
    public List<ToDoTaskList> readFromFile() {

        List<ToDoTaskList> taskList = new ArrayList<>();



}
