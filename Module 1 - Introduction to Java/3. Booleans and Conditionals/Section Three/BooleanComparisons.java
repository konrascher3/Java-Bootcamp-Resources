public class BooleanComparisons {
    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 56;
        int englishGrade = 95;

        System.out.println(chemistryGrade >= englishGrade);

        String sentence1 = "Nachts ist es kaelter als draussen!";
        String sentence2 = "Nachts ist es kaelter als draussen!";

        System.out.println(sentence1.equals(sentence2));
        System.out.println(!sentence1.equals(sentence2));

    }

}