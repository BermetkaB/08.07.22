package learnkot

fun main() {
    val student=Student("Daniel",8,25487)
    val student2=Student("Daniel",8,25487)

    println(student.toString())
    println(student.id)
    println(student.hashCode())
    println(student2.hashCode())
    println(student==student2)
    println(student===student2)
    student.printInfoOfStudent()
}