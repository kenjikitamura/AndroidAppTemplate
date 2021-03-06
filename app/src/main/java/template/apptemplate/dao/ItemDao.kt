package template.apptemplate.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import template.apptemplate.model.Item

@Dao
interface ItemDao {
    @get:Query("SELECT * FROM Item ORDER BY id ASC")
    val allItems : List<Item>

    @get:Query("SELECT * FROM Item ORDER BY id ASC")
    val allItemsLiveData : LiveData<List<Item>>

    @Insert
    fun insert(item : Item)

    @Query("DELETE FROM Item")
    fun deleteAll()
}