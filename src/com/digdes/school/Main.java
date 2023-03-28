package com.digdes.school;

public class Main {

    public static void main(String... args){
        JavaSchoolStarter starter = new JavaSchoolStarter();
        try {

            starter.insertColumn(0, "id", 1);
            starter.insertColumn(0, "lastName", "Федоров");
            starter.insertColumn(0, "age", 40);
            starter.insertColumn(0, "cost", 5.4);
            starter.insertColumn(0, "active", true);

            String[] columns = {"id", "lastName", "age", "cost", "active"};
            Object[] values = {2, "Иванов", 40, 4.7, false};
            starter.insertRow(1, columns, values);

            starter.delete(0);

            //Вставка строки в коллекцию
            //List<Map<String,Object>> result1 = starter.execute("INSERT VALUES 'lastName' = 'Федоров' , 'id'=3, 'age'=40, 'active'=true");
            //Изменение значения которое выше записывали
            //List<Map<String,Object>> result2 = starter.execute("UPDATE VALUES 'active'=false, 'cost'=10.1 where 'id'=3");
            //Получение всех данных из коллекции (т.е. в данном примере вернется 1 запись)
            //List<Map<String,Object>> result3 = starter.execute("SELECT");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
