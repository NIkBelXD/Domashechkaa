/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzz;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author nikit
 */
public class DZz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Задание - пункт 3:
        //записать число - средний балл - в каждую из групп
        //, затем - вывод этимх данных в консоль из всех трех групп
        
        Group group1 = new Group();
        Group group2 = new Group("МА 13-12");
        Group group3 = new Group();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        
        /*try {
            group2.setScore(9);
        } catch (Exception ex) {
            Logger.getLogger(DZz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(group2.getScore());
        
        try {
            group3.setScore(19);
        } catch (Exception ex) {
            //Logger.getLogger(DZz.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        System.out.println(group3.getScore());
        
        try {
            //group1.id = 100;
            //group1.mName = "СВШ 10-18";
            group1.setName("СВШ 10-18");
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
        try {
            //****
            group1.setName("asdfcdgfd b gfnhgm dbfhjh");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }*/
        
        //student1.id = 1;
       try{
        student1.setName ("Имя1");
       }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        try{
        student1.setGroup_id(10);
       }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
       
        
        //student2.id = 2;
        try{
        student2.setName ("Имя2");
       }catch(Exception ex) {
            
        }
        try{
        student2.setGroup_id(20);
       }catch(Exception ex) {
            
        }
        try{
        student3.setName ("Имя2");
       }catch(Exception ex) {
            
        }
        try{
        student3.setGroup_id(30);
       }catch(Exception ex) {
            
        }
       List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
       
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getGroup_id());
        }
        //System.out.println(group1.id);
        //System.out.println(group2.id);
                
        //System.out.println(group1.getId());
        //System.out.println(group2.getId());
        //System.out.println(group3.getId());
        
        //System.out.println(group1.getName());
        
        /*student1.NIkita = 10;
        student1.Maxim = 6;
        student1.Artiem = 8;
        
        System.out.println(student1.NIkita);
        System.out.println(student1.Maxim);
        System.out.println(student1.Artiem);
        
        student2.NIkita = 11;
        student2.Maxim = 16;
        student2.Artiem = 88;
        
        System.out.println(student2.NIkita);
        System.out.println(student2.Maxim);
        System.out.println(student2.Artiem);
        
        group1.SVH1018 = 1445;
        
        System.out.println(group1.SVH1018);*/
        
        /*List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        
        for (Group group : groups) {
            System.out.println(group.getScore());
        }*/
    }
    
}
