class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin, farenheit;
        double[] ans= new double[2];
 
        kelvin = celsius + 273.15;
        farenheit = celsius * 1.80 + 32.00;
        ans[0]= kelvin;
        ans[1]= farenheit;
        return ans;
    }
}
