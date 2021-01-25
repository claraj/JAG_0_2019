package week_0;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class Question_5_Class_Setup_Test {

    @Test(timeout = 3000)
    public void testAnswers() {

        Question_5_Class_Setup questions = new Question_5_Class_Setup();

        int boolCount = 0;

        try {
            Class q5 = Class.forName("week_0.Question_5_Class_Setup");
            Field[] fields = q5.getFields();

            for (Field f : fields) {
                Class type = f.getType();
                if (type.equals(boolean.class)) {
                    boolean b = f.getBoolean(questions);
                    assertTrue("Once you've competed the task for boolean " + f.getName() + ", set it to true", b);
                    boolCount++;
                }
            }

            int numberOfQuestions = 12;
            assertEquals("Don't remove or change the data types of the boolean variables", numberOfQuestions, boolCount);

        } catch (Exception e) {
            e.printStackTrace();
            fail("Error running tests on Question_5_Class_Setup.java.");
        }


    }
    
}