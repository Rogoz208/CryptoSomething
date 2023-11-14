package com.rogoz208.cryptosomething.presentation.coin_detail

import com.rogoz208.cryptosomething.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)