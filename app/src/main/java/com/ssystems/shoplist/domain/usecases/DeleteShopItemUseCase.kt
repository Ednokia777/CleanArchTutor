package com.ssystems.shoplist.domain.usecases

import com.ssystems.shoplist.domain.ShopItem

class DeleteShopItemUseCase(private val repository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
        repository.deleteShopItem(shopItem)
    }
}