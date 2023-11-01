/*
1. Что имеется в виду, когда говорится: Java-язык программирования и Java платформа?

Java - язык программирования: Java - это язык, на котором разработчики пишут программы.
Этот язык имеет свой синтаксис (правила, как писать код), который позволяет создавать разнообразные приложения,
начиная от веб-сайтов и мобильных приложений, заканчивая играми и корпоративными системами.
Java был создан так, чтобы быть универсальным и переносимым, что означает, что программы, написанные на Java,
могут работать на разных компьютерах и устройствах без изменений.

Java - платформа: Java - это не только язык программирования, но и целая платформа, которая включает в себя различные
инструменты и окружение для разработки и запуска Java-приложений. Эта платформа включает в себя виртуальную машину
Java (JVM - Java Virtual Machine), которая позволяет исполнять Java-программы на разных операционных системах.
Это также включает в себя множество библиотек и фреймворков, которые помогают разработчикам упростить создание приложений.

Итак, в двух словах, когда говорят о Java как о языке программирования, это означает, что это средство для написания кода.
А когда говорят о Java как о платформе, это означает, что это весь набор инструментов и среда, которые помогают
создавать и запускать программы на этом языке.

2. Расшифровать аббревиатуры JVM, JDK и JRE. Показать, где они физически расположены и что собой представляют

JVM (Java Virtual Machine) - Джава Виртуальная Машина:
Что это? Это программное обеспечение, которое исполняет (запускает) Java-приложения.
Оно является частью Java-платформы и выполняет Java-код.
Где физически расположено? JVM устанавливается на вашем компьютере,
и каждое Java-приложение запускается в собственной виртуальной машине.
Это означает, что у вас может быть несколько копий JVM на одном компьютере, каждая для своего приложения.

JDK (Java Development Kit) - Набор разработки Java:
Что это? JDK - это пакет инструментов для создания Java-приложений. Он включает в себя компилятор Java,
который преобразует исходный код Java в байт-код (формат, который может выполняться JVM), а также другие инструменты для разработки.
Где физически расположено? JDK устанавливается на вашем компьютере как набор программ и библиотек для разработки.
Вы используете JDK для написания, компиляции и отладки Java-приложений.

JRE (Java Runtime Environment) - Среда выполнения Java:
Что это? JRE - это окружение, необходимое для запуска Java-приложений. Оно включает в себя JVM, а также библиотеки и файлы,
необходимые для выполнения Java-приложений.
Где физически расположено? JRE устанавливается на вашем компьютере и используется только для запуска Java-приложений.
Он не включает в себя инструменты для разработки, как JDK. Если у вас есть JRE,
вы можете запускать Java-приложения, но вы не сможете создавать их без JDK.

Итак, чтобы создавать Java-приложения, вам нужен JDK, а для запуска этих приложений на вашем компьютере должен быть установлен JRE.
JVM - это часть JRE, которая фактически выполняет Java-код.

3. JVM-JDK-JRE. Кто кого включает и как взаимодействуют.

JDK включает в себя JRE, поэтому если у вас установлен JDK, вы уже имеете JRE.
JVM является частью JRE (и JDK тоже), и она отвечает за выполнение Java-кода.
Разработчики используют JDK для написания и сборки Java-приложений, затем эти приложения могут быть выполнены на JRE (включая JVM)
на компьютерах конечных пользователей.

Таким образом, JDK - это пакет для создания Java-приложений, JRE - это окружение для их выполнения,
и JVM - это часть JRE, которая фактически выполняет код.

4. Как связаны имя Java-файла и классы, которые в этом файле объявляются?

Имя файла: Имя Java-файла обычно должно совпадать с именем публичного класса, объявленного в этом файле.
Например, если у вас есть публичный класс с именем MyClass, то имя файла должно быть MyClass.java.

Один публичный класс на файл: В Java каждый файл обычно содержит только один публичный класс.
Публичный класс - это тот, который может быть доступен извне файла. Остальные классы в файле могут иметь любые имена,
но они не могут быть публичными.

Организация кода: Используйте ключевое слово public перед именем класса, который должен быть доступен извне файла.

Указание имени класса внутри файла: Если у вас есть несколько классов в файле,
Java позволяет вам создавать объекты других классов внутри этого файла, используя их имена в коде.
Если у вас есть файл MyClass.java, в котором есть два класса: MyClass и AnotherClass,
то внутри класса MyClass вы можете создать объект класса AnotherClass.
Это означает, что вы можете использовать класс AnotherClass внутри класса MyClass.

5.  Как скомпилировать и запустить класс, используя командную строку?

Сначала создайте файл с расширением .java, в котором будет содержаться ваш Java-код.
Например, давайте создадим файл MyClass.java с простым Java-классом.

Откройте командную строку (в Windows это командная строка или PowerShell, в Unix/Linux - терминал) и перейдите в каталог,
где находится ваш файл MyClass.java. Затем выполните следующую команду для компиляции Java-кода: javac MyClass.java

Если компиляция прошла успешно и не выдала ошибок, в вашем каталоге появится файл с расширением .class, например,
MyClass.class. Это скомпилированный байт-код Java.

Чтобы запустить ваш скомпилированный класс, используйте следующую команду в командной строке: java MyClass

6. Что такое classpath? Зачем в переменных среды окружения прописывать
пути к установленному JDK?

Classpath - это список директорий и JAR-файлов, в которых Java Virtual Machine (JVM) ищет классы,
необходимые для выполнения ваших Java-приложений. Когда вы запускаете Java-приложение,
JVM должна знать, где находятся классы, чтобы их загрузить и выполнить.

Зачем прописывать пути к установленному JDK в переменных среды окружения:

Использование утилит JDK: Установка пути к JDK в переменных среды окружения позволяет вам использовать утилиты и инструменты,
предоставляемые JDK, из командной строки, даже если ваш текущий каталог не содержит JDK-инструментов.
Например, такие инструменты, как javac (компилятор Java) и java (запускатор Java), могут быть запущены из любой директории,
если путь к JDK указан в переменных среды.

Настройка Classpath: Когда ваши Java-приложения используют сторонние библиотеки (JAR-файлы), вы должны включить пути к этим
библиотекам в classpath. Это позволяет вашим приложениям находить и использовать классы из этих библиотек.
Установка переменной среды CLASSPATH или использование флага -cp при запуске Java-приложения позволяет определить,
где JVM должна искать классы.

Кроме того, прописывание пути к JDK в переменных среды может быть полезно при разработке, так как это позволяет разработчику
удобно компилировать и запускать Java-код без необходимости указывать полные пути к инструментам каждый раз.

7. Если в classpath есть две одинаковые библиотеки (или разные версии одной
библиотеки), объект класса из какой библиотеки создастся?

Когда в classpath находятся две одинаковые библиотеки (или разные версии одной и той же библиотеки),
объект класса будет создан из библиотеки, которая находится в classpath выше по порядку.

Classpath обычно проверяется в порядке, в котором библиотеки и директории добавляются к нему. Первая найденная библиотека
с соответствующим классом будет использована. Если Java обнаружит класс с однаковым именем в нескольких библиотеках,
он выберет первую библиотеку из classpath, где будет найден этот класс, и создаст объект из этой библиотеки.

Это означает, что порядок, в котором библиотеки и директории добавляются в classpath, может влиять на то, из какой
библиотеки будет создан объект. Если вам важно, чтобы объект создавался из определенной версии библиотеки,
вы должны удостовериться, что соответствующая библиотека находится в classpath выше по порядку.

8. Объяснить различия между терминами «объект» и «ссылка на объект».

Объект: Объект - это конкретный экземпляр класса, который содержит данные и методы, определенные в этом классе.
Когда вы создаете объект, фактически выделяется память для хранения его данных, и он становится уникальным идентификатором,
представляющим экземпляр класса. Этот объект может быть использован для доступа к данным и выполнения операций, определенных в классе.

Ссылка на объект: Ссылка на объект - это переменная, которая указывает на объект в памяти. Она содержит адрес,
где находится объект, но не сам объект. Ссылка позволяет вам обращаться к объекту и взаимодействовать с ним,
но она не является самим объектом. Вы можете иметь несколько ссылок, указывающих на один и тот же объект,
и вы можете изменять объект через любую из этих ссылок, и все изменения будут видны через все ссылки.

Таким образом, объект - это реальный экземпляр класса, который занимает память, а ссылка - это переменная, которая
указывает на этот объект и позволяет вам работать с ним.

9. Какие области памяти использует Java для размещения простых типов, объектов, ссылок, констант, методов, пул строк и т.д.

Стек (Stack): В стеке хранятся локальные переменные методов и ссылки на объекты. Это место для временного хранения данных
во время выполнения метода. Когда метод вызывается, создается новый фрейм стека, в котором хранятся параметры метода
и локальные переменные. После завершения метода, его фрейм удаляется из стека.

Куча (Heap): Куча - это область памяти, где хранятся объекты и массивы. Куча является долгосрочным хранилищем объектов
и существует, пока существует ссылка на объект. Не все объекты в куче имеют прямой доступ; вместо этого на стеке хранятся
ссылки на объекты в куче.

Пул строк (String Pool): Пул строк - это специальный участок кучи, где хранятся строковые литералы.
Это делается для оптимизации использования памяти. Если две строки содержат одинаковые символы,
то они будут указывать на один и тот же объект в пуле строк.

Память методов (Method Area): Память методов хранит информацию о классах, методах, статических переменных и других метаданных.
Здесь также хранятся константы, такие как значения final переменных и строки из таблицы констант.
Память методов обычно является частью кучи.

Память для констант (Constant Pool): Это часть памяти методов, где хранятся константы, используемые в программе.
Это может включать в себя литералы, значения final переменных и ссылки на классы и методы.

Статическая память (Static Memory): В этой области хранятся статические переменные классов.
Эти переменные существуют в течение всего времени работы программы и разделяются между всеми экземплярами класса.

Память для потоков (Thread Stack): Каждый поток выполнения имеет свой собственный стек,
который используется для хранения локальных переменных и данных, специфичных для потока.

10.  Почему метод main() объявлен как public static void?

public (публичный): Этот модификатор доступа означает, что метод main() является общедоступным и может быть вызван из
любой другой части программы. Это важно, так как JVM (Java Virtual Machine) должна иметь доступ к методу main(),
чтобы начать выполнение программы.

static (статический): Метод main() должен быть статическим, потому что он вызывается до создания каких-либо объектов
конкретного класса. Это означает, что вы можете вызвать main() без создания экземпляра класса.
Он принадлежит классу в целом, а не какому-либо конкретному объекту этого класса.

void (ничего не возвращает): Метод main() возвращает void, что означает, что он не возвращает какое-либо значение.
Это связано с тем, что main() не предназначен для возврата значений, а служит точкой входа для выполнения программы.
Он выполняет команды и инструкции, но не возвращает результат.

11.  Возможно ли в сигнатуре метода main() поменять местами слова static
и void?

Нет, в сигнатуре метода main() нельзя поменять местами слова static и void.
Сигнатура метода включает в себя тип возвращаемого значения, имя метода, и параметры метода.

12. Будет ли вызван метод main() при запуске приложения, если слова static
или public отсутствуют?

Нет, метод main() не будет вызван при запуске приложения в Java, если отсутствуют слова static и public в сигнатуре метода.
Важно следовать определенным правилам, чтобы JVM (Java Virtual Machine) могла найти и вызвать метод main() при запуске.

13. Классы какого пакета импортируются в приложение автоматически?

java.lang: Этот пакет импортируется автоматически для каждой Java-программы. Он содержит основные классы и интерфейсы,
такие как Object, String, и многие другие, которые используются повсеместно в Java. Вы можете использовать их без явного импорта.

java.util: Этот пакет содержит классы и интерфейсы для работы с коллекциями данных, датами, временем и другими полезными структурами.
Некоторые из классов, такие как ArrayList, HashMap, и Date, могут быть использованы без явного импорта.

java.net: Этот пакет содержит классы для работы с сетевыми операциями.
Например, URL - это класс для работы с URL-адресами, и его можно использовать без явного импорта.

java.math: Этот пакет содержит классы для работы с большой арифметикой, такие как BigInteger и BigDecimal.

java.sql: Этот пакет предоставляет классы для работы с базами данных, такие как Connection и ResultSet.

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}