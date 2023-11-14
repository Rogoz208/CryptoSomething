package com.rogoz208.cryptosomething.domain.repository

import com.rogoz208.cryptosomething.data.remote.dto.CoinDetailDto
import com.rogoz208.cryptosomething.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}