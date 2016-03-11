package models

/**
  * Created by kofikyei on 3/10/16.
  */
import play.api.libs.json.Json

object User {

  case class User(firstname: String, lastname: String, present: String)

  implicit val userWrites = Json.writes[User]
  implicit val userReads = Json.reads[User]

  var users = List(User("Desmond","Appiah","Y"),User("Arvind","Shekar","N"))

  def addUser(u: User) = users = users ::: List(u)

  //def deleteUser(u: User) = users = users --- List(u)
}
