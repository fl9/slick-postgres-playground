package models

case class User(id: Option[Int] = None, email: String, password: String, salt: String)
