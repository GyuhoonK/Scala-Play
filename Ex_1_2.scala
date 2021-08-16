
object Ex_2_1{
     def main(args: Array[String]): Unit = {
          var a = "variable"
          val b = "final val"
          a = "Can Change ?"
          // b = "Can Change ?" // val 변수는 변경 불가능 !
          // var a // 초기화하지 않는 변수 선언은 불가능
          // 명시적 초기화 필요
          var c = None  //  None이 권장됨
          var d = null 
          var e: Int = 10 // 자료형 명시
          println(a)
          println(b)
     }
}