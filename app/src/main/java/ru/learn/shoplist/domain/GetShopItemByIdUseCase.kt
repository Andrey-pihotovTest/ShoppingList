package ru.learn.shoplist.domain

class GetShopItemByIdUseCase(private val shopListRepository: ShopListRepository) {

    fun execute(id: Int) : ShopItem {
        return shopListRepository.getShopItemById(id)
    }
}