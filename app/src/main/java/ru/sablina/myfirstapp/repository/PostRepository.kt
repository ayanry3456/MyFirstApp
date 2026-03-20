package ru.sablina.myfirstapp.repository

import androidx.lifecycle.LiveData
import ru.sablina.myfirstapp.dto.Post

interface PostRepository {
    fun getAll(): LiveData<List<Post>>
    fun likeById(id: Long)
    fun shareById(id: Long)
    fun increaseViews(id: Long)
}
