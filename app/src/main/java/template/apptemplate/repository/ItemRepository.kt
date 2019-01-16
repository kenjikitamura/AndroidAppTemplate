package template.apptemplate.repository

import template.apptemplate.dao.Database
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ItemRepository @Inject constructor(
    private val database: Database
) {
    fun getItems() = database.itemDao().allItemsLiveData
}