public class TestSchoolDetails {

    public static void main(String[] args) {

        Timetable newTimeTable = new Timetable();
        ClassDetails newClassDetails = new ClassDetails("Maths","12");
        newTimeTable.set(2,3, newClassDetails);

        ClassDetails newClassDetails2 = new ClassDetails("Physics","9");
        newTimeTable.set(2,5,newClassDetails2);

    }

}
