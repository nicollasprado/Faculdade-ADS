package Hashtable.LinearProbing;

// LP - Linear Probing

import Hashtable.Student;

public class HashtableLP {
    private int size = 0;
    private int capacity = 8;
    private Student[] students = new Student[8];

    public HashtableLP() {
    }

    public void print(){
        for(int i = 0; i < capacity; i++){
            Student student = students[i];

            if(student != null){
                System.out.print(student.name + ", ");
            }else{
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    private int hash(String name){
        String nameLower = name.toLowerCase();

        int sum = 0;
        for(int i = 0; i < nameLower.length(); i++){
            sum += nameLower.charAt(i) * (int) Math.pow(3, i);
        }

        return sum % this.capacity;
    }

    private int hash(String name, int capacity){
        String nameLower = name.toLowerCase();

        int sum = 0;
        for(int i = 0; i < nameLower.length(); i++){
            sum += nameLower.charAt(i) * (int) Math.pow(3, i);
        }

        return sum % capacity;
    }

    private void increaseCapacity(){
        int newCapacity = capacity * 2;
        Student[] newArray = new Student[newCapacity];

        for(Student student : students){
            if(student == null){
                continue;
            }

            int newIndex = hash(student.name, newCapacity);

            Student newStudent = newArray[newIndex];

            while(newStudent != null){
                newIndex++;
                newStudent = newArray[newIndex];
            }

            newArray[newIndex] = student;
        }

        this.students = newArray;
        this.capacity = newCapacity;
    }

    public int size(){
        return this.size;
    }

    public int getStudentGrade(String name){
        int index = hash(name);

        Student foundStudent = students[index];
        int grade = -1;

        if(foundStudent != null){
            Student studentIter = students[index];

            while(studentIter != null && !studentIter.name.equalsIgnoreCase(name) && index < capacity){
                index++;
                studentIter = students[index];
            }

            if(studentIter != null && studentIter.name.equalsIgnoreCase(name)){
                grade = studentIter.grade;
            }

        }

        return grade;
    }

    public void addStudent(Student newStudent){
        int index = hash(newStudent.name);

        Student iterStudent = students[index];


        while(iterStudent != null && !iterStudent.name.equalsIgnoreCase("DELETED")){
            index++;

            if(index >= capacity){
                increaseCapacity();
            }

            iterStudent = students[index];
        }

        students[index] = newStudent;
        size++;
    }

    public void removeStudent(String name){
        int index = hash(name);

        Student foundStudent = students[index];

        while(foundStudent != null){
            if(foundStudent.name.equalsIgnoreCase(name)){
                students[index] = new Student("DELETED", -1);
                size--;
                break;
            }

            index++;
            foundStudent = students[index];
        }

    }

}
