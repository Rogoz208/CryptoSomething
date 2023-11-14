package com.rogoz208.cryptosomething.domain.use_case.get_coin

import com.rogoz208.cryptosomething.common.Resource
import com.rogoz208.cryptosomething.data.remote.dto.toCoin
import com.rogoz208.cryptosomething.data.remote.dto.toCoinDetail
import com.rogoz208.cryptosomething.domain.model.Coin
import com.rogoz208.cryptosomething.domain.model.CoinDetail
import com.rogoz208.cryptosomething.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: retrofit2.HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}