public class exercise06 {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int averageWorkHoursDaily = 6;
        // The semester is 17 weeks long
        int semesterLength = 17;
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int hoursSpentWithCodingPerWeek = averageWorkHoursDaily * 5;
        int hoursSpentWithCodingPerSemester = hoursSpentWithCodingPerWeek * semesterLength;
        System.out.println("Hours expected to be spent with coding in a semester by an attendee:\n" + hoursSpentWithCodingPerSemester);
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int effectiveWorkHoursWeekly = 52;
        int effectiveCodingHoursPerSemesterPercent = 100 * effectiveWorkHoursWeekly / hoursSpentWithCodingPerWeek;
        System.out.println("\nPercentage of the coding hours in the semester if the average work hours is 52 weekly:\n" + effectiveCodingHoursPerSemesterPercent +"%");
    }
}
