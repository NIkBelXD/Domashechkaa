/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzz;

/**
 *
 * @author nikit
 */
public class Group {
    
    //Поля объектов класса Group
    //int SVH1018;
    private int id;
    //вариант 1
    //public String name;
    //вариант 2
    private String mName;
    
    //Задание - пункт 1:
    //добавить поле для объектов, которое будет хранить число -
    //средний балл успеваемости
    private double mScore;
    
    public double getScore() {
        return mScore;
    }

    //Задание - пункт 2:
    //добавить методы чтения и установки для поля балла успеваемости
    public void setScore(double _score) throws Exception {
        
        if (_score <= 12 && _score >= 4) {
            mScore = _score;
        } else {
        
            throw new Exception("Средний балл должен быть в диапазоне от 4 до 12");
        }
        
    }
    
    //Поле класса Group
    private static int newId = 1;

    //Конструктор без параметров
    public Group() {
        
        //Вызов конструктора с параметром с передачей ему пустой строки
        this("");
    }
    
    //Конструктор с параметром _name строкового типа
    public Group(String _name) {
        
        //Присвоение полю объекта значения из поля класса
        id = newId;
        //Увеличение значения поля класса на 1 - для будущего объекта
        newId++;
        
        //вариант 1
        //this.name = _name;
        //вариант 2
        //Присвоение внутреннему полю объекта значения из параметра конструктора
        mName = _name;
    }

    //Метод чтения значения поля id из текущего объекта
    public int getId() {
        return id;
    }

    //Метод чтения значения поля mName из текущего объекта
    public String getName() {
        return mName;
    }

    //Метод записи значения во внутреннее поле объекта mName
    //, полученного как аргумент
    public void setName(String _name) throws Exception {
        
        //mName = _name;
        if (_name.length() <= 10) {
            mName = _name;
        } else {
        
            throw new Exception("Имя группы должно быть не более 10 символов");
        }
    }
}
