from pymongo import MongoClient
myclient=MongoClient("mongodb://localhost:27017/")
print("Connected")
db=myclient["Student1"]
mycollection=db["Student"]
print("ok")
record={"_id":29,
        "name":"Jermy",
        "Roll No":"1001",
        "Branch":"CA"}
mycollection.insert_one(record)
x=mycollection.find_one()
for x in mycollection.find():
    print(x)
