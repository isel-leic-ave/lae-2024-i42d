package pt.isel

import org.cojen.maker.ClassMaker
import kotlin.reflect.full.createInstance


interface ArtistCreator {
    fun createArtist(vararg args: String): ArtistLastFm
}
class ArtistLastFMInstanceCreator {
    companion object {
        fun getArtistCreator(numArgs: Int): ArtistCreator {
            val acMaker = ClassMaker.begin("ArtistCreat2r-${numArgs}").implement(ArtistCreator::class.java)
            acMaker.addConstructor()

            val caMm = acMaker.addMethod(ArtistLastFm::class.java, "createArtist", Array<String>::class.java)
            if(numArgs == 1) {
               caMm.new_(ArtistLastFm::class.java, caMm.param(0).get(0))

            }
            if(numArgs == 2) {
                caMm.new_(ArtistLastFm::class.java, caMm.param(0).get(0))

            }




            val ac: Class<*> = acMaker.finish()
            return ac.kotlin.createInstance() as ArtistCreator



        }
    }


}