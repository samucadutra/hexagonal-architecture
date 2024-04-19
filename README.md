# hexagonal-architecture

### running wiremock with docker

```
docker run -it --rm \
-p 8082:8080 \
-p 8443:8443 \
--name wiremock \
-v $PWD/wiremock:/home/wiremock \
wiremock/wiremock:3.5.3 \
--https-port 8443 --verbose
```

### Mongo commands

#### Access Mongo inside container

```
** check if container is running:

docker ps


** look for Mongo and copy the id:

CONTAINER ID   IMAGE
cc3463564810   mongo


** use ID to access mongo bash:

docker exec -it <container_id> /bin/bash


** once inside bash access with mongosh (when ask for password just type 'example'):

root@cc3463564810:/# mongosh -u root -p
```

#### Mongo DDL/DML commands

```
** access database:

use hexagonal


** look to the collections (it must show 'customers'):

show collections


** look for the customers already saved:

db.customers.find()
```