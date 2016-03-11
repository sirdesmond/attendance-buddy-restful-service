package utils

import com.mongodb.casbah.MongoConnection

/**
  * Created by kofikyei on 3/11/16.
  */

object MongoFactory {

  private val SERVER = "localhost"
  private val PORT   = 27017
  private val DATABASE = "attendancebuddy"
  private val COLLECTION = "users"
  val connection = MongoConnection(SERVER)
  val collection = connection(DATABASE)(COLLECTION)
}
