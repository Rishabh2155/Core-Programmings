class PenDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;     // division
        int remainingPens = pens % students;      // modulus

        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
