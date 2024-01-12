fun main() {
//    for(i in 1..10){        //default step=1
//        println(i)
//    }

//    for(i in 1..10 step 2){
//        println(i)
//    }

//    for (i in 10 downTo 1 step 3) {
//        println(i)
//    }

//    for (i in 1 until 10) {
//        println(i)
//    }

    val markList: Array<Int> = arrayOf(4,2,2,5,6,2,5)

//    for (mark in markList){
//        println(mark)
//    }

    for (mark in markList.reversed()){
        println(mark)
    }

}
