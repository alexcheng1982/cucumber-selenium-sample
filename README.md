Browser-based Acceptance Tests using Cucumber and Selenium
========================

This is an example application which shows how to do browser-based acceptance tests using [Cucumber](http://cukes.info/) and [Selenium](http://docs.seleniumhq.org/).

Cucumber is used to write acceptance tests specification. Selenium is used to execute test cases on different browsers. [Geb](http://www.gebish.org/) is the Selenium DSL.

How to use
----------------
You need to install [Gradle](http://gradle.org) to run this application.

Start Selenium grid hub and node. Use `gradle startSeleniumHub --info` to start grid hub. Use `gradle startSeleniumNode --info` to start grid node.

Use `gradle test --info` to execute test cases.


