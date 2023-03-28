package com.digdes.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaSchoolStarter {

    private final List<Map<String,Object>> table = new ArrayList<>();

    public JavaSchoolStarter(){

    }

    public void insertColumn(int index, String column, Object value){

        Map<String, Object> row;

        if (index >= table.size() || index < 0){
            row = new HashMap<>();
            row.put(column, value);
            table.add(index, row);
        } else {
            row = table.get(index);
            row.put(column, value);
            table.set(index, row);
        }

    }

    public void insertRow (int index, String[] columns, Object[] values){

        for (int i = 0; i < columns.length; i++)

            insertColumn(index, columns[i], values[i]);

    }

    public void delete (int index) throws Exception{

        if (index >= table.size() || index < 0){
            throw new Exception("Подходящих строк нету в коллекции!");
        } else {
            table.remove(index);
        }

    }

    public void select (int index){

        System.out.println(table.get(index));

    }

    public void parseRequest(String request) throws Exception{

        int length = request.length();

        if (length < 1) throw new Exception("Запрос пустой");



    }
    public List<Map<String,Object>> execute(String request) throws Exception {

        //code

        return new ArrayList<>();
    }
}
