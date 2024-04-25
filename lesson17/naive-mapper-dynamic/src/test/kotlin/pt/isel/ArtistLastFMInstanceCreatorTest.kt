package pt.isel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ArtistLastFMInstanceCreatorTest {
    @Test
    fun createArtistWithOneArgument() {
        val artistCreator1 = ArtistLastFMInstanceCreator.getArtistCreator(1)

        val artist = artistCreator1.createArtist("Joao")

        assertEquals(artist.name, "João")
        assertEquals(artist.origin, "Portugal")

        val artist1 = artistCreator1.createArtist("Ana")

        assertEquals(artist1.name, "Ana")
        assertEquals(artist1.origin, "Portugal")
    }

    @Test
    fun createArtistWithTwoArguments() {
        val artistCreator1 = ArtistLastFMInstanceCreator.getArtistCreator(1)

        val artist = artistCreator1.createArtist("John", "England")

        assertEquals(artist.name, "John")
        assertEquals(artist.origin, "England")

        val artist1 = artistCreator1.createArtist("Alejandro", "Espanha")

        assertEquals(artist1.name, "Alejandro")
        assertEquals(artist1.origin, "Espanha")
    }
}