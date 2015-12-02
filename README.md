Groovy Gradle environment
=========================

quick start
-----------

### debug

```
docker-compose run --rm --service-ports main /bin/bash -l
```

### start

```
docker-compose up main
```

docker environment images
-------------------------

### build env images

```
docker build -t trunk/groovy_gradle docker/groovy_gradle/
```

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

import/export image
-------------------

### download image

```
http://upload.motoranger.net.s3.amazonaws.com/jcconf_main.tar
```

### export

```
docker save --output ~/jcconf_main.tar trunk/groovy_gradle
docker save --output ~/jcconf_client.tar vvoyer/docker-selenium-firefox-chrome
```

### import

```
docker load --input ~/jcconf_main.tar
docker load --input ~/jcconf_client.tar
```

[![Build Status](https://snap-ci.com/geb/geb-example-gradle/branch/master/build_image)](https://snap-ci.com/geb/geb-example-gradle/branch/master)

Description
===========

This is an example of incorporating Geb into a Gradle build. It shows the use of Spock and JUnit 4 tests.

The build is setup to work with Firefox, Chrome and PhantomJS. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

Usage
=====

The following commands will launch the tests with the individual browsers:

```
./gradlew chromeTest
./gradlew firefoxTest
./gradlew phantomJsTest
```

To run with all, you can run:

```
./gradlew test
```

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

Questions and issues
====================

Please ask questions on [Geb user mailing list](http://xircles.codehaus.org/lists/user@geb.codehaus.org) and raise issues in [Geb issue tracker](https://jira.codehaus.org/browse/GEB).
