package ru.learn.shoplist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun execute(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}