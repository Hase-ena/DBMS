from pymongo import MongoClient
myclient=MongoClient("mongodb://localhost:27017/")
print("Connected")
db=myclient["Student10"]
my_collection=db["Student2"]
print("ok")
record=[{"_id":30,
        "name":"Jermy",
        "Roll No":"1004",
        "Branch":"CA"},
{"_id":31,
        "name":"Conny",
        "Roll No":"1007",
        "Branch":"MBA"},
{"_id":32,
        "name":"Cameron",
        "Roll No":"1003",
        "Branch":"MCA"}]
my_collection.insert_many(record)
x=my_collection.find_one()
for x in my_collection.find():
    print(x)
