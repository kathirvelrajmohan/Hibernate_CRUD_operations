# Hibernate CRUD Application

This is a simple Hibernate application using PostgreSQL, built with Maven in IntelliJ IDEA. The project demonstrates basic CRUD (Create, Read, Update, Delete) operations with Hibernate.

## Technologies Used

- Java
- Hibernate
- PostgreSQL
- Maven
- IntelliJ IDEA

## Setup Instructions

### 1. Clone the Repository
```sh
git clone <repository_url>
cd <project_directory>
```

### 2. Add Required Dependencies

The project uses Hibernate and PostgreSQL dependencies, which are included in the `pom.xml` file. If needed, you can update or add dependencies from the Maven Repository.

### 3. Configure Database Settings

The project does not include the `hibernate.cfg.xml` file, which contains database credentials. You need to create this file and configure it with your database settings.

#### Sample `hibernate.cfg.xml`:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/your_database</property>
        <property name="hibernate.connection.username">your_username</property>
        <property name="hibernate.connection.password">your_password</property>
        <property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
    </session-factory>
</hibernate-configuration>
```
Replace `your_database`, `your_username`, and `your_password` with your actual database credentials.

### 4. Run the Application

Ensure PostgreSQL is running, then execute the application from your IDE or using:
```sh
mvn clean install
java -jar target/<your-jar-file>.jar
```

## Features

- Basic CRUD operations with Hibernate
- PostgreSQL integration
- Simple project structure for easy understanding
