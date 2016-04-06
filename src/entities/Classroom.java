/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author junggue, ed reinoso
 */
public class Classroom {

    private class Tool {

    }

    private class Computer extends Tool {
    }

    private class Desk extends Tool {
    }

    private class Dimensions {

    }

    // function: this is a time table of a class
    private class AvailabilitySchedule {

        boolean[] availability;
        String[] classNameList;

        AvailabilitySchedule() {

            availability = new boolean[24];
            classNameList = new String[24];

            for (int i = 0; i < availability.length; i++) {
                availability[i] = false;
            }

        }

        // schedule   13 ~ 14 
        public void scheduleClass(String className, int startTime, int endTime) {
            for (int i = startTime; i <= endTime; i++) {
                availability[i] = true;
                classNameList[i] = className;
            }
        }
    }

    private Tool printer;
    private Computer[] computers;
    private Desk[] desks;

    private int classMaximumCapacity;
    private Dimensions theDimension;

    private AvailabilitySchedule theClassAvailability;

    private int classRoomNumber;

    //classroom behaviors
    public void havingExam() {
    }

    public void havingClass() {
    }

    public void cleaned() {
    }
    //********************************************************************************
    
    // instructors behaviors
    public void instructorProctoring() {
    }

    public void instructorLecturing() {
    }

    public void instructorExit() {
    }

    public void instructorComeIn() {
    }
    //********************************************************************************

    // students behaviors
    public void studentSitting() {
    }

    public void studentPresenting() {
    }

    public void studentExit() {
    }

    public void studentComeIn() {
    }
    //********************************************************************************


    // cleaners behaviors
    public void cleanerClean() {
    }

    public void cleanerExit() {
    }

    public void cleanerComeIn() {
    }
    //********************************************************************************

}
