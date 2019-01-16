package template.apptemplate.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import template.apptemplate.model.Item

@Database(entities = [
    Item::class
], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}