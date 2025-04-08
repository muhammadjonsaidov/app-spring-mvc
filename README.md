# App Spring MVC

Spring MVC asosidagi veb-ilova. PostgreSQL bilan integratsiya qilingan bo‘lib, foydalanuvchilarni boshqarish imkonini beradi.

## Texnologiyalar
- **Java**: 21  
- **Spring MVC**: 6.2.5  
- **PostgreSQL**: 42.7.5  
- **Jakarta JSTL**: 3.0.2  
- **Tomcat**: 10+  
- **Maven**

## Tuzilma
app-spring-mvc/
├── src/
│   ├── main/
│   │   ├── java/uz/pdp/
│   │   │   ├── controller/UserController.java
│   │   │   ├── model/User.java
│   │   │   └── repository/UserRepository.java
│   │   └── webapp/WEB-INF/
│   │       ├── view/
│   │       │   ├── user-list.jsp
│   │       │   └── user-form.jsp
│   │       ├── applicationContext.xml
│   │       ├── my-spring-servlet.xml
│   │       └── web.xml
├── pom.xml
└── README.md


## Funksiyalar
- `GET /users`: Foydalanuvchilar ro‘yxati  
- `GET /users/new`: Yangi foydalanuvchi qo‘shish formasi  
- `POST /users`: Foydalanuvchini saqlash  

## O‘rnatish

### Talablar
- Java 21  
- Maven  
- PostgreSQL  
- Tomcat 10+  

### PostgreSQL sozlash
1. Bazani yaratish:
   ```sql
   CREATE DATABASE test;
   \c test
    CREATE TABLE users (
        id SERIAL PRIMARY KEY,
        name VARCHAR(100),
        email VARCHAR(100)
    );
