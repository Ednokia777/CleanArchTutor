package com.ssystems.shoplist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ssystems.shoplist.data.ShopListRepositoryImpl
import com.ssystems.shoplist.domain.ShopItem
import com.ssystems.shoplist.domain.usecases.DeleteShopItemUseCase
import com.ssystems.shoplist.domain.usecases.EditShopItemUseCase
import com.ssystems.shoplist.domain.usecases.GetShopListUseCase
import com.ssystems.shoplist.domain.usecases.ShopListRepository

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase =  EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopIem(newItem)
    }
}