class Solution {
    public double[] convertTemperature(double celsius) {
        double K = celsius + 273.15;
        double F = celsius * 1.80 + 32.00;

        return new double[]{K, F};
    }
}

