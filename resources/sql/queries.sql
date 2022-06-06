-- Users Queries

-- :name create-user! :! :n
-- :doc creates a new user record
INSERT INTO users
(id, first_name, last_name, email, pass)
VALUES (:id, :first_name, :last_name, :email, :pass)

-- :name update-user! :! :n
-- :doc updates an existing user record
UPDATE users
SET first_name = :first_name, last_name = :last_name, email = :email
WHERE id = :id

-- :name get-user-by-id :? :1
-- :doc retrieves a user record given the id
SELECT * FROM users
WHERE id = :id

-- :name is-a-member :? :n
-- :doc retrieves a user record given the username and password
SELECT * FROM users WHERE :turple:details

-- :name get-all-users :? :n
-- :doc retrieves all users
SELECT * FROM users

-- :name delete-user! :! :n
-- :doc deletes a user record given the id
DELETE FROM users
WHERE id = :id

-- contacts Queries