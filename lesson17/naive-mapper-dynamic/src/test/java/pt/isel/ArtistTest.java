package pt.isel;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArtistTest {
    @Test
    void testArtistLastFm() {
        ArtistLastFm alfm1 = new ArtistLastFm("Ana");
        ArtistLastFm alfm2 = new ArtistLastFm("Jaime", "Spain");
        ArtistLastFm alfm3 = new ArtistLastFm("Jaime", "Spain");
        Arrays.asList(ArtistLastFm.class.getConstructors())
                .forEach(c -> System.out.println(c));
    }

}
