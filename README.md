<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
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
    <li><a href="#roadmap">Template</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>
<!-- ABOUT THE PROJECT -->
## About The Project

Based on POM knowledge, this template will help you build an automated script easily. All functions are wrapped into this template and you only need to call to them in order to use. 

This template helps you:
* Waste time to build the automated script professionally
* Easy to expand and maintain
<p align="right">(<a href="#readme-top">back to top</a>)</p>
### Built With
* Java
* Maven
* Selenium
* AutoIT

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
* Java 11+
* Maven

### Installation
   git clone https://github.com/ntlinh8/TEMPLATE-AUTOMATED-PROJECT.git

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage
package com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.HomePO;
import pageObjects.PageGeneratorManager;

public class HomePage_001_MenuItems extends BaseTest{

	WebDriver driver;
	private HomePO homePage;
	
	@Parameters({"browser", "environment"})
	@BeforeTest
	public void beforeClass(String browserName, String environment) {
		log.info("Start Before Test");
		driver = getBrowserDriver(browserName, environment);
		homePage = PageGeneratorManager.getHomePage(driver);
		
	}
	
	@Test
	public void  MenuItems_001_AboutUs() {
		log.info("Step 01: Click to Open Menu button");
		homePage.clickToOpenMenuButton(driver);
		
		log.info("Step 02: Verify the title of pages");
		verifyEquals(homePage.getPageTitle(driver), "Sytner Group: UK Prestige Car Dealerships");
	}
	
	@AfterTest
	public void afterClass() {
		closeBrowserDriver();
	}
}

<!-- ROADMAP -->
## Structure
![TemplateStructure](https://github.com/ntlinh8/TEMPLATE-AUTOMATED-PROJECT/blob/master/TemplateStructure.png)
<p align="right">(<a href="#readme-top">back to top</a>)</p>
<!-- CONTACT -->
## Contact
Sunny Nguyen - thuylinhnguyen.hust@gmail.com

<p align="right">(<a href="#readme-top">back to top</a>)</p>
