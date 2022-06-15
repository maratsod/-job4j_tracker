package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    /**
     *Класс описывает работу банковской системы
     *@author MARAT
     * @version 1.0
     */
public class BankService {
    /**
     *Это поле содержит всех пользователей системы с привязанными к ним счетами
     *Хранение осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();
    /**
     *Этот метод должен добавить пользователя в систему
     * В методе должна быть проверка, что такого пользователя еще нет в системе.
     * Если он есть, то нового добавлять не надо.
     * @param user, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }
    /**
     *метод должен добавить новый счет к пользователю
     * Первоначально пользователя нужно найти по паспорту.
     * Для этого нужно использовать метод findByPassport.
     * @param passport пользователя и account
     */
    public void addAccount(String passport, Account account) {
        User user = this.findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }
    /**
     *метод ищет пользователя по номеру паспорта
     * @param passport номер, по которому будет поиск пользователя
     *@return возвращает пользователя или null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }
    /**
     *метод ищет счет пользователя по реквизитам
     * @param requisite пользователя и passport номер
     * @return возвращает account пользователя или null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = this.findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }
    /**
     *метод предназначен для перечисления денег с одного счёта на другой счёт
     * @param srcPassport номер паспорта и srcRequisite реквизиты счета источника
     * destPassport номер паспорта и destRequisite реквизиты счета куда
     * нужно перечислить amount денег
     * @return false - если счёт не найден или не хватает денег
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = this.findByRequisite(srcPassport, srcRequisite);
        Account destAccount = this.findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount
                || destAccount == null) {
            return false;
        }

        else {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            return true;
        }
    }
}