## Hangman

### About
Project built for Pyramid Academy (GenSpark).<br>
Console-Line version of Hangman. <br>
User must guess the word given by the program. 

#### Project Instructions
0. Install Project Tools

|  Tool  | Version |     Purpose     | Documentation |
| :----- | :-----: | :-------------- | :-----------: |
| Java   |  17     | Language        | [Docs](https://docs.oracle.com/en/java/javase/17/) |
| Gradle |  7.3.3  | Build Platform  | [Docs](https://docs.gradle.org/current/userguide/userguide.html) |
| Groovy |  4.0.0  | Build Script DSL| [Docs](https://groovy-lang.org/documentation.html) |


### Installation (MacOS)

#### Documents By Docsify
to use docsify:
```bash
# add global install of docisify
yarn global add docsify-cli 

# initialize docs folder with docsify files
docsify init ./docs
```
```bash
# command to display readme's in browser
docsify serve ./docs

# results
Serving /Users/jasmineanderson/Genspark/Projects/Hangman/docs now.
Listening at http://localhost:3000
```

<!-- ### Features -->

### App module
0. Install Programs
    * Java
    * Gradle
    * Groovy
    
1. Clone Repository
```bash
git clone https://github.com/jazicorn/Hangman.git
```
2. Build Project
```bash
./gradlew build
```
3. Run Project
```bash
./gradlew run
```

#### Project Set-up
- [X] Create GitHub Repository
- [X] Choose Maven or Gradle
- [X] Create .gitignore
- [X] Project Checklist

Project Dependencies
|  Tool  | Version |     Purpose     | Documentation |
| :----: | :-----: | :-------------: | :-----------: |
| JUnit  |    5    | Testing         | [Docs](https://junit.org/junit5/docs/current/user-guide/) |

#### Project Checklist
- [ ] Class: Drawings
- [ ] File: Create words.txt file
- [ ] File: Read/Write words.txt file
- [ ] Function: wordRandom()
- [ ] Function: wordDigits()
- [ ] Function: letterGuess()
- [ ] Function: draw()
- [ ] Function: wordPrint()
- [ ] Function: play()
- [ ] Function: playAgain()
- [ ] Process finished with exit code 0
- [ ] Unit testing


#### License: [MIT](https://choosealicense.com/licenses/mit/)