package fi.hut.soberit.agilefant.transfer;

import fi.hut.soberit.agilefant.model.ExactEstimate;

public class IterationMetrics {
    private ExactEstimate effortLeft = new ExactEstimate(0);
    private ExactEstimate originalEstimate = new ExactEstimate(0);
    private ExactEstimate spentEffort = new ExactEstimate(0);
    private Integer storyPoints = new Integer(0);
    private Integer doneStoryPoints = new Integer(0);
    
    private ExactEstimate plannedSize = new ExactEstimate(0);
    
    private Integer completedTasks = new Integer(0);
    private Integer totalTasks = new Integer(0);
    private Integer percentDoneTasks = new Integer(0);
    private Integer percentSpentEffort = new Integer(0);
    
    private Integer completedStories = new Integer(0);
    private Integer totalStories = new Integer(0);
    private Integer percentDoneStories = new Integer(0);
    
    private Integer completedValue = new Integer(0);
    private Integer totalValue = new Integer(0);
    private Integer percentCompletedValue = new Integer(0);
    
    
    private boolean backlogOngoing = true;
    private ExactEstimate dailyVelocity = new ExactEstimate(0);
    
    private int daysLeftPercentage = 0;
    private int doneStoryPointsPercentage = 0;
    private int completedEffortPercentage = 0;
    
    private int daysLeft = 0;
             
    private int totalDays = 0;
    
    private Integer variance = 0;
    
    /*
     * Autogenerated list of getters and setters
     */
    
    public Integer getPercentDoneTasks() {
        return percentDoneTasks;
    }
    public void setPercentDoneTasks(Integer percentDone) {
        this.percentDoneTasks = percentDone;
    }
    public boolean isBacklogOngoing() {
        return backlogOngoing;
    }
    public void setBacklogOngoing(boolean backlogOngoing) {
        this.backlogOngoing = backlogOngoing;
    }
    public void setEffortLeft(ExactEstimate effortLeft) {
        this.effortLeft = effortLeft;
    }
    public ExactEstimate getEffortLeft() {
        return effortLeft;
    }
    public void setOriginalEstimate(ExactEstimate originalEstimate) {
        this.originalEstimate = originalEstimate;
    }
    public ExactEstimate getOriginalEstimate() {
        return originalEstimate;
    }
    public void setSpentEffort(ExactEstimate spentEffort) {
        this.spentEffort = spentEffort;
    }
    public ExactEstimate getSpentEffort() {
        return spentEffort;
    }
    public void setStoryPoints(Integer storyPoints) {
        this.storyPoints = storyPoints;
    }
    public Integer getStoryPoints() {
        return storyPoints;
    }
    public void setCompletedTasks(Integer completedTasks) {
        this.completedTasks = completedTasks;
    }
    public Integer getCompletedTasks() {
        return completedTasks;
    }
    public void setTotalTasks(Integer totalTasks) {
        this.totalTasks = totalTasks;
    }
    public Integer getTotalTasks() {
        return totalTasks;
    }
    public void setCompletedStories(Integer completedStories) {
        this.completedStories = completedStories;
    }
    public Integer getCompletedStories() {
        return completedStories;
    }
    public void setTotalStories(Integer totalStories) {
        this.totalStories = totalStories;
    }
    public Integer getTotalStories() {
        return totalStories;
    }
    public void setPercentDoneStories(Integer percentDoneStories) {
        this.percentDoneStories = percentDoneStories;
    }
    public Integer getPercentDoneStories() {
        return percentDoneStories;
    }
    public void setPercentSpentEffort(Integer percentEffortSpent) {
        this.percentSpentEffort = percentEffortSpent;
    }
    public Integer getPercentSpentEffort() {
        return percentSpentEffort;
    }

    public ExactEstimate getDailyVelocity() {
        return dailyVelocity;
    }
    public void setDailyVelocity(ExactEstimate dailyVelocity) {
        this.dailyVelocity = dailyVelocity;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public Integer getVariance() {
        return variance;
    }

    public void setVariance(Integer variance) {
        this.variance = variance;
    }

    public Integer getDoneStoryPoints() {
        return doneStoryPoints;
    }

    public void setDoneStoryPoints(Integer doneStoryPoints) {
        this.doneStoryPoints = doneStoryPoints;
    }
    public int getDaysLeftPercentage() {
        return daysLeftPercentage;
    }
    public void setDaysLeftPercentage(int daysLeftPercentage) {
        this.daysLeftPercentage = daysLeftPercentage;
    }
    public int getDoneStoryPointsPercentage() {
        return doneStoryPointsPercentage;
    }
    public void setDoneStoryPointsPercentage(int doneStoryPointsPercentage) {
        this.doneStoryPointsPercentage = doneStoryPointsPercentage;
    }
    public int getCompletedEffortPercentage() {
        return completedEffortPercentage;
    }
    public void setCompletedEffortPercentage(int completedEffortPercentage) {
        this.completedEffortPercentage = completedEffortPercentage;
    }
    public int getCompletedValue() {
        return this.completedValue;
    }
    public void setCompletedValue(int completedValue) {
        this.completedValue = completedValue;
    }
    public int getPercentCompletedValue() {
        return percentCompletedValue;
    }
    public void setPercentCompletedValue(int percentCompletedValue) {
        this.percentCompletedValue = percentCompletedValue;
    }
    public int getTotalValue() {
        return this.totalValue;
    }
    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
    public ExactEstimate getPlannedSize() {
        return this.plannedSize;
    }
    public void setPlannedSize(ExactEstimate plannedSize) {
        this.plannedSize = plannedSize;
    }
}