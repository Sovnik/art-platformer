
/**
 * Write a description of class Fish here.
 * 
 * @author Alexander Dong
 * @version 04_20_2017
 */
public class Fish
{
    public static final int NOT_HUNGRY = 0;
    public static final int SOMEWHAT_HUNGRY = 1;
    public static final int VERY_HUNGRY = 2;
    
    private int hungry;
    public void Eat()
    {
        hungry = NOT_HUNGRY;
    }
    public void Move()
    {
        hungry = hungry + NOT_HUNGRY;
    }   
}
