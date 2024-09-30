package org.javaacademy.homework.homework5;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank) throws IllegalAccessException {
        BigDecimal moneyBank = getMoney(bank);
        this.money = this.money.add(moneyBank);
        setMoney(bank, BigDecimal.ZERO);
    }

    @Override
    public String toString() {
        return "Thief{" +
                "money=" + money +
                '}';
    }

    private static void setMoney(Bank bank, BigDecimal value) throws IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        for (Field declaredField : bankClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            declaredField.set(bank, value);
        }
    }

    private static BigDecimal getMoney(Bank bank) throws IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        for (Field declaredField : bankClass.getDeclaredFields()) {
            declaredField.setAccessible(true);
            return (BigDecimal) declaredField.get(bank);
        }
        return BigDecimal.ZERO;
    }
}

