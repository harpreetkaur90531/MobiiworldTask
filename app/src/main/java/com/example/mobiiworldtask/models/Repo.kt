package com.example.mobiiworldtask.models


import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class Repo (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstName: String?,
    val lastName: String?,
    val age: Int
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(firstName)
        parcel.writeString(lastName)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Repo> {
        override fun createFromParcel(parcel: Parcel): Repo {
            return Repo(parcel)
        }

        override fun newArray(size: Int): Array<Repo?> {
            return arrayOfNulls(size)
        }
    }
}