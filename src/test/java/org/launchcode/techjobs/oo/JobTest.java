package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.launchcode.techjobs.oo.Job;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;


//TASK #4 - PART 1 - TEST EMPTY CONSTRUCTOR
public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        // Create two Job objects using the empty constructor
        Job job1 = new Job();
        Job job2 = new Job();

        //assertNotEquals verifying two objects are distinct
        assertNotEquals(job1.getId(), job2.getId());
    }

    //TASK # 4 - PART 2 = TEST FULL CONSTRUCTOR

    public void testJobConstructorSetsAllFields() {
        //new Job object with the specified data
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Use assertTrue and assertEquals statements to test that the constructor correctly assigns both
        // the class and value of each field

        // Check name field
        assertTrue(job.getName() instanceof String);
        assertEquals("Product tester", job.getName());

        // Check employer field
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        // Check location field
        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        // Check positionType field
        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        // Check coreCompetency field
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    //TASK #4 - PART 3
    // TEST EQUALS METHOD
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //ID SHOULDN'T BE EQUAL
        assertFalse(job1.equals(job2));
    }

    //TASK #5 - PART 1
    //TEST TOSTRING METHOD...STARTS & ENDS W NEWLINE
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String job1String = job1.toString();
        String lineBreak = System.lineSeparator();

        assertEquals("String starts with newline", lineBreak, String.valueOf(job1String.charAt(0)));
        assertEquals("String ends with newline", lineBreak, String.valueOf(job1String.charAt( job1String.length() - 1 )));
    }

    //TASK # 5 - PART 2
    // TEST TOSTRING METHOD FOR CORRECT LABELS & DATA

    //        ID:  _______
    //        Name: Product tester
    //        Employer: ACME
    //        Location: Desert
    //        Position Type: Quality control
    //        Core Competency: Persistence

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String job1String = job1.toString();
        String lineBreak = System.lineSeparator();
        int id = job1.getId();

        String expectedOutput = lineBreak + "ID: " + id + lineBreak + "Name: Product tester" + lineBreak + "Employer: ACME" + lineBreak + "Location: Desert" + lineBreak + "Position Type: Quality control" + lineBreak + "Core Competency: Persistence" + lineBreak;
        assertEquals(expectedOutput, job1String);
    }

    //TASK #5 - PART 3
    //TEST FOR EMPTY FIELD
    @Test
    public void testToStringHandlesEmptyField() {
        // Create a Job object with empty fields
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        // Call toString method and check for "Data not available" for each empty field
        String jobString = job.toString();
        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
        assertTrue(jobString.contains("Core Competency: Data not available"));
    }



}


