package com.ssystems.shoplist.domain.usecases

import androidx.lifecycle.LiveData
import com.ssystems.shoplist.domain.ShopItem

class GetShopListUseCase(private val repository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return repository.getShopList()
    }
}