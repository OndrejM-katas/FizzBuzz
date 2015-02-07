# SpockKata
Example project to use Spock in a Gradle project

# Steps for setup of Spock + Gradle + Netbeans
1. Add groovy and spock dependencies to build.gradle
2. Add groovy plugin to build.gradle (apply plugin: 'groovy')
3. Necessary plugins for Netbeans 8.0: Gradle, Groovy
4. Create Groovy test file in src/test/groovy/..., and turn it into Spock specification
    - be careful to have Spock specs in the correct directory

# Steps to execute Spock specifications
Spock specs are normally executed as Gradle test cases, either from within Netbeans, or from Gradle on command line. 

Example for test "First dummy test fails" inside DummySpec specification: 

    gradle :test --tests eu.inginea.spockkata.DummySpec.First dummy test fails 
