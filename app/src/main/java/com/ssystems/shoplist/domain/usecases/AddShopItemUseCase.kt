package com.ssystems.shoplist.domain.usecases

import com.ssystems.shoplist.domain.ShopItem

class AddShopItemUseCase(private val repository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        repository.addShopItem(shopItem)
    }
}