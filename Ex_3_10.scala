// 반복문 : 인덱스가 있는 for 문
object Ex_3_10{
    def main(args:Array[String]):Unit={
        for((num, index) <- (1 to 10).zipWithIndex){
            println("num : " + num)
            println("index : " + index)
        }
    }
}