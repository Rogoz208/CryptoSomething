package com.rogoz208.cryptosomething.presentation.coin_list

import com.rogoz208.cryptosomething.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)