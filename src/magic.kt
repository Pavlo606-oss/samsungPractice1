import kotlin.random.Random
class magic(mana_:String="100"):human(){
    var mana = Random.nextInt(1,mana_.toInt())
    var attack1 : Int = super.attack * mana/30
    fun attack2(o:Int):Int{
        var o1:Int=o-attack1
        println("Маг кастует что-то жёсткое и наносит $attack1 единиц урона!")
        return o1
    }
    var healph1 : Int=super.healph/30*mana
    fun healph2(o:Int){
        var o1=o
        println("Волшебная палочка не спасла мага от получения $o1 единиц урона!")

    }
    var othill1 : Int=super.othill/30*mana
    override fun othillk(o: Int, i: Int): Int {
        if (i < 3) {
            println("Использовать магу способность востановления?")
            var e = readLine()
            if (e == "да") {
                var o1 = o
                o1 += othill1
                println("Время отдыха, маг восстанавливает $othill1 единиц здоовья!")
                return o1
            } else {
                println("Маг решил не восстанавливаться")
            }
        }
        else{println("Маг уже использовал 3 раза способность восстановления")}
        return o
    }

    fun win(){
        println("                      @@@@                 \n" +
                "                      @%#@@@         @@@@  \n" +
                "                      @%:-+%@@@@@@@%%#%@@  \n" +
                "                      @%:%%--#@%*=-=-=@@   \n" +
                "                      @%:-@@**@-+#@#-%@    \n" +
                "                     @@@#-@@@@@@@@=-*@@    \n" +
                "                  @@@#+-*@@@    @@%%@@     \n" +
                "                @@%+=##%@@@@    @@+--@@    \n" +
                "              @@@%*+-=-:=#@@@ @@@@@#-:#@@  \n" +
                "                 @@@@@%#%%+%@@%@*--=#=:=@@ \n" +
                "                   @@%++@*-+@+:+@%%%%%%%%@@\n" +
                "                 @@@*-*@@@-+%:=@@          \n" +
                "               @@@*=*@@@ @%-:*@@           \n" +
                "              @@#=+%@@   @@+%@             \n" +
                "            @@#==%@@      @@@              \n" +
                "          @@%==%@@        @@               \n" +
                "        @@%+=#@@                           \n" +
                "      @@%+=#@@                             \n" +
                "    @@@*-*@@@                              \n" +
                "  @@@*=*@@@                                \n" +
                " @@#=+%@@                                  \n" +
                "@%==%@@                                    \n" +
                "@@%@@                                      ")
    }
}