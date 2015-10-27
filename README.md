# springSamples
Spring Samples

Commands for review :
$ cd D:\workspace\
$ mvn archetype:generate

/*
<groupId>com.rats.samples.spring.core</groupId>
  <artifactId>contextShutdownHook</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>contextShutdownHook</name>

 */

$cd .\contextShutdownHook\





$ java -cp .\target\contextShutdownHook-1.0-SNAPSHOT.jar com.rats.samples.spring.core.App


$git add .\contextShutdownHook\
$cd .\contextShutdownHook\
$git init
$git add *
$git status
$git commit -m "Initial commit"
$git status

//Create repository wihout any README in Github and copy the repo url.
$git remote add origin https://github.com/rats-github01/springSamples.git
$git status
$git push origin master
