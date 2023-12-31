package com.rogoz208.cryptosomething.data.repository

import com.rogoz208.cryptosomething.data.remote.CoinPaprikaApi
import com.rogoz208.cryptosomething.data.remote.dto.CoinDetailDto
import com.rogoz208.cryptosomething.data.remote.dto.CoinDto
import com.rogoz208.cryptosomething.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}