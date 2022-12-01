fun main(args: Array<String>) {
    println("Hello Kotlin")
    println()

//    val|var имя_переменной: тип_переменной
//    С помощью ключевого слова val определяется неизменяемая переменная (immutable variable).
//    То есть мы можем присвоить значение такой переменной только один раз,
//    но изменить его после первого присвоения мы уже не сможем.

    val age: Int = 23
    println(age)
    println()

//    А у переменной, которая определена с помощью ключевого слова var мы можем многократно менять значения (mutable variable):
    var age2: Int = 23
    println("age2 $age2")
    age2 = 56
    println("age2 $age2")
//    next()
    println()

    val a: Byte = -10
    val b: Short = 45
    val c: Int = -250
    val d: Long = 30000
    println(a) // -10
    println(b) // 45
    println(c) // -250
    println(d) // 30000
    println()

//    беззнаковые переменные
    val e: UByte = 10U
    val f: UShort = 45U
    val g: UInt = 250U
    val h: ULong = 30000U

//    шестнадцатеричная система
    val address: Int = 0x0A1    // 161
//    Двоичная запись числа предваряется символами 0b, после которых идет последовательность из нулей и единиц
    val j: Int = 0b0101    // 5

    val height: Double = 1.78
    val pi: Float = 3.14F
    val p: Double = 23e3 // 23000

//    boolean
    val i: Boolean = true
    val u: Boolean = false
    println(i)
    println()

    val ca: Char = 'A'
    val cb: Char = 'B'
    val cc: Char = 'T'
    println(ca)
    println()

//    string
    val name: String = "Eugene"
    println(name)
    println()
    val text: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
                    """
    println(text)
    println()

//    шаблоны строк
    val firstName = "Tom"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)
    println()

//    Если мы хотим явно указать, что число представляет значение типа Long, то следует использовать суффикс L
    val sum = 45L

// в Kotlin есть тип Any, который позволяет присвоить переменной данного типа любое значение
    var name2: Any = "Tom"
    println(name2)
    name2 = 6758
    println(name2)
    println()

//    Ввод с консоли
    print("Введите имя: ")
    val name3 = readLine()
    println("Ваше имя: $name3")
    println()

// Арифметические операции
    val x = 5
    val y = 6
    var z = x + y
    println(z)
    z = x - y
    println(z)
    z = x * y
    println(z)
    z = y / x
    println(z)

//    При этом если в операции деления оба операнда представляют целые числа, то результатом тоже будет целое число,
//    а если в процессе деления образовалась дробная часть, то она отбрасывается

//    Чтобы результатом было дробное число, один из операндов должен представлять число с плавающей точкой
    val n = 5.0
    val q = 11 / n
    println(q)

//    %: возвращает остаток от целочисленного деления двух чисел
    val xx = 65
    val yy = 10
    val zz = xx % yy
    println(zz)

// ++ (инкремент): увеличивает значение на единицу
    var w = 5
    val r = ++w

//    Постфиксный инкремент возвращает значение до увеличения на единицу
//    var x = 5
//    val y = x++
//    println(x)      // x = 6
//    println(y)      // y = 5

//    -- (декремент): уменьшает значение на единицу
//    var x = 5
//    val y = --x
//    println(x)      // x = 4
//    println(y)      // y = 4

//    Постфиксный декремент возвращает значение до уменьшения на единицу:
//    var x = 5
//    val y = x--
//    println(x)      // x = 4
//    println(y)      // y = 5
    println()

//    Поразрядные операции
//    shl: сдвиг битов числа со знаком влево
    val v = 3 shl 2 // v = 11 << 2 = 1100
    println(v)  // v = 12
    val m = 0b11 shl 2
    println(m)   // m = 12

//    shr: сдвиг битов числа со знаком вправо
    val zzz = 12 shr 2     // zzz = 1100 >> 2 = 11
    println(zzz)          // zzz = 3
    val dd = 0b1100 shr 2
    println(dd)          // dd = 3

//    ushr: сдвиг битов беззнакового числа вправо
//    val z = 12 ushr 2     // z = 1100 >> 2 = 11
//    println(z)          // z = 3

//    and: побитовая операция AND (логическое умножение или конъюнкция).
//    Эта операция сравнивает соответствующие разряды двух чисел и возвращает единицу, если эти разряды обоих чисел равны 1.
//    Иначе возвращает 0.
    val xxx = 5   // 101
    val yyy = 6   // 110
    val zzzz = xxx and yyy     // z = 101 & 110 = 100
    println(zzzz)          // z = 4

    val ddd = 0b101 and 0b110
    println(ddd)          // ddd = 4

//    or: побитовая операция OR (логическое сложение или дизъюнкция).
//    val x = 5   // 101
//    val y = 6   // 110
//    val z = x or y     // z = 101 | 110 = 111
//    println(z)         // z = 7
//
//    val d = 0b101 or 0b110
//    println(d)          // d = 7

//    xor: побитовая операция XOR. Сравнивает два разряда и возвращает 1, если один из разрядов равен 1, а другой равен 0.
//    Если оба разряда равны, то возвращается 0.
//    val x = 5   // 101
//    val y = 6   // 110
//    val z = x xor y     // z = 101 ^ 110 = 011
//    println(z)         // z = 3
//
//    val d = 0b101 xor 0b110
//    println(d)          // d = 3

//    inv: логическое отрицание или инверсия - инвертирует биты числа
//    val b = 11  // 1011
//    val c = b.inv()
//    println(c)      // -12

//    Операции отношения
//    val a = 11
//    val b = 12
//    val c : Boolean =  a > b
//    println(c)      // false - a меньше чем b
//    val d = 35 > 12
//    println(d)      // true - 35 больше чем 12

//    val a = 11
//    val b = 12
//    val c =  a < b   // true
//    val d = 35 < 12  // false

//    val a = 11
//    val b = 12
//    val c = a >= b      // false
//    val d = 11 >= a     // true

//    val a = 11
//    val b = 12
//    val c = a <= b      // true
//    val d = 11 <= a     // false

//    val a = 11
//    val b = 12
//    val c = a == b      // false
//    val d = b == 12     // true

//    val a = 11
//    val b = 12
//    val c = a != b      // true
//    val d = b != 12     // false

//    Логические операции
//    в основе всё тоже самое, кроме
//    in: возвращает true, если операнд имеется в некоторой последовательности.
//    val a = 5
//    val b = a in 1..6       // true - число 5 входит в последовательность от 1 до 6
//    val c = 4
//    val d = c in 11..15     // false - число 4 НЕ входит в последовательность от 11 до 15

//    Условные конструкции
//    if...else
//    Если блок кода состоит из одного выражения, то в принципе фигурные скобки можно опустить
    val aa = 10
    if(aa == 10) {
        println("aa равно 10")
    }else{
        println("aa НЕ равно 10")
    }
//    Если необходимо проверить несколько альтернативных вариантов, то можно добавить выражения else if:
    val aaa = 10
    if(aaa == 10) {
        println("a равно 10")
    }
    else if(aaa == 9){
        println("a равно 9")
    }
    else if(aaa == 8){
        println("a равно 8")
    }
    else{
        println("a имеет неопределенное значение")
    }

//    Возвращение значения из if
    val a1 = 10
    val b1 = 20
    val c1 = if (a1 > b1) a1 else b1
    println(c1)  // 20
    println()

//    Конструкция when
    val isEnabled = true
    when(isEnabled){
        false -> println("isEnabled off")
        true -> println("isEnabled on")
        else -> { println("неопределенное значение")}
    }

//    Сравнение с набором значений
    val a2 = 10
    when(a2){
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }

//when и динамически вычисляемые значения
    val a3 = 10
    val b3 = 5
    val c3 = 3
    when(a3){
        b3 - c3 -> println("a = b - c")
        b3 + 5 -> println("a = b + 5")
        else -> println("неопределенное значение")
    }

//    Как и if конструкция when может возвращать значение. Возвращаемое значение указывается после оператора ->:
    val sum1 = 1000

    val rate = when(sum1){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)
    println()

//   for
    for(n in 1..9){
        print("${n * n} \t")
    }

//    while
    var ii = -1
    do{
        println(ii*ii)
        ii--;
    }
    while(ii > 0)

//    continue
//    or(n in 1..8){
//        if(n == 5) continue;
//        println(n * n)
//    }

//    break
//    for(n in 1..5){
//        if(n == 5) break;
//        println(n * n)
//    }

//    диапазон
    val range = 1..5    // диапазон [1, 2, 3, 4, 5] также можно и для букв
//    5 downTo 1 [5, 4, 3, 2, 1]
//    val range1 = 1..10 step 2           // 1 3 5 7 9
//    val range1 = 1 until 9          // 1 2 3 4 5 6 7 8

//    массивы
//    val numbers: Array<Int>

//    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    val n = numbers[1]  // получаем второй элемент  n=2
    numbers[2] = 7      // переустанавливаем третий элемент
    println("numbers[2] = ${numbers[2]}") // numbers[2] = 7

//    перебор массива
//    val numbers = arrayOf(1, 2, 3, 4, 5)
//    for(number in numbers){
//        print("$number \t")
//    }

        // проверка на наличие элемента
//    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//    println(4 in numbers)       // true
//    println(2 !in numbers)      // false

    // двумерные массивы
//    val table: Array<Array<Int>> = Array(3, { Array(5, {0}) })

// Используя два цикла, можно перебирать двухмерные массивы:
    val table: Array<Array<Int>> = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)
    for(row in table){

        for(cell in row){
            print("$cell \t")
        }
        println()
    }
}

//fun next(){
//    println("hello")
//    println("world")
//}