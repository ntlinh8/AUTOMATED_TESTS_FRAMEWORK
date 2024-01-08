<a name="readme-top"></a>

# AUTOMATED SCRIPT FRAMEWORK

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Structure</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>
<!-- ABOUT THE PROJECT -->
In this branch, I will show you How to config and use Allure report for automated tests project

Advantages:
1. Config Allure report to your project successfully
2. Avoid wasting time to research/fix issue when using Allure report


## Getting Started
After using Allure report, we need:
1. Ensure that Java command line is set by entering ```java --version``` into command line
   If you see the version of Java, that means Java is installed successfully. If not, you need to install Java
2. Install the Allure Command Line and add path environment variables
	(https://github.com/allure-framework/allure2/releases)
	![TemplateStructure](https://github.com/ntlinh8/TEMPLATE-AUTOMATED-PROJECT/blob/master/)
	After all, let check Allure version to ensure that it's installed successfully by entering ```allure --version``` in to command line
3. Add Allure dependencies into pom.xml
   ```
   <!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
	<dependency>
    		<groupId>io.qameta.allure</groupId>
    		<artifactId>allure-testng</artifactId>
    		<version>2.25.0</version>
	</dependency>
```
4. Create allure.properties in /test/Resources folder
	allure.results.directory=allure-json
5. Create AllureTestListener file
6. Add AllureTestListener to RunTC.xml file
7. Add Epic/ Feature/ Story/ Description/ Severity to Class/ Test method
8. After running script, open command line at the project and perform generate Allure report
```
	allure serve allure-json
 ```
The allure-json is a folder containing all results files. It's configured at step 4.

9. Result:
After all, you will see the report like below:


<!-- CONTACT -->
## Contact
Sunny Nguyen - thuylinhnguyen.hust@gmail.com

