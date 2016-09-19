package ee.ut.cs.aa.grading.lab_2.combinatorics.task_4;

import java.util.Set;

/**
 * Calculates best possible bobsled team composed of given people.
 */
public interface BobsledTeam {

    /**
     * Return a set consisting of <b>exactly 4</b> people selected from the training team that satisfies the following
     * constraints:<br/>
     * 1) sum of weights of selected people is not greater than the given weight limit;<br/>
     * 2) sum pf ratings of selected people is the greatest among all possible teams of 4 that do not violate
     * previous constraint (if multiple possible teams have the same rating, you can choose any of them).
     *
     * If a legal team cannot be constructed (e.g. if all possible teams are over the weight limit or there are is
     * than 4 people in the training team), return null.
     *
     * @param trainingTeam a set of people who can be selected into the team
     * @param weightLimit an upper bound for sum of weights of team members
     * @return a set of 4 people selected from the training team
     */
    Set<TeamMember> selectTeam(Set<TeamMember> trainingTeam, double weightLimit);

    class TeamMember {
        private final String name;
        private final double weight;
        private final int rating;

        public TeamMember(String name, double weight, int rating) {
            this.name = name;
            this.weight = weight;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public double getWeight() {
            return weight;
        }

        public int getRating() {
            return rating;
        }
    }
}
