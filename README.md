# PAB - Programa Amigos da Bíblia


## Prerequisites

* Java 11
* Docker
* Docker Compose
* Maven

## Build

```
$ git clone https://github.com/lucas-lopes/pab
$ cd pab
$ docker-compose up -d db
$ mvn clean install
$ docker-compose down
```

## How to test

First, you will need run the docker-compose:

```
$ docker-compose up -d
```

### **Database**

Open the browser and type the following address:

http://localhost:8081

The user and password:

* **user:** admin@algamish.com 
* **password:** admin

The following steps are mecessary to configure the database:

* Add new server:  
    * **General**
        * **Name**
    * **Connection**
        * **Host:** pgsql-server
        * **Port:** 5432
        * **Username:** admin
        * **Password:** admin
        
Click in the button **Save**

---