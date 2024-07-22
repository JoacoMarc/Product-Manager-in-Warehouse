# Product Management in a Warehouse
Design a product management system for a warehouse that uses a dictionary and sets.
The dictionary is used to store product information, where the keys are product codes and the values are objects containing the product's name, price, and available quantity.
The sets are used to keep records of popular products and clearance products.
Implement the following methods in the WarehouseManager class:
- `addProduct(int code, String name, double price, int quantity)`: Adds a new product to the product dictionary.
- `sellProduct(int code, int quantity)`: Updates the available quantity of the sold product in the product dictionary.
- `markProductAsPopular(int code)`: Adds the popular product to the set of popular products.
- `listPopularProducts()`: Returns a set with the codes of the popular products.
- `markProductAsClearance(int code)`: Adds the clearance product to the set of clearance products.
- `listClearanceProducts()`: Returns a set with the codes of the clearance products.
