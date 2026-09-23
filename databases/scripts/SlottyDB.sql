    CREATE TABLE role(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        type VARCHAR(50) NOT NULL
    );

    CREATE TABLE user(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        type_id BIGINT NOT NULL,
        email VARCHAR(255) UNIQUE NOT NULL,
        password VARCHAR(255) NOT NULL,
        cell VARCHAR(10),
        Foreign Key (type_id) REFERENCES role(id)
    );

    CREATE Table workday(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(50) NOT NULL,
        start_time TIME NOT NULL,
        end_time TIME NOT NULL
    );

    CREATE Table flexible_schedules(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        id_supplier BIGINT NOT NULL,
        days TINYINT NOT NULL,
        workday_id BIGINT NOT NULL,
        asset TINYINT(1),
        Foreign Key (id_supplier) REFERENCES user(id),
        Foreign Key (workday_id) REFERENCES workday(id)
    );

    CREATE TABLE service(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        id_supplier BIGINT NOT NULL,
        name VARCHAR(255) NOT NULL,
        description VARCHAR(255) NOT NULL,
        duration int NOT NULL,
        price DECIMAL(10, 2) NOT NULL,
        Foreign Key (id_supplier) REFERENCES user(id)
    );

    CREATE Table state(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        type VARCHAR(100) NOT NULL
    );

    CREATE TABLE reservation(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        start_time TIMESTAMP NOT NULL,
        end_time TIMESTAMP NOT NULL,
        service_id BIGINT NOT NULL,
        state_id BIGINT NOT NULL,
        id_customer BIGINT NOT NULL,
        Foreign Key (service_id) REFERENCES service(id),
        Foreign Key (state_id) REFERENCES state(id),
        Foreign Key (id_customer) REFERENCES user(id)
    );