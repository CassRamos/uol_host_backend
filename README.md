<h1 align="center"> UOL Host </h1>
<p align="center">
  <a href="#-tecnologies">Tecnologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-project">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-license">License</a>
  <p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=license&message=MIT&color=49AA26&labelColor=000000">
</p>
</p>

<br>

## 🚀 Tecnologies

A simple project that uses RestTemplate and ExceptionHandler to test RESTful endpoints.

- Java & Spring Boot
- H2 Database
- Jakarta Validation
- Git & Github 

 <br>

## 💻 Project

This project uses a random codename generator based on a chosen group type (Avengers or Justice League)

<br>

## :memo: License


This project is under license from MIT

<br>

## Endpoints 
<p>To test the application endpoints you can use the Postman, HttpPie, Insomnia...</p>

<br>

### Get all players
 - <p> To get all registered users, you'll use: </p>
 
```sh
  curl -X GET http://localhost:8080/players
```

<br>

### Register a place
 - <p> To register a user, you'll use: </p>
 
```sh
curl -X POST http://localhost:8080/players \
     -H "Content-Type: application/json" \
     -d {
          "name": "Name",
          "email": "random.email",
          "phone": "random.uuid",
          "groupType": "AVENGERS"
        }
```

<br>

<p> this can be one of the received responses: </p>

```json
{
      "id": 3,
      "name": "Name",
      "email": "random.email",
      "phone": "random.uuid",
      "codename": "Pantera Negra",
      "groupType": "AVENGERS"
}
```

<br>

<p>Thanks for your attention, see you next time 💜</p>

