package org.softnovo.seckill.test.java8;

import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.softnovo.seckill.test.java8.exercise.Transaction;
import org.softnovo.seckill.test.java8.exercise.TransactionFactory;

public class TestStream {
	public static void main(String[] args) {

		Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
		List<Transaction> transactions = TransactionFactory.buildTransactions();
		for (Transaction transaction : transactions) {
			//Currency currency = transaction.getCurrency();
			
		}
	}
}
