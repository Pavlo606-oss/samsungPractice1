class robot(battery_: String="100"):human(){
    val battery = battery_.toInt()
    var attack1 : Int = 0
        set(value){
            if (value>50)
            {
                field=super.attack*2
            }
            else{
                field=super.attack/2
            }
        }
    fun attack2(o:Int):Int{
        var o1:Int=o-attack1
        println("Робот наносит своей могучей стальной рукой $attack1 единиц урона!")
        return o1
    }
    var healph1 : Int=0
        set(value){
            if (value>50)
            {
                field=super.healph*2
            }
            else{
                field=super.healph/2
            }
        }
    fun healph2(o:Int){
        var o1=o
        println("Хоть робот и состоит из стали, но получает $o1 единиц урона!")

    }
    var othill1 : Int=0
        set(value){
            if (value>50)
            {
                field=super.othill*2
            }
            else{
                field=super.othill/2
            }
        }
    fun superattack(battery:Int,hel:Int):Int {
        var n = readLine()
        if (battery >= 40) {
            var o1 = hel - 70
            return o1}
        return hel}
    override fun othillk(o: Int, i: Int): Int {
        if (i < 3) {
            println("Использовать роботу способность востановления?")
            var e = readLine()
            if (e == "да") {
                var o1 = o
                o1 += othill1
                println("Время отдыха, робот восстанавливает $othill1 единиц здоовья!")
                return o1
            } else {
                println("Робот решил не восстанавливаться")
            }
        }
        else{println("Робот уже использовал 3 раза способность восстановления")}
        return o
    }
    fun win(){
        println("                                       \n" +
                "                @@@@@@@@@                \n" +
                "           @@@@@@@@@@@@@@@@@@@           \n" +
                "        @@@@@@@@@@@@@@@@@@@@@@@@@        \n" +
                "       @@                       @@       \n" +
                "      @@@                       @@@      \n" +
                "      @@@                       @@@      \n" +
                "      @@@   @@@@@@     @@@@@@   @@@      \n" +
                "    @@@@@  @@    @@   @@    @@  @@@@@    \n" +
                "    @@@@@  @@    @@   @@    @@  @@@@@    \n" +
                "    @@@@@  @@@  @@@   @@@  @@@  @@@@@    \n" +
                "    @@@@@    @@@@  @@@  @@@@    @@@@@    \n" +
                "    @@@@@          @@@          @@@@@    \n" +
                "      @@@                       @@@      \n" +
                "      @@@       @@@@@@@@@       @@@      \n" +
                "      @@@       @@     @@       @@@      \n" +
                "      @@@       @@@@@@@@@       @@@      \n" +
                "       @@@@                    @@@       \n" +
                "         @@@@@@@@@@@@@@@@@@@@@@@         \n" +
                "                                       ")
    }

}