
/**
 * Write a description of class StudentRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecord {
    int[] scores;
    
    public StudentRecord(int[] scores) {
        this.scores = scores;
    }
    
    /**
     * Finds the average from the first given boundary to the second given boundary
     *
     * @param first The first boundary
     * @param last The second boundary
     * @return The average from first to last
     */
    private double average(int first, int last) {
        double sum = 0.0;
        for (int i=scores[first];i<=scores[last];i++) {
            sum += scores[i];
        }
        return sum/(last-first+1);
    }
    
    /**
     * Determines whether the grades have improved
     * 
     * @return Whether or not the grades improved
     */
    private boolean hasImproved() {
        for (int i=0;i<scores.length-1;i++) {
            if (scores[i+1] < scores[i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Finds the final average
     * 
     * @return The final average
     */
    public double finalAverage() {
        if (hasImproved()) {
            return average(scores.length/2, scores.length-1);
        }
        else {
            return average(0, scores.length-1);
        }
    }
}
