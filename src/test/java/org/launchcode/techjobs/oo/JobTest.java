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



}
