CREATE TABLE user_details (
    serial_code INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    dateOfBirth VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    phoneNumber VARCHAR(12) NOT NULL,
    email VARCHAR(50) NOT NULL
);
