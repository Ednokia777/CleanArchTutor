package com.ssystems.shoplist.domain.usecases

import com.ssystems.shoplist.domain.ShopItem

class EditShopItemUseCase(private val repository: ShopListRepository) {
    fun editShopIem(shopItem: ShopItem) {
        repository.editShopItem(shopItem)
    }
}