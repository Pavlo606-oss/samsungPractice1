fun main(){

    var i =0
    var i1 = 0
    var i2=0
    var rb = 0
    var rc = 0
    var mg = 0
    println("Введите уровень заряда баттареи робота:")
    var b = readLine()
    var rob=robot(b!!.toString())
    rob.attack1=b!!.toInt()
    rob.healph1=b!!.toInt()
    rob.othill1=b!!.toInt()
    var hel = rob.healph1
    var atk = rob.attack1
    rob.othill1=b!!.toInt()
    println("Введите стойкость щита рыцаря:")
    var s =readLine()!!.toString()
    var kni=knight(s)
    var hel1=kni.healph1
    var atk1 = kni.attack1
    println("Введите количество маны мага:")
    var m = readLine()!!.toString()
    var mag = magic(m)
    var hel2=mag.healph1
    var atk2 = mag.attack1
    println("Бой начинается, друзья!")
    while ((hel>0 && hel1>0)||(hel1>0 && hel2>0) || (hel>0 && hel2>0)){
        if (hel>0)
            {hel1=rob.attack2(hel1)
            kni.healph2(atk)
            hel2=rob.attack2(hel2)
            mag.healph2(atk)
            var f = readLine()
            /*println("Использовать роботу суператаку, но потерять 40 единиц заряда батареи?")
            var x = readLine()*/
            /*if (x =="да") {
                if (b!!.toInt() >= 40) {
                    rob.superattack(b!!.toInt(), hel1)
                    rob.superattack(b!!.toInt(), hel2)
                    println("Робот лазером наносит 70 единиц урона, но теряет 40 единиц зарда батареи!")
                    var b1 = b.toInt() - 40
                    b = b1.toString()
                    rob = robot(b!!.toString())
                    rob.attack1 = b!!.toInt()
                    rob.healph1 = b!!.toInt()
                    rob.othill1 = b!!.toInt()
                } else {
                    println("Роботу недостаточно заряда батареи")
                }}

                else{ println("Робот решил не использовать суператаку") }*/
            hel=rob.othillk(hel,i)
            var k1=readLine()}
        if (hel1>0)
            {hel=kni.attack2(hel)
            rob.healph2(atk1)
            hel2=kni.attack2(hel2)
            mag.healph2(atk1)
            var f1 = readLine()
            hel1=kni.othillk(hel1,i1)}
        if (hel2>0)
            {hel1=mag.attack2(hel1)
            rob.healph2(atk2)
            hel=mag.attack2(hel)
            kni.healph2(atk2)
            var f2=readLine()
            hel2=mag.othillk(hel2,i2)}
        if (hel<=0&&rb==0){println("Робот проиграл!")
            rb+=1}
        if (hel1<=0&&rc==0){println("Рыцарь проиграл!")
            rc+=1}
        if (hel2<=0&&mg==0){println("Маг проиграл!")
            mg+=1}
    }
    if (hel>0){println("В этом нелёгком противостоянии победил робот!")
        rob.win()}
    if (hel1>0){println("В этом нелёгком противостоянии победил рыцарь!")
        kni.win()}
    if (hel2>0){println("В этом нелёгком противостоянии победил маг!")
        mag.win()}

}


