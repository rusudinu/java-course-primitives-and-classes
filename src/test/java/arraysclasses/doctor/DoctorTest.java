package arraysclasses.doctor;

import com.codingshadows.arraysclasses.doctor.Doctor;
import com.codingshadows.arraysclasses.doctor.Generalist;
import com.codingshadows.arraysclasses.doctor.Surgeon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {
    private Doctor[] doctors;

    @BeforeEach
    public void setUp() {
        doctors = new Doctor[]{
                new Surgeon("Dr. Smith", "Cardiology"),
                new Generalist("Dr. Jones", 120),
                new Surgeon("Dr. Brown", "Orthopedics"),
                new Generalist("Dr. White", 80),
                new Generalist("Dr. Green", 150),
                new Surgeon("Dr. Black", "Cardiology")
        };
    }

    @Test
    public void testToString() {
        assertEquals("Surgeon: Dr. Smith, Expertise: Cardiology", doctors[0].toString());
        assertEquals("Generalist: Dr. Jones, Number of Patients: 120", doctors[1].toString());
    }

    @Test
    public void testSurgeonIntervention() {
        Surgeon surgeon = new Surgeon("Dr. Test", "Neurosurgery");
        assertDoesNotThrow(surgeon::intervention);
    }

    @Test
    public void testGeneralistWriteRecipe() {
        Generalist generalist = new Generalist("Dr. Test", 100);
        assertDoesNotThrow(generalist::writeRecipe);
    }

    @Test
    public void testSameExpertise() {
        boolean hasSameExpertise = false;
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] instanceof Surgeon) {
                for (int j = i + 1; j < doctors.length; j++) {
                    if (doctors[j] instanceof Surgeon) {
                        if (((Surgeon) doctors[i]).getExpertise().equals(((Surgeon) doctors[j]).getExpertise())) {
                            hasSameExpertise = true;
                        }
                    }
                }
            }
        }
        assertTrue(hasSameExpertise, "There should be at least two surgeons with the same expertise.");
    }

    @Test
    public void testGeneralistsOrderedByPatients() {
        List<Doctor> generalists = Arrays.stream(doctors).filter(d -> d instanceof Generalist).sorted(Comparator.comparingInt(d -> ((Generalist) d).getNoPatients())).toList();

        int[] expectedOrder = {80, 120, 150};
        int index = 0;

        for (Doctor doctor : generalists) {
            if (doctor instanceof Generalist) {
                assertEquals(expectedOrder[index++], ((Generalist) doctor).getNoPatients());
            }
        }
    }

    @Test
    public void testGeneralistsAboveMedian() {
        int totalPatients = 0;
        int generalistCount = 0;

        for (Doctor doctor : doctors) {
            if (doctor instanceof Generalist) {
                totalPatients += ((Generalist) doctor).getNoPatients();
                generalistCount++;
            }
        }

        double medianPatients = (double) totalPatients / generalistCount;
        int aboveMedianCount = 0;

        for (Doctor doctor : doctors) {
            if (doctor instanceof Generalist) {
                if (((Generalist) doctor).getNoPatients() > medianPatients) {
                    aboveMedianCount++;
                }
            }
        }

        assertEquals(2, aboveMedianCount, "There should be 2 generalists with more patients than the median.");
    }
}

