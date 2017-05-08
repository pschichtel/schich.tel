package controllers

import javax.inject.Inject

import play.api.mvc._
import service.ResumeService

class Application @Inject() (resumeService: ResumeService) extends Controller {

    def index = Action { implicit request =>
      Ok(views.html.select())
    }

    def show(name: String) = Action { implicit request =>
        Ok(views.html.view(resumeService.getResumeFor(name)))
    }

}
