package com.ssystems.shoplist.domain.usecases

import com.ssystems.shoplist.domain.ShopItem

class GetShopItemUseCase(private val repository: ShopListRepository) {
    fun getShopItem(shopItemId: Int): ShopItem {
        return repository.getShopItem(shopItemId)
    }
}