-- Remplir la table customer_tb
INSERT INTO customer_tb (id, first_name, last_name, email, phone_number) VALUES
                                                                             (1, 'John', 'Doe', 'john.doe@example.com', '123-456-7890'),
                                                                             (2, 'Jane', 'Doe', 'jane.doe@example.com', '098-765-4321');

-- Remplir la table order_tb
INSERT INTO order_tb (id, order_date, status, customer_id) VALUES
                                                               (1, '2024-12-14', 'NEW', 1),
                                                               (2, '2024-12-14', 'PROCESSING', 2);

-- Remplir la table order_item_tb
INSERT INTO order_item_tb (id, order_id, quantity, price, product_id) VALUES
                                                                          (1, 1, 2, 19.99, 1),
                                                                          (2, 2, 1, 9.99, 2);

-- Remplir la table cart_tb
INSERT INTO cart_tb (id, customer_id, created_at, updated_at) VALUES
                                                                  (1, 1, '2024-12-14T00:00:00', '2024-12-14T00:00:00'),
                                                                  (2, 2, '2024-12-14T00:00:00', '2024-12-14T00:00:00');

-- Remplir la table cart_item_tb
INSERT INTO cart_item_tb (id, cart_id, product_id, quantity) VALUES
                                                                 (1, 1, 1, 3),
                                                                 (2, 1, 2, 1),
                                                                 (3, 2, 1, 2),
                                                                 (4, 2, 3, 4);
