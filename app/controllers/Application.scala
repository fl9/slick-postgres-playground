package controllers

import play.api._
import play.api.mvc._

import models.User
import repositories.UserRepository

class Application extends Controller {

  def index = Action {
    UserRepository.insert(User(Some(1), "testtest", "bla", "blaa"))
    Ok(views.html.index("Your new application is ready."))
  }

}
