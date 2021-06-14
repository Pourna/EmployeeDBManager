# EmployeeDBManager
Repository to store all details related to employees 

# Configuration and Setup
Create a database named "employeeDB" using command line

````
sudo -u root createdb "employeeDB"
````
##Local Host URL - http://localhost:8080/

# List of resources and its endpoints
## Employee

### Add an Employee
Sample Request Body
````
{  
     "firstName": "John",
     "lastName": "Smith",
     "age": 24,
     "gender": "Male",
     "contactNumber": 1234567891,
     "emergencyContact": 1223455656,
     "currentAddress": {
        "houseNumber": 1,
        "streetName": "xyz test",
        "district": "tanjore",
        "state": "TN",
        "country": "Ind",
        "pinCode": 123456
     },
     "permanentAddress": {
         "houseNumber": 1,
         "streetName": "xyz test",
         "district": "tanjore",
         "state": "TN",
         "country": "Ind",
         "pinCode": 123456
    }
}
````
### Update an employee details
````
{  
     "firstName": "Ross",
     "lastName": "Anthony",
     "age": 24,
     "gender": "Male",
     "contactNumber": 1234567891,
     "emergencyContact": 1223455656,
     "currentAddress": {
        "houseNumber": 1,
        "streetName": "xyz test",
        "district": "Bangalore",
        "state": "Karnataka",
        "country": "India",
        "pinCode": 123456
     },
     "permanentAddress": {
         "houseNumber": 1,
         "streetName": "xyz test",
         "district": "Bangalore",
         "state": "Karnataka",
         "country": "India",
         "pinCode": 123456
    }
}
````

### GET all employee
http://localhost:8080/employee 
### GET employeeById  
http://localhost:8080/employee/{id}

## Leave
### Add leaves to an employee
http://localhost:8080/employee/{id}/leaves

Sample Response Body
````
{
    "noOfDays" : "10",
    "fromDate" : "2005-02-03",
    "toDate" : "2005-02-12",
    "status" : "Not Well"
}
````
### GET all leaves list of an employee
http://localhost:8080/employee/{id}/leaves

## Salary
### Add Salary details of an employee
http://localhost:8080/employee/{id}/salary
````
{
    "creditedDate": "2005-11-12",
    "basic" : "20030",
    "bonus" : "1200",
    "hra" : "21000"
}
````
### GET all salary details of an employee
http://localhost:8080/employee/{id}/salary

