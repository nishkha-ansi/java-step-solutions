import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    String name;
    double cgpa;
    int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double compositeScore() {
        return (cgpa * 10) + (codingScore * 0.5);
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(
            other.compositeScore(),
            this.compositeScore()
        );
    }
}

public class PlacementDriveShortlistingRankingEngine {

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted =
                new Candidate[candidates.length];

        int count = 0;

        for (Candidate candidate : candidates) {

            if (Candidate.isEligible(candidate.cgpa) ||
                Candidate.isEligible(candidate.cgpa, candidate.codingScore)) {

                shortlisted[count] = candidate;
                count++;
            }
        }

        Candidate[] result =
                Arrays.copyOf(shortlisted, count);

        Arrays.sort(result);

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < result.length; i++) {

            output.append(i + 1)
                  .append(". ")
                  .append(result[i].name)
                  .append(" (")
                  .append(result[i].compositeScore())
                  .append(")");

            if (i < result.length - 1) {
                output.append(" | ");
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(
            shortlistAndRank(candidates)
        );
    }
}