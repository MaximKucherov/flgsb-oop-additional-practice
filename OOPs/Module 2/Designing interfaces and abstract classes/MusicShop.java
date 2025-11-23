// Step 1: Create an abstract class Instrument
// This should include:
// - private String name
// - protected int year (year of manufacture)
// - constructor that initializes both fields
// - abstract method play() that returns a String
// - concrete method getInstrumentDetails() that returns information about the instrument

abstract class Instrument {
    private String name;
    protected int year;

    public Instrument(String name, int year) {
        this.name = name;
        this.year = year;
    }

    abstract String play();
    public String getInstrumentDetails() {
        return "Instrument: " + this.name + ", Year of made: " + this.year;
    }
}

// Step 2: Create an interface Tunable
// This should include:
// - abstract method tune() that returns a String
// - abstract method adjustPitch(boolean up) that returns a String (up means increase pitch)

interface Tunable {  // Начиная с версии Java 8 можно не писать слово abstract
    abstract String tune();
    abstract String adjustPitch(boolean up); // (up means increase pitch)
}

// Step 3: Create an interface Maintainable
// This should include:
// - abstract method clean() that returns a String
// - abstract method inspect() that returns a String

interface Maintainable {  // Начиная с версии Java 8 можно не писать слово abstract
    abstract String clean();
    abstract String inspect();
}

// Step 4: Create a concrete class StringedInstrument that extends Instrument
// This should include:
// - private int numberOfStrings
// - constructor that initializes name, year, and numberOfStrings
// - implementation of the abstract play() method
// - override getInstrumentDetails() to include number of strings

class StringedInstrument extends Instrument {
    private int numberOfStrings;

    public StringedInstrument(String name, int year, int numberOfStrings) {
        super(name, year);
        this.numberOfStrings = numberOfStrings;
    }

    @java.lang.Override
    String play() {
        return "Sound of instrument, use by " + numberOfStrings + " strings.";
    }

    @java.lang.Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", number of string: " + this.numberOfStrings;
    }
}

// Step 5: Create a concrete class Guitar that extends StringedInstrument 
// and implements Tunable and Maintainable
// This should include:
// - private String guitarType (acoustic, electric, etc.)
// - constructor that initializes all fields
// - implementation of all required interface methods

class Guitar extends StringedInstrument implements Tunable, Maintainable {
    private String guitarType;

    public Guitar(String name, int year, int numberOfStrings, String guitarType) {
        super(name, year, numberOfStrings);
        this.guitarType = guitarType;
    }

    @java.lang.Override
    String play() {
        return super.play() + " Это " + guitarType + " гитара, которая звучит великолепно.";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails() + ", Тип гитары: " + this.guitarType;
    }

    @java.lang.Override
    public String tune() {
        return "Настройка гитары '" + this.guitarType + "'. Все струны настроены!";
    }

    @java.lang.Override
    public String adjustPitch(boolean up) {
        if (up) {
            return "Высота тона гитары увеличена (шаг вверх).";
        } else {
            return "Высота тона гитары уменьшена (шаг вниз).";
        }
    }

    @java.lang.Override
    public String clean() {
        return "Гитара " + this.guitarType + " очищена и отполирована.";
    }

    @java.lang.Override
    public String inspect() {
        return "Проверка гитары: лады, гриф и электроника (если есть) в отличном состоянии.";
    }

}

// Step 6: Create a concrete class Piano that extends Instrument
// and implements Tunable and Maintainable
// This should include:
// - private boolean isGrand
// - constructor that initializes all fields
// - implementation of the abstract play() method
// - implementation of all required interface methods

class Piano extends Instrument implements Tunable, Maintainable {
    private boolean isGrand;

    public Piano(String name, int year, boolean isGrand) {
        super(name, year);
        this.isGrand = isGrand;
    }

    @java.lang.Override
    String play() {
        String type = isGrand ? "рояль" : "пианино";
        return "Мощное и мелодичное звучание " + type + ".";
    }

    // Переопределяем getInstrumentDetails для добавления информации о типе пианино
    @Override
    public String getInstrumentDetails() {
        String type = isGrand ? "Рояль (Grand Piano)" : "Вертикальное пианино";
        return super.getInstrumentDetails() + ", Тип: " + type;
    }

    @java.lang.Override
    public String tune() {
        return "Настройка молоточков и струн пианино. Требуется специалист.";
    }

    @java.lang.Override
    public String adjustPitch(boolean up) {
        return "Высота тона пианино фиксирована и не может быть настроена через интерфейс.";
    }

    @java.lang.Override
    public String clean() {
        return "Чистка клавиатуры и полировка корпуса пианино.";
    }

    @java.lang.Override
    public String inspect() {
        return "Проверка механики и деки пианино.";
    }
}

// Step 7: Create a public class MusicShop to test the classes
// This should include:
// - main method that:
//   1. Creates an array of Instrument objects including Guitar and Piano instances
//   2. Iterates through the array calling play() for each instrument
//   3. Demonstrates polymorphism by testing if each instrument is Tunable or Maintainable
//      and if so, calls the appropriate methods

public class MusicShop {
    public static void main(String[] args) {

    }
}