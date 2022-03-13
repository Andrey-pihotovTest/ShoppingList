package ru.learn.shoplist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun execute(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}