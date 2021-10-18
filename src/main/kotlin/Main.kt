fun main(args: Array<String>) {
    //Part|
    var ListOfCityes= mutableListOf("Riyadh","Dammam","Makkah")
    ListOfCityes.add("Jeddah")
    ListOfCityes.add("Dhahran")
    ListOfCityes[4]="Madinah"

    ListOfCityes.forEachIndexed { index, data ->
        println("$index :  $data") }

    //Part||
    var listOfInt = mutableListOf(1,1,1,1,8)
    listOfInt[2]=12
    for(index in 0 until listOfInt.size){
        listOfInt.removeIf{num ->num==12}}

    println(listOfInt)}