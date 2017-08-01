<div align="center">
<a href="https://github.com/mohan-cao/revilo"><img style="display:inline-block;" src="./revilo.png" alt="Our logo WIP"></a>
<br>
<sup>Master branch is currently </sup><a href="https://travis-ci.com/mohan-cao/revilo"><img style="display:inline-block;" src="https://travis-ci.com/mohan-cao/revilo.svg?token=geujzTyWrzPD96doTGqK&branch=master" alt="Build status"></a>
</div>

# Revilo Task Scheduler

The official page for the Revilo Task Scheduler Project!

Planning and documentation can be found here: [Revilo Wiki](https://github.com/mohan-cao/revilo/wiki)

Shared Google Drive folder for resources: [Revilo Project Folder](https://drive.google.com/open?id=0B6EjuC_mOLoyZ2NCa0RuOEp4Y3c)

For developers, please only merge branches if they pass the unit tests on the build server!

## The Team

- Abby Shen ashe848@aucklanduni.ac.nz
- Aimee Tagle atag549@aucklanduni.ac.nz
- Michael Kemp mkem114@aucklanduni.ac.nz
- Mohan Cao mcao024@aucklanduni.ac.nz
- Terran Kroft tkro003@aucklanduni.ac.nz

## Quick Startup Guide

Clone the project anywhere

`git clone git@github.com:mohan-cao/revilo.git`

Using IntelliJ IDEA:

1. Import project as Maven project
2. Wait for IntelliJ to fetch the required resources
3. Yay!

Using Eclipse:

1. Right click the left-hand side package explorer (where you have projects and stuff)
2. Go to Import... > Maven > Existing Maven Project
3. Select the root directory of your project
4. Do a few more trivial steps to reach the proof, and you're done!

## Installation and Running Unit Tests

`mvn clean` - Cleans project (start from scratch)

`mvn clean test` - Run unit test (from scratch)

`mvn test` - Run unit test

`mvn package` - Package classes into a jar (works but not executable JAR yet)

`mvn install` - Do all the above and install the package
