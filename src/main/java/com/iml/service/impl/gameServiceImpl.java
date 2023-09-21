package com.iml.service.impl;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.iml.dto.inputDataDto;
import com.iml.entity.inputData;
import com.iml.repository.gameRepository;
import com.iml.service.gameService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class gameServiceImpl implements gameService {

	private final gameRepository gameRepository;

	@Override
	public LocalTime registerMachine(inputDataDto inputDataDto) {
		int[] coins = inputDataDto.getCoins();
		boolean res = false;
		for (int i = 0; i < coins.length; i++) {
			if (coins[i] == 1 || coins[i] == 2 || coins[i] == 5 || coins[i]== 10) {
				res = true;
			}
			else {
				res =false;
				break;
			}
		}
		int[] coinsQuantity = inputDataDto.getCoinsQuantity();

		if (res) {
			int count =0;
			int totalMoney =0;
			for (Integer integer : coins) {
				totalMoney =totalMoney + integer * coinsQuantity[count];
				count++;
			}
			System.out.println(totalMoney);
			inputData inputData = new inputData();
			double hours = inputData.getHours();
			hours = totalMoney / 10.0;
			System.out.println(hours);
			LocalTime now = LocalDateTime.now().toLocalTime().plusHours((long)hours);
			System.out.println(now);
			return now;
		}
		else {
			System.out.println("false");
			return null;
		}
	}

}
