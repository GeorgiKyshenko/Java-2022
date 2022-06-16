package _07_DefiningClasses;

public class Lecture {
    public static void main(String[] args) {
        /* 1. A class can have state (its parameters inside the class, like String name; int age; =  (fields)) and behavior
         2. State is parameters inside the class, like String name; int age; and they are called fields.
         3. Behavior can be a method inside the class;
         4.Класа е шаблон а обекта е създадена инстанция на този шаблон;
         5. Access Modifiers са public, private, protected. Package modifier е когато няма написан modifier пред String name; (for example),
          и могат да се виждат само от package файловете. Private се вижда само в създаденият клас и никой друг.
          Когато искаме да достъпим стойностите на private променливите се правят Getter и Setter.
          Getter-a връща информация а Setter-a може да променя стойностите вътре в класа.

          6. ЗА ПРЕДАВАНЕ НА ЗДАЧИ В JUDGE ИМЕТО НА КЛАСА В КОЙТО ПИШЕМ ГЛАВНИЯТ КОД ТРЯБВА ДА СЕ КАЗВА MAIN!!! (това е само за Judge системата.)

          7.Override презаписва поведението на някакъв метод от базов клас с моя лична имплементация !!!

          8. Ако преизвикваме конструктор първата операция винаги трябва да е извикването на по-големият конструктор
          с един от параметрите, който ще знаем и останалите можем да ги сетнем ръчно (hard code)

          9. static метода е обвързан само с класа който сме създали и обектите нямат достъп до static полетата
          Например ако създадем клас BankAccount bankAccount = new BankAccount, и зададем private static int interest = 3
           тогава interest може да се извика само от BankAccount.getInterest (ако сме му създали getter и setter),
           (!не можем да извикаме interest с обекта, например bankAccount.getInterest!)
           ако направим обект на BankAccount object = new BankAccount всички създадени обекти приемат стойността на interest.*/

    }
}
