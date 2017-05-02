# How to run option 1 - Spring Tool Source
* Install Latest Spring Tool Source
* Open the Git Repository view
* Clone this Git Repository
* Remember the location of the Git repository on your local machine 
* File -> Import -> General -> Projects From Folder or Archive
* Choose yourdirectory/springServeStatic/demo (demo is the actual project). 
* Run the DemoApplication Main project as a java applicaton

#How to run option 2
* Download the zip of this repository and extract to directory of your choice
* go go directory unzippedDirectory\springServeStatic-master\springServeStatic-master\demo
* mvnw install  
* You may need a while for maven to download everthing needed
* Get the demo-0.0.1-SNAPSHOT.jar from Your Maven directory \.m2\repository\com\wiskin\webstatic\demo\demo\0.0.1-SNAPSHOT
* run the jar as follows java -jar demo-0.0.1-SNAPSHOT.jar

# How To Test

* Url http://localhost:8080/DefaultHelloWorld.html
* Url http://localhost:8080/notDefault/NonDefaultHelloWorld.html

You can find the html pages under the src/main/resources the notDefault and static (static is configured by default even if you don't configure a resource manager in the application.

Look at the addResourceHandlers(ResourceHandlerRegistry registry) method in Class MvcConfig. This is what you need to get resource mapping done for static pages if you don't rely on default directories like static. 
