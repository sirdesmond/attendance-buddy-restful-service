package utils

import com.mongodb.casbah.Imports._
import models.User

/**
  * Created by kofikyei on 3/11/16.
  */
object Common {

  /**
    * Convert a User object into a BSON format that MongoDb can store.
    */

  def buildMongoDbObject(user: User): MongoDBObject = {
    val builder = MongoDBObject.newBuilder
    builder += "firstname" -> user.firstname
    builder += "lastname" -> user.lastname
    builder += "present" -> user.present

    builder.result
  }
}
