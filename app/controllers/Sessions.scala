package controllers

import play.api.mvc._
import org.mindrot.jbcrypt.BCrypt

class Sessions extends Controller {
  def create = Action(parse.urlFormEncoded) { implicit request =>
    val email = request.body.get("email").get.head
    val password = request.body.get("password").get.head

    val user = UserRepository.findByEmail(email)
    
    Ok(s"$email $password")
  }
}
