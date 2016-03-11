package models

import utils._
import com.mongodb.casbah.Imports._
/**
  * Created by kofikyei on 3/10/16.
  */
import play.api.libs.json.Json

case class User(firstname: String, lastname: String, present: String)

object User {

  implicit val userWrites = Json.writes[User]
  implicit val userReads = Json.reads[User]



  def addUser(u: User) = {
    val mongoUser = Common.buildMongoDbObject(u)
    MongoFactory.collection.save(mongoUser)
  }

  //def deleteUser(u: User) = users = users --- List(u)
}
