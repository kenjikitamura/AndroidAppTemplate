package template.apptemplate.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import template.apptemplate.model.Item
import template.apptemplate.repository.ItemRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val itemRepository: ItemRepository
) : ViewModel() {

    lateinit var items: LiveData<List<Item>>

    var hello = MutableLiveData<String>().apply {
        postValue("Hello!!")
    }

    fun test() {
        items = itemRepository.getItems()
    }
}