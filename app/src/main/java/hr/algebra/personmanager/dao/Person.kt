package hr.algebra.personmanager.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.lang.annotation.ElementType
import java.time.LocalDate


@Entity(tableName = "people")
data class Person(
    @PrimaryKey(autoGenerate = true)
    var _id: Long? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var picturePath: String? = null,
    var nickName: String? = null,
    var birthDate: LocalDate = LocalDate.now()
) {
    override fun toString() = "$firstName $lastName $nickName"
}