package tables

import models.User
import slick.driver.PostgresDriver.api._

trait UserTable {
  class Users(tag: Tag) extends Table[User](tag, "users") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def * =
      (id.?, name) <> (User.tupled, User.unapply)
  }
}
