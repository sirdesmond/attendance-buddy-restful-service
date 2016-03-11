package controllers

import com.wordnik.swagger.annotations.{ApiOperation, Api}
import play.api.libs.json._
import play.api.mvc._
import models._
import utils.MongoFactory


/**
  * Created by kofikyei on 3/10/16.
  */


@Api(value = "/api/admin", description= "Admin operations")
object Admin extends Controller{


  implicit val userWrites = Json.writes[User]
  implicit val userReads = Json.reads[User]

  //get all users
  @ApiOperation(value = "get All Users",
    notes = "Returns List of all Users",
    response = classOf[User],
    httpMethod = "GET")
  def listUsers = Action {
    val users = MongoFactory.collection.find().toList
    Ok(com.mongodb.util.JSON.serialize(users))
  }

  //add user
  @ApiOperation(
    nickname = "addUser",
    value = "Add User",
    notes = "Add a new user",
    httpMethod = "POST",
    response = classOf[User]
  )
  def saveUser = Action(BodyParsers.parse.json) { request =>
    val u = request.body.validate[User]
    u.fold(
      errors => {
        BadRequest(Json.obj("status" -> "OK", "message" -> JsError.toFlatJson(errors)))
      },
      user => {
        User.addUser(user)
        Ok(Json.obj("status" -> "OK"))
      }
    )
  }
  //delete user

  //update user

  //reset password
}
