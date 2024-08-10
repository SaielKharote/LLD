package org.saiel.DesignPatterns.Creational.Prototype;


public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student aprBatch = new Student();
        aprBatch.setBatchName("April LLD Batch");
        aprBatch.setAvgBatchPsp(90);
        aprBatch.setYearOfEnrollment(2021);
        studentRegistry.save(aprBatch);


        Student mayBatch = new Student();
        mayBatch.setBatchName("May LLD Batch");
        mayBatch.setAvgBatchPsp(80);
        mayBatch.setYearOfEnrollment(2021);
        studentRegistry.save(mayBatch);


        Student janBatch = new Student();
        janBatch.setBatchName("Jan LLD Batch");
        janBatch.setAvgBatchPsp(95);
        janBatch.setYearOfEnrollment(2022);
        studentRegistry.save(janBatch);

        Student aprBatchStudent1 = studentRegistry.get("April LLD Batch").clone();
        Student aprBatchStudent2 = studentRegistry.get("April LLD Batch").clone();
        Student mayBatchStudent1 = studentRegistry.get("May LLD Batch").clone();
        Student janBatchStudent1 = studentRegistry.get("Jan LLD Batch").clone();

        System.out.println(aprBatchStudent1.getAvgBatchPsp());

        System.out.println(janBatchStudent1.getAvgBatchPsp());

//        instantiate intelligentStudentRegistry
        IntelligentStudentRegistry intelligentStudentRegistry = new IntelligentStudentRegistry();
        IntelligentStudent scalerStudent = new IntelligentStudent();
        scalerStudent.setBatchName("HyperXBatch");
        scalerStudent.setAvgBatchPsp(99);
        scalerStudent.setYearOfEnrollment(2023);
        intelligentStudentRegistry.save(scalerStudent);

        IntelligentStudent scalerStudent1 = intelligentStudentRegistry.get("HyperXBatch").clone();
        scalerStudent1.setIq(150);

        System.out.println(scalerStudent1.getIq());
//        studentRegistry.save(scalerStudent);     create another intelligent_student_registry for intelligent_student



/*    here, don't add intelligent_student to the student registry because while fetching
      intelligent_student, it won't know which student to fetch (intelligent_student or student).
      so, create another intelligentStudentRegistry for the intelligent student and so on.
*/

    }
}
