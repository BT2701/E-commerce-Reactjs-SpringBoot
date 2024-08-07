# Spring Boot (Backend) and ReactJS (Frontend) Project

## Table of Contents

- [Spring Boot (Backend) and ReactJS (Frontend) Project](#spring-boot-backend-and-reactjs-frontend-project)
  - [Table of Contents](#table-of-contents)
  - [Project Overview](#project-overview)
  - [Features](#features)
      - [Customer](#customer)
      - [Staff](#staff)
      - [Admin](#admin)
  - [Technologies Used](#technologies-used)
  - [Architecture](#architecture)
  - [Setup and Installation](#setup-and-installation)
    - [Backend Setup (Spring Boot)](#backend-setup-spring-boot)
    - [Frontend Setup (ReactJS)](#frontend-setup-reactjs)
    - [Database Setup (MySQL)](#database-setup-mysql)
  - [Running the Application](#running-the-application)
  - [API Endpoints](#api-endpoints)
  - [Contributing](#contributing)
  - [License](#license)

## Project Overview

This project is a web application built using Spring Boot for the backend and ReactJS for the frontend. The application uses a MySQL database and communicates between the frontend and backend via RESTful APIs.

## Features

#### Customer
<table width:100>
        <tr>
            <td><img src="img_readme/Login.gif" alt="Login"></td>
            <td><img src="img_readme/Homepage.gif" alt="Homepage"></td>
        </tr>
        <tr>
            <td><img src="img_readme/product.gif" alt="product"></td>
            <td><img src="img_readme/profile.gif" alt="profile"></td>
        </tr>
        <tr>
            <td><img src="img_readme/cart.gif" alt="cart"></td>
            <td><img src="img_readme/history.gif" alt="history"></td>
        </tr>
        <tr>
            <td><img src="img_readme/contact.gif" alt="contact"></td>
            <td></td>
        </tr>
</table>

#### Staff
`Currently in release`
#### Admin
`Currently in release`

## Technologies Used

- **Backend:** Spring Boot, Spring Security, Spring JPA, Restful.
- **Frontend:** ReactJS, Axios, Bootstrap
- **Database:** MySQL
- **Build Tools:** Maven (backend), npm (frontend)

## Architecture

The application follows a client-server architecture:

- **Backend:** Exposes RESTful APIs for various operations and handles business logic and data persistence.
- **Frontend:** Provides a user interface and interacts with the backend through the APIs.

## Setup and Installation

### Backend Setup (Spring Boot)

1. **Clone the repository:**
    ```sh
    git clone https://github.com/BT2701/E-commerce-Reactjs-SpringBoot.git
    cd E-commerce-Reactjs-SpringBoot/backend
    ```

2. **Configure MySQL Database:**
    Update the `application.properties` file located in `src/main/resources` with your MySQL database credentials:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
    spring.datasource.username=
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=update
    ```

3. **Build the project:**
    ```sh
    mvn clean install
    ```

4. **Run the application:**
    ```sh
    mvn spring-boot:run
    ```

### Frontend Setup (ReactJS)

1. **Navigate to the frontend directory:**
    ```sh
    cd ../frontend
    ```

2. **Install dependencies:**
    ```sh
    npm install
    ```

3. **Configure API Base URL:**
    Update the API base URL in the `src/config.js` file to match your backend server URL:
    ```javascript
    export const API_BASE_URL = 'http://localhost:8080/';
    ```

4. **Run the application:**
    ```sh
    npm start
    ```

### Database Setup (MySQL)

1. **Install MySQL:**
    Follow the instructions to install MySQL from [MySQL Official Website](https://dev.mysql.com/downloads/mysql/).

2. **Create a database:**
    ```sql
    CREATE DATABASE yourdatabase;
    ```

3. **Create a user and grant privileges:**
    ```sql
    CREATE USER 'yourusername'@'localhost' IDENTIFIED BY 'yourpassword';
    GRANT ALL PRIVILEGES ON yourdatabase.* TO 'yourusername'@'localhost';
    FLUSH PRIVILEGES;
    ```

## Running the Application

1. **Start the backend server:**
    ```sh
    cd backend
    mvn spring-boot:run
    ```

2. **Start the frontend server:**
    ```sh
    cd frontend
    npm start
    ```

3. Open your browser and navigate to `http://localhost:3000`.

## API Endpoints

Here are some of the main API endpoints exposed by the backend:

- `GET /api/users` - Retrieve all users
- `POST /api/users` - Create a new user
- `GET /api/users/{id}` - Retrieve a specific user by ID
- `PUT /api/users/{id}` - Update a user by ID
- `DELETE /api/users/{id}` - Delete a user by ID

Refer to the backend code for a complete list of endpoints.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/YourFeature`)
3. Commit your Changes (`git commit -m 'Add some YourFeature'`)
4. Push to the Branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## License

Distributed under the Apache License 2.0. See [LICENSE](LICENSE) for more information.
