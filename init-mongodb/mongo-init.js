db.createUser(
    {
        user: "exercise",
        pwd: "exercise",
        roles: [
            {
                role: "readWrite",
                db: "exercise"
            }
        ]
    }
);

db = new Mongo().getDB("exercise");

db.createCollection('exercises', { capped: false });
