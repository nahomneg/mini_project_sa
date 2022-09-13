Name of members
- Nahom Negussie Demessie 614733
- Hassan Abdelrahman Ali Ahmed 614159
- Abdelghani Houbbadi 614624

## How to run our project
Make sure you have docker setup on your machine

>> mvn package
1.	First run the docker-compose to deploy the containers
>> Docker-compose up –build or using intelij run the docker compose file.
2.	Then login using this admin account, username= abdel, password = 000
>> http://localhost:6868/api/login

3.	To populate the data add the token to the request header and make a GET request to
>> http://localhost:6868/loadcsv
#MySql configration
1. port= 3307
2. Username= root
3. password= nahom
4. Schema name = ea

#### After dumping the data to the db, you can see it by using the above params to run sql and query sql on you docker instance

### Please note you might get an error if you try to dump the same csv file twice since it will have duplicate keys error