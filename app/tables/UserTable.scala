package tables

import slick.driver.PostgresDriver.api._
import models.User

trait UserTable {
  class Users(tag: Tag) extends Table[User](tag, "users") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def email = column[String]("email")
    def password = column[String]("password")
    def salt = column[String]("salt")

    def * =
      (id.?, email, password, salt) <> (User.tupled, User.unapply)
  }

  val users = TableQuery[Users]
}
