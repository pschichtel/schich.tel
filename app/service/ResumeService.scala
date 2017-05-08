package service

import javax.inject.Inject

case class Resume(bio: Bio)
case class Bio(firstName: String, lastName: String)
case class Experience(name: String)
case class Skill(name: String)
case class Place(name: String)
case class Education(name: String)

class ResumeService @Inject()() {

    def getResumeFor(name: String): Resume = {
        Resume(Bio(firstName = name, lastName = "Schichtel"))
    }

}
