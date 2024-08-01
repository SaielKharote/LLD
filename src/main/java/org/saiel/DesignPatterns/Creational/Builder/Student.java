package org.saiel.DesignPatterns.Creational.Builder;

import org.saiel.DesignPatterns.Creational.Builder.exceptions.InvalidGradyearException;
import org.saiel.DesignPatterns.Creational.Builder.exceptions.InvalidPspException;
import org.saiel.DesignPatterns.Creational.Builder.exceptions.InvalidYoeException;

public class Student {
    int age;
    int gradYear;
    double psp;
    String name;
    String batch;
    int yoe;

    public Student (Builder b) {
        this.age = b.age;
        this.gradYear = b.gradYear;
        this.psp = b.psp;
        this.name = b.name;
        this.batch = b.batch;
        this.yoe = b.yoe;
    }

    public static Builder builder() {
        Builder b = new Builder();
        return b;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }



    public static class Builder {
        int age;
        int gradYear;
        double psp;
        String name;
        String batch;
        int yoe;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Student build() {
            if (yoe < 1) {
                throw new InvalidYoeException("Invalid Years of Experience");
            }

            if (gradYear > 2022) {
                throw new InvalidGradyearException("Invalid Graduation Year");
            }

            if (psp < 75) {
                throw new InvalidPspException("Invalid PSP");
            }

            Student s = new Student(this);
            return s;
        }
    }
}
