/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemowin24wedpm;

/**
 *Modified on Jan 17th at 2.28PM by Ronak
 * @author Ronak
 */
public class studentList {
    public static void main(String[] args){
        Student s1 = new Student(1,"Ronak");        
        Student[] studentList = new Student[3];        
        studentList[0]=s1;
        studentList[1]=new Student(2,"Sheth");
        studentList[2]=new Student(3,"abc");        
        for(int i =0;i<studentList.length;i++){
            System.out.println(studentList[i].getsName());
        }       
    }//end of main    
}//end of class
