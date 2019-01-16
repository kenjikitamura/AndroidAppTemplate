package template.apptemplate.model

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item (
    @NonNull
    @PrimaryKey
    var id: String,
    var name: String
)