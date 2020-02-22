package com.company;


public class Integral {

    /**
     * Подынтегральная фнукция
     *
     * @param x Переменная
     * @return Результат функции
     */
    public static double InFunction(double x) {
        return 7 * Math.sinh(Math.pow(x, 2));
    }

    /**
     * Деления участка на n ровных частей
     * @param a Нижняя граница участка
     * @param b Верхняя граница участка
     * @param n Шаг разбиения
     * @return
     */
    public static double CalcIntegral(double a, double b, int n) {
        double result = 0;
        double h = (b - a) / n;
        for (int i = 0; i < n; i++) {
            result += InFunction(a + h * (i + 0.5));
        }
        result *= h;
        return result;
    }
}
