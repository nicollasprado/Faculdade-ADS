package Hashtable.DoubleHash;

// DH - Double hashing

import Hashtable.Student;

public class HashtableDH {
    private int size = 0;
    private int capacity = 8;
    private Student[] students = new Student[8];

    public HashtableDH() {
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

    private double efficiency(){
        return (double) size / capacity;
    }

    private int hashGet(String name, int capacity){
        String nameLower = name.toLowerCase();

        int sum = 0;
        for(int i = 0; i < nameLower.length(); i++){
            sum += nameLower.charAt(i) * (int) Math.pow(3, i);
        }

        return sum % capacity;
    }

    private int hash(String name, int capacity, Student[] array){
        String nameLower = name.toLowerCase();

        int sum = 0;
        for(int i = 0; i < nameLower.length(); i++){
            sum += nameLower.charAt(i) * (int) Math.pow(3, i);
        }

        int firstHash = sum % capacity;

        int index = firstHash;

        if(array[firstHash] != null){
            int secondHash = 7 + (sum % 7);

            index = secondHash;

            if(array[secondHash] != null){
                int finalHashIndex = 1;
                int finalHash = (firstHash + secondHash) % capacity;

                while(array[finalHash] != null){
                    finalHashIndex++;

                    finalHash = (firstHash + (finalHashIndex * secondHash)) % capacity;
                }

                index = finalHash;

            }

        }

        return index;
    }

    private void increaseCapacity(){
        int newCapacity = capacity * 2;
        Student[] newArray = new Student[newCapacity];

        for(Student student : students){
            if(student == null){
                continue;
            }

            int newIndex = hash(student.name, newCapacity, newArray);

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
        int index = hashGet(name, capacity);

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
        int index = hashGet(newStudent.name, capacity);

        Student iterStudent = students[index];


        while(iterStudent != null && !iterStudent.name.equalsIgnoreCase("DELETED")){
            index++;

            if(efficiency() >= 0.7 || index >= capacity){
                increaseCapacity();
            }

            iterStudent = students[index];
        }

        students[index] = newStudent;
        size++;
    }

    public void removeStudent(String name){
        int index = hashGet(name, capacity);

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
