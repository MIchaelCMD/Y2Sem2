public class Timetable {

    private final int DAYS = 5;
    private final int HOURS = 9; //9 hours each day

    private ClassDetails[][] grid;

    public Timetable()
    {
        grid = new ClassDetails[DAYS][HOURS];
    }

    public void set(int day, int hour, ClassDetails details)
    {

        grid[day][hour] = details;

    }

    public void display()
    {



    }

    public ClassDetails get(int day, int hour)
    {

        return null;

    }

    public int getNumberOfClassesFor(String name)
    {

        return 0;

    }

    public int getNumberOfFreeSlots()
    {

        return 0;

    }
}
