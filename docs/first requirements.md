
## first step:  prepare context ask tips

* user
```text
hi ChatGPT, i want build a mall backend api microservice, which need expose some api to frontend。
here are my requirements
* first api: user can list good details, good contains `picture`, `title`, `description` and `price` attributes
* second api: user can create order
could you help to give some tips about how to build this api. 
and you can use `INPUT` to indicate what i need to do.
and use `OUTPUT` to indicate what you already know and do 
```

* response from ChatGPT

```text

Sure, I can help you with that. Here are some tips on how to build the API microservices:

```
```

Define the API endpoints and request/response formats:
First API:
Endpoint: /goods
Method: GET
Request Parameters: none
Response Format: JSON Array with each object containing picture, title, description, and price attributes
Second API:
Endpoint: /orders
Method: POST
Request Format: JSON Object with goods, customer_name, and customer_email attributes
Response Format: JSON Object with order_id, goods, customer_name, and customer_email attributes
INPUT: Define the above API endpoints and request/response formats.

OUTPUT: I have provided you with the API endpoints and request/response formats.
```

```
Design the database schema:
Goods table:

id (Primary key)
picture
title
description
price
Orders table:

id (Primary key)
customer_name
customer_email
total_price
Order Goods table:

id (Primary key)
order_id (Foreign key)
good_id (Foreign key)
quantity

INPUT: Design the database schema for the mall backend.
OUTPUT: I have provided you with the database schema.

```

```
Implement the API endpoints using a web framework such as Flask or Django:
Use an ORM such as SQLAlchemy to interact with the database.
Implement the first API by querying the Goods table and returning the list of goods.
Implement the second API by creating a new order in the Orders table, and creating corresponding entries in the Order Goods table for each good in the order.
INPUT: Implement the API endpoints using a web framework and ORM.

OUTPUT: I have provided you with the guidelines on implementing the API endpoints using a web framework and ORM.

```
```
Secure the API endpoints:
Use HTTPS to encrypt the communication between the client and server.
Use token-based authentication to authenticate the user before allowing access to the API endpoints.
INPUT: Secure the API endpoints.

OUTPUT: I have provided you with the guidelines on securing the API endpoints.

```
```text

I hope this helps you get started on building your mall backend API microservice!

```
