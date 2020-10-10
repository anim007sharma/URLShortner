# URLShortner
This is an API for URL shortener service developed as part of the assignment from Cybrilla.com.

A URL shrotner service is used to convert long url's to shorter ones to save space and easier to share.

The below tech stack is used for creating the service.

Language (Backend) : Java
Framework (Backend) : Spring Boot
Databse : Redis

How to run this application.

Using Git:
- $git clone https://github.com/anim007sharma/URLShortner.git
- Open project in your editor and change application.properties file to point to your redis hostname and port.
- Build spring project.


End Points:
There are two endpoints
1. For generating a short URl
- {yourlocalhost}/api/v1/createUrl
- You can pass the original url which you want to shorten as body via a POST method.
- It will return a string of length 5 which will be your short url hash.

2. For redirecting to original URL
- {yourlocalhost}/api/v1/{shortUrl}
- In the palce of the path variable you have to pass the short url hash which was generated when you passed the original URL.
- This method will be a GET request.
- You will be redirected to the orignal link.
