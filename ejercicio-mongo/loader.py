from pymongo import MongoClient
import csv

conn_param = {"host": "localhost", "port": 27017, "db": "openFlights"}

client = MongoClient(host=conn_param["host"], port=conn_param["port"])

db = client[conn_param["db"]]

with open("airports-extended.dat", "r") as file:
    airports_coll = db["airports"]

    reader = csv.DictReader(file, delimiter=";")
    to_insert = []
    for row in reader:
        row["location"] = {
            "type": "Point",
            "coordinates": [float(row["Long"]), float(row["Lat"])],
        }
        del row["Lat"]
        del row["Long"]
        to_insert.append(row)
    airports_coll.insert_many(to_insert)

with open('routes.dat', 'r') as file:
    routes_coll = db["routes"]
    to_insert = []
    reader = csv.DictReader(file, delimiter=',')
    for row in reader:
        row["Stops"] = int(row["Stops"])
        to_insert.append(row)
    routes_coll.insert_many(to_insert)