package ru.learn.shoplist.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun execute(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}