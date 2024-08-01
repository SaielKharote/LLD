package org.saiel.DesignPatterns.Creational.Builder;

public class Client {

    public static void main(String[] args) {
        Student student = Student.builder()
                .setAge(22)
                .setBatch("Nov21")
                .setPsp(99)
                .setYoe(2)
                .setGradYear(2021)
                .setName("Saiel")
                .build();

        System.out.println(student.yoe);
    }
}
