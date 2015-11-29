Groovy Gradle environment
=========================

quick start
-----------

### debug

```
docker-compose run --rm --service-ports main
```

### start

```
docker-compose up main
```

docker environment images
-------------------------

### docker hub

[trunk/groovy_gradle](https://hub.docker.com/r/trunk/groovy_gradle/)

### into docker trunk/groovy_gradle command

```
docker run -it --rm --name groovy_gradle trunk/groovy_gradle /bin/bash -l
```

docker e2e client images
------------------------

### docker hub

[vvoyer/docker-selenium-firefox-chrome](https://hub.docker.com/r/vvoyer/docker-selenium-firefox-chrome/)

### run

```
docker pull vvoyer/docker-selenium-firefox-chrome

docker run \
--privileged \
-p 4444:4444 \
-p 5999:5999 \
-d \
vvoyer/docker-selenium-firefox-chrome
```

### connect into docker use vnc

```
password: secret
ip: your docker ip
password: secret
```

#### OSX

use safari

url: vnc://192.168.99.100:5999

#### other

install vnc viewer
