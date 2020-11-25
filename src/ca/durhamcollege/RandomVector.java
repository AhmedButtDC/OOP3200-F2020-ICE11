package ca.durhamcollege;
import java.util.Random;

public class RandomVector
{
    private Random m_rand = new Random();

    //Step 1: Private static instance
    private static RandomVector m_instance = null;

    //Step 3: Make the default constructor private
    private RandomVector()
    {

    }

    //Step 3: Make a public instance method that acts as a "portal" to the class
    public static RandomVector Instance()
    {
        if (m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return m_instance;
    }

    public final Vector2D createVector2D(Vector2D start, Vector2D end)
    {
        //Generate random X value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float randomX = (m_rand.nextFloat() * maxX) + minX;

        //Generate random Y value
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());
        float randomY = (m_rand.nextFloat() * maxY) + minY;

        return new Vector2D(randomX, randomY);
    }
}
