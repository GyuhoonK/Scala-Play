object Ex_3_1{
    def main(args: Array[String]): Unit = {
        var x = 20
        if(x>15){ // if절 내에서 실행할 코드가 2줄 이상이면 중괄호 필요
            println("Greater than 15")
            println("ha ha ha")

        }
        else if(x<15){
            println("Less than 15") // 한줄이라면 중괄호 없어도 됨
        }
        else {
            println("What is it?")
        }
    }
}