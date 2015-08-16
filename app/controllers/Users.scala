package controllers

import play.api.mvc._

class Users extends Controller {
  def login = Action {
    Ok(views.html.main("login") {
      views.html.users.login()
    })
  }
}
