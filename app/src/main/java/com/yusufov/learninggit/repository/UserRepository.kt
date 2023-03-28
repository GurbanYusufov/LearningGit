package com.yusufov.learninggit.repository

import com.yusufov.learninggit.data.UserLocalDataSource
import com.yusufov.learninggit.data.UserRemoteDataSource
import javax.inject.Inject

class UserRepository @Inject constructor (
    private val userLocalDataSource:UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
){

}