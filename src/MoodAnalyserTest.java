import org.junit.Assert;
import org.junit.Test;

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
}