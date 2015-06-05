package repositories

import slick.driver.PostgresDriver.simple._
import models.User
import tables.UserTable

object UserRepository extends UserTable {
  val db = Database.forConfig("db.testdb")
  val users = TableQuery[Users]

  def insert(user: User) = {
    db.withSession { implicit session =>
      users.insert(user)
    }
  }
}
