package com.example.mobiiworldtask.roomutlis

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.google.firebase.firestore.auth.User

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class RepoDatabase : RoomDatabase(){

//    Make UserDatabase a SINGLETON class as we want only a SINGLE instance of UserDatabase running


//    this function will return the UserDao which we created
    abstract fun userDao(): RepoDao

    companion object{
        @Volatile
        private var INSTANCE: RepoDatabase? = null

        fun getDatabase(context: Context): RepoDatabase {
            val tempInstance = INSTANCE

//            check if there is any existing instance is present for our room database
//            if there exist an existing instance then we'll return that instance
            if(tempInstance!=null){
                return tempInstance
            }

//            If there is no any instance present for our database then we'll create a new instance
//            WHY SYNCHRONIZED ?? --> Because everything inside the synchronized block will be protected
//            by concurrent execution on multiple threads
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                            RepoDatabase::class.java,
                    "repo_database"
                ).build()
                INSTANCE = instance
                return instance
            }

        }
    }
}