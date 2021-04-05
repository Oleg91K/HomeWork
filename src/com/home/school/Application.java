package com.home.school;

public class Application {

    public static void main(String[] args) {
        Student student = new Student("Олег", 29, "Java", 9) {
            @Override
            public void learn(int count) {

            }
        };
        Teacher teacher =new Teacher("Дарья",29,"Java");
        Director director = new Director("Николай", 45) {


            @Override
            public void startStudy(int count) {

            }

            @Override
            public void endStudy(int count) {

            }
        };
        School school=new School("ИТМО");
        System.out.println("В прекрасный солнечный день в школе");
        System.out.println(school.getNameSchool());
        System.out.println("в"+" "+director.startStudy()+" "+"утра");
        System.out.println("Директор"+" "+director.getNameDirector()+" "+"объявил начало занятий");
        System.out.println("учитель"+" "+teacher.getNameTeacher()+" "+"преступила учить учеников"+" "+teacher.getObjectTS());
        System.out.println("ученик"+" "+student.getNameStudent()+" " + "старается учится у Дарьи "+student.getObjectS());
        System.out.println("с каждым уроком уровень знаний Олега повышается на ");
        System.out.println(student.learn());
        System.out.println("До конца урока остается совсем немного времени и");
        System.out.println("Директор объявляет окончание занятий");
        System.out.println(director.endStudy()+" "+"вечера");






    }
}
