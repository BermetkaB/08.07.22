package learnkot

fun main() {
    val student=Student("Daniel",8,25487)
    val student2=student.copy()
   // val student2=Student("Daniel",8,25487)
    val( name:String, age:Int, id:Int)=student
   /* println(name)
    println(age)
    println(id)*/


   println(student.toString())
    println(student.id)
    println(student.hashCode())
    println(student2.hashCode())
    println(student==student2)
    println(student===student2)
    student.printInfoOfStudent()
}