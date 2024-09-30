package org.javaacademy.homework.homework5;

import com.sun.jdi.Value;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //Запрещено изменять модификаторы доступа!
        //Практически все будет через рефлексию
        //Создать банк с 1500 денег
        //Создать вора
        //Дописать метод stealMoney у вора так, чтобы он крал все деньги из банка себе
        //(увеличивал у себя деньги и обнулял деньги банка)
        //Вызвать здесь метод stealMoney
        //Распечатать вора и банк

        //Итог:
        //Вор - 1500 денег
        //Банк - 0 денег
        Bank bank = createBank(new BigDecimal(1500));
        getMoneyBank(bank);
        Thief thief = createThief(new BigDecimal(0));
        steal(thief, bank);
        getMoneyBank(bank);
        getMoneyThief(thief);
    }

    private static Bank createBank(BigDecimal money) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Constructor<Bank> declaredConstructor = bankClass.getDeclaredConstructor(BigDecimal.class);
        declaredConstructor.setAccessible(true);
        Bank bank = declaredConstructor.newInstance(money);
        return bank;
    }

    private static Thief createThief(BigDecimal money) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Constructor<Thief> declaredConstructor = thiefClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Thief thief = declaredConstructor.newInstance();
        return thief;
    }


    private static void getMoneyBank(Bank bank) throws IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        for (Field declaredField : bankClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            Object bankObj = declaredField.get(bank);
            System.out.println(bankObj);
        }
    }

    private static void getMoneyThief(Thief thief) throws IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        for (Field declaredField : thiefClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            Object thiefObject = declaredField.get(thief);
            System.out.println(thiefObject);
        }
    }

    private static void steal(Thief thief, Bank bank) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Method stealMoney = thiefClass.getDeclaredMethod("stealMoney", Bank.class);
        stealMoney.setAccessible(true);
        stealMoney.invoke(thief, bank);
    }

}
