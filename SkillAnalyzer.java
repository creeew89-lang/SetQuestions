import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SkillAnalyzer {
    public static void main(String[] args) {

        HashSet<String> candidateASkills = new HashSet<>(Arrays.asList("Java", "Python"));
        HashSet<String> candidateBSkills = new HashSet<>(Arrays.asList("SQL", "Python"));

        Set<String> union = new HashSet<>(candidateASkills);
        union.addAll(candidateBSkills);
        System.out.println("Skills are: A: " + candidateASkills + "B: " + candidateBSkills);
        Set<String> intersection = new HashSet<>(candidateASkills);
        intersection.retainAll(candidateBSkills);
        System.out.println("Common Skill(s) is/are: " + intersection);
        Set<String> differenceForA = new HashSet<>(candidateASkills);
        differenceForA.removeAll(candidateBSkills);
        System.out.println("Unique Skills for A: " + differenceForA);
        Set<String> uniqueSkillSet = new HashSet<>(differenceForA);
        Set<String> differenceForB = new HashSet<>(candidateBSkills);
        differenceForB.removeAll(candidateASkills);
        System.out.println("Unique Skills for B: " + differenceForB);
        uniqueSkillSet.addAll(differenceForB);
        System.out.println("Unique Skills are: " + uniqueSkillSet);
}}