package ru.akorsa.kata.summaryStatistics;

public class Stats {
    private double average;
    private int count;
    private int max;
    private int min;
    private long sum;

    public Stats( int count, int max, int min, long sum) {
        this.average = (double) sum / count;
        this.count = count;
        this.max = max;
        this.min = min;
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
