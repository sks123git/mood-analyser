import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;

import static org.junit.Assert.fail;

public class MoodAnalyserTest {

    @Test
    public void givenMessageWhenSadShouldReturnSad(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyzeMood("This is a sad message");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMessageWhenNotSadReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("This is a happy message");
        Assert.assertEquals("HAPPY",mood);
    }
//if test fails on invalid inputs return message
    @Test(expected = NullPointerException.class)
    public void givenMessageWhenInvalidMoodReturnHappy() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            String mood = moodAnalyzer.analyzeMood("This is a happy message");
            Assert.assertEquals("HAPPY", mood);
        } catch (AssertionError e) {
            System.out.println("Happy");
        }
    }
}