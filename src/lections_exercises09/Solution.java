/*
Дан класс Solution, параметризированный T. Ограничьте параметр
T.T должен быть наследником класса
ClassForGenerics и одновременно
реализовывать интерфейс
InterfaceForGenerics. Менять можно только класс Solution
*/
package lections_exercises09;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics>{
}
