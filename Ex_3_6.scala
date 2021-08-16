<<<<<<< HEAD
// double for loop 
// object Ex_3_7{
//     def main(args: Array[String]): Unit= {
//         for(x<- 1 until 5)
//             for(y<- 1 until 5)
//                 println(x + " * " + y + " = " + x * y)
//     }
// }

// double for loop in one line
object Ex_3_8{
    def main(args: Array[String]):Unit={
        for(x<-1 until 5 ; y <- 1 until 5)
        println(x + " * " + y + " = " + x * y)
=======
object Ex_3_6{
    def main(args: Array[String]): Unit = {
        var a = 0
        do{
            print(a + ",")
            a = a + 1
        }while(a < 20)
>>>>>>> rmt/main
    }
}