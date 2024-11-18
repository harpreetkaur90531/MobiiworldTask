package com.example.mobiiworldtask.roomutlis

import androidx.lifecycle.LiveData
import com.example.mobiiworldtask.models.Repo


class RepoRepository (private val userDao: RepoDao){

//    variable to readAllData that we'll be getting from RepoDao
    val readAllData: LiveData<List<Repo>> = userDao.readAllData()


//    a suspend function to add new User to our database which will
//    call RepoDao and add new User
    suspend fun addRepo(user: Repo){
        userDao.addRepo(user)
    }

    //    a suspend function to update the existing user in DB
    suspend fun updateRepo(repo: Repo){
        userDao.updateRepo(repo)
    }

    //    a suspend function to delete a user from DB
    suspend fun deleteRepo(repo: Repo){
        userDao.deleteRepo(repo)
    }

    //    a suspend function to delete all user from DB
    suspend fun deleteAllRepo(){
        userDao.deleteAllRepo()
    }
}