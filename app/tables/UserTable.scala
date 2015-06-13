package tables

import slick.driver.PostgresDriver.api._
import models.User

trait UserTable {
  class Users(tag: Tag) extends Table[User](tag, "users") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def * =
      (id.?, name) <> (User.tupled, User.unapply)
  }

  val users = TableQuery[Users]
}
