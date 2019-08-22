## Lab 11: Spring for Full-Stack Web Apps

## Feature Task
- Ensure that you can run the Spring app.
- Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.
- Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.
- Create a route that reverses the order of the words in a query parameter. For example, if I visit /reverse?sentence=Hello world, it should return an HTML page containing world Hello.
- Write a unit test for the word reversing functionality of the above route. (Note that this will be easiest if you write a helper method for the word reversing, so that you can call that method for testing.)

## Running Application
- Application runs on localhost:8080
- Dependencies are already install just run `gradle bootRun`

## Collaborative Efforts 
Matt Stuhring  
Renee Messick  
Sapana Poudel 

## Author 
Melfi Perez


## Lab 12: Spring MVC with Databases

## Feature Task
- Create an Album model.
- An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
- A user should be able to see information about all the albums on the site.
- A user should be able to add albums to the site.

## Running Application
- Application runs on localhost:8080
- Dependencies are already install just run `gradle bootRun`

## Collaborative Efforts 
Matt Stuhring  
Renee Messick  
Nick Paro

## Feature Task
- Create a Song model.
- A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
- Ensure that the relationship between Albums and Songs is appropriately set up.
- A user should be able to see information about all the songs on the site.
- A user should be able to view a page with data about one particular album.
- A user should be able to add songs to an album.
- A user should be able to see the songs that belong to an album when looking at that album.

## Running Application
- Application runs on localhost:8080
- Dependencies are already install just run `gradle bootRun`

## Collaborative Efforts 
Matt Stuhring  
Renee Messick  
Nick Paro  
Jack Kinne
