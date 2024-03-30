plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

rootProject.name = "lae-2024-i42d"
include(":lesson08:reflect")
findProject(":lesson08:reflect")?.name = "reflect"
//include(":lesson09:naivemapper")
//findProject(":lesson09:naivemapper")?.name = "naivemapper9"
include(":lesson10:naivemapper")
findProject(":lesson10:naivemapper")?.name = "naivemapper10"
include(":lesson10:naivemapper-annotations")
findProject(":lesson10:reflect")?.name = "naivemapper-annotations"
