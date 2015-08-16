package repositories

import slick.driver.PostgresDriver.simple._
import slick.driver.JdbcProfile

import play.api.Play.current
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.DBApi

import scala.concurrent.Future

import models.User
import tables.UserTable

object UserRepository extends UserTable {
  protected val dbConfig = DatabaseConfigProvider.get[JdbcProfile]("testdb")(current)
  import dbConfig._
  import dbConfig.driver.api._

  def insert(user: User) = {
    db.withSession { implicit session =>
      users.insert(user)
    }
  }

  def findByEmail(email: String) : Option[User] = {
    
  }
}
