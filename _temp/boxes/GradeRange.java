package boxes;

class GradeRange extends BitMask {
    private int low, high;

    GradeRange(int low, int high) {
        this.low = low;
        this.high = high;
    }

    boolean testGrade(int grade) {
        return this.low <= grade && grade <= this.high;
    }
}