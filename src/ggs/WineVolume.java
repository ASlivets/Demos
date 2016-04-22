package ggs;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 22.04.2016.
 */
class WineVolume {
    private double whiteVolue;
    private double whiteConc;
    private double redVolume;
    private double redConc;
    private int spoonVolume;

    WineVolume(int whiteVolue, int redVolume, int spoonVolume) {
        this.whiteVolue = whiteVolue;
        this.redVolume = redVolume;
        this.spoonVolume = spoonVolume;
        this.whiteConc = 1.0;
        this.redConc = 1.0;
    }

    private double calculateConcentration(double totalV, double targetV) {
        return totalV /targetV;
    }

    void doIterations(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                whiteVolue -= spoonVolume;
                redVolume += spoonVolume;
            } else {
                whiteVolue += spoonVolume;
                redVolume -= spoonVolume;
            }
            whiteConc = calculateConcentration(whiteVolue, whiteConc * spoonVolume);
            redConc = calculateConcentration(redVolume, redConc * spoonVolume );
        }
        System.out.println("whiteConc: " + whiteConc);
        System.out.println("redConc: " + redConc);
    }
}
