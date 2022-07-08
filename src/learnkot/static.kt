package learnkot

  data class Student( val name:String,  val age:Int,  val id:Int){
fun printInfoOfStudent(){
    println("Student's name is: $name  age $age and his id  $id")

}
}