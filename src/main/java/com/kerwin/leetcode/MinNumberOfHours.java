package com.kerwin.leetcode;

/**
 * @author yangjisheng
 */
public class MinNumberOfHours {

    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sumEnergy = 0;
        for (int i = 0; i < energy.length; i++) {
            sumEnergy += energy[i];
        }
        int energyHours = sumEnergy < initialEnergy ? 0 : sumEnergy - initialEnergy + 1;
        int experienceHours = 0;
        for (int i = 0; i < experience.length; i++) {
            int experienceHour = (initialExperience > experience[i] ? 0 : experience[i] - initialExperience + 1);
            experienceHours += experienceHour;
            initialExperience = initialExperience + experienceHour;
            initialExperience = initialExperience + experience[i];
        }
        return energyHours + experienceHours;
    }

    public static void main(String[] args) {
        System.out.println(new MinNumberOfHours().minNumberOfHours(1, 1, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 50}));
    }
}
