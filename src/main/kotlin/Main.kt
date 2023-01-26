fun main() {

    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets


    println(solarSystem[3])
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
    val newSolarSystem = rockPlanets + gasPlanets + "Pluto"
    println(newSolarSystem[8])


}