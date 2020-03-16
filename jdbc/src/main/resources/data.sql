INSERT INTO users (username, password, enabled) VALUES
    ('dima', 'pas', true),
    ('anya', 'yoga', true);

INSERT INTO authorities VALUES
    ('dima', 'ROLE_USER'),
    ('dima', 'ROLE_ADMIN'),
    ('anya', 'ROLE_USER');