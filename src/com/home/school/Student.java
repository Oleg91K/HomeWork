package com.home.school;

public abstract class Student implements StudInterface{
public String nameStudent;
public int ageStudent;
public String ObjectS;
public int skillS;

    public Student(String nameStudent, int ageStudent, String objectS, int skillS) {
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        ObjectS = objectS;
        this.skillS = skillS;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        if(ageStudent<=0) System.out.println("Он не может учиться!");
        this.ageStudent = ageStudent;
    }

    public String getObjectS() {
        return ObjectS;
    }

    public void setObjectS(String objectS) {
        ObjectS = objectS;
    }

    public int getSkillS() {
        return skillS;
    }

    public void setSkillS(int skillS) {
        if(skillS<0)this.skillS=0;
        this.skillS = skillS;
    }

    public int learn() {
         int count= 1 + (int) (Math.random() * 9);
        setSkillS(this.skillS+count);

        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", ageStudent=" + ageStudent +
                ", ObjectS='" + ObjectS + '\'' +
                ", skillS=" + skillS +
                '}';
    }

    @Override
    public void info() {
        System.out.println("nameStudent:"+ this.nameStudent+"\nageStudent"+this.ageStudent+"ObjectS"+this.ObjectS);;

    }



}
