class knight(armour_:String="100"):human() {
    var armour = armour_.toInt()
    var healph1 = super.healph + armour
    fun healph2(o: Int) {
        var o1 = o
        println("Щит рыцаря удалось пробить, он получает $o1 единиц урона!")
    }

    var attack1 = 20
    fun attack2(o: Int): Int {
        var o1: Int = o - attack1
        println("Своим могучим копьём рыцарь наносит $attack1 единиц урона!")
        return o1
    }

    var othill1 = super.othill / 2
    override fun othillk(o: Int, i: Int): Int {
        if (i < 3) {
            println("Использовать рыцарю способность востановления?")
            var e = readLine()
            if (e == "да") {
                var o1 = o
                o1 += othill1
                println("Время отдыха, рыцарь восстанавливает $othill1 единиц здоовья!")
                return o1
            } else {
                println("Рыцарь решил не восстанавливаться")
            }
        }
        else{println("Рыцарь уже использовал 3 раза способность восстановления")}
        return o
    }

    fun win() {
        println(
            "                                               #@         \n" +
                    "                                                 *-+          \n" +
                    "                                              @*..-*          \n" +
                    "                                            #=...:+           \n" +
                    "                                          #=..--:=%           \n" +
                    "                                        #=.:-==::#            \n" +
                    "                                      @=.:-===-:#             \n" +
                    "                                    @=-===:=+-:*              \n" +
                    "                                   @*++=::++-:=%              \n" +
                    "                                   @@#====+*+-*               \n" +
                    "                                   @*+:=+=*##*@               \n" +
                    "                                    %-=**#%#@@                \n" +
                    "                                   #=#@                       \n" +
                    "                                  #+#@                        \n" +
                    "                                @*=%                          \n" +
                    "                               %=*@                           \n" +
                    "                              #+%                             \n" +
                    "                             #=%                              \n" +
                    "                           @*+@                               \n" +
                    "                          #+#@                                \n" +
                    "                         #+%@                                 \n" +
                    "                       @#+%                                   \n" +
                    "                      @+*@                                    \n" +
                    "                     #+%@                                     \n" +
                    "                    #*%                                       \n" +
                    "                  @**@                                        \n" +
                    "                 @=#@                                         \n" +
                    "                #+%                                           \n" +
                    "              @#*%                                            \n" +
                    "            @*:+%                                             \n" +
                    "           *=-+%                                              \n" +
                    "         @=+=*%                                               \n" +
                    "         #-++%                                                \n" +
                    "         #+#@                                         "
        )
    }
}

