package com.ssystems.shoplist.domain.usecases

import androidx.lifecycle.LiveData
import com.ssystems.shoplist.domain.ShopItem

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItem: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
}