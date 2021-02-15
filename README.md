# PAB - Programa Amigos da Bíblia


## Prerequisites

* Java 11
* Docker
* Docker Compose
* Maven

## Run

```
$ git clone https://github.com/lucas-lopes/pab
$ cd pab
$ mvn clean install
$ docker-compose up -d
```

## How to test

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