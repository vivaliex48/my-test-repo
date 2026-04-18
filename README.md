# Spring Boot CRUD Application

This is a simple Spring Boot application that implements CRUD (Create, Read, Update, Delete) operations in a RESTful manner.

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/vivaliex48/my-test-repo.git
   cd my-test-repo
   ```

2. **Ensure you have Java 11 or later installed**
   You can verify your Java version by running:
   ```bash
   java -version
   ```

3. **Build the project**
   You can build the project using Maven (or Gradle, depending on the setup):
   ```bash
   mvn clean install
   ```

4. **Run the application**
   After building the project, you can run the application using:
   ```bash
   mvn spring-boot:run
   ```

5. **Access the application**
   The application should now be running on `http://localhost:8080`. You can use tools like Postman or curl to interact with the API endpoints.

## API Endpoints

| Method | Endpoint            | Description                 |
|--------|---------------------|-----------------------------|
| GET    | /api/items          | Retrieve all items          |
| GET    | /api/items/{id}     | Retrieve an item by ID      |
| POST   | /api/items          | Create a new item           |
| PUT    | /api/items/{id}     | Update an item by ID        |
| DELETE | /api/items/{id}     | Delete an item by ID        |

## License

This project is licensed under the MIT License.