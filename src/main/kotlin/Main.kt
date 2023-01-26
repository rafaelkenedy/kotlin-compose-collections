fun main() {

//    val rockPlanets = listOf<String>("Mercury", "Venus", "Earth", "Mars")
//    val gasPlanets = listOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    val newSolarSystem = mutableListOf("")
//    newSolarSystem.addAll(rockPlanets + gasPlanets)




    //println(solarSystem[2])
    //println(solarSystem.get(3))

    //println(solarSystem.indexOf("Earth"))
    //println(solarSystem.indexOf("Pluto"))

//    for (planet in newSolarSystem){
//        println(planet)
//    }
//


    for (planet in solarSystem){
        println(planet)
    }
    println(solarSystem.size)
    solarSystem.add("Pluto")
    solarSystem.add(3, "Theia")
    solarSystem[3] = "Future Moon"


    println(solarSystem[3])
    println(solarSystem[9])


    solarSystem.removeAt(9)
    solarSystem.remove("Future Moon")

    for (planet in solarSystem){
        println(planet)
    }

    println(solarSystem.contains("Pluto"))

    println("Future Moon" in solarSystem)



}