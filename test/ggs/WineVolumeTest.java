package ggs;

import org.junit.Test;

/**
 * Created by oslyvets
 * slivets.aleksay@gmail.com
 * on 22.04.2016.
 */
public class WineVolumeTest {
    @Test
    public void doIterations() throws Exception {
        WineVolume wineVolume = new WineVolume(500, 500, 5);
        wineVolume.doIterations(20);
    }

}