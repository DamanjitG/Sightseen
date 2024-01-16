# Sightseen

![App Preview](app-preview.png)

*"GOOGLE.ai" was our placeholder name during development.* 

## Project & Goal

A social media app designed to connect people who love travelling and sharing their experiences. The goal is to allow users to store, bookmark and display their past trips and excursions alongside other users in a social media format reminiscent of Pinterest or Reddit for travelling.

## Team Members

Myself (Damanjit Gill), Aryan Rastogi, Michael Zheng, and Max Hurlimann.

## Setup Details

When we completed this project, we were working with free Google Cloud Platform credits. The backend is no longer being hosted, and you'll have to set up your own. "server" is the backend (Kotlin), while "application" is the frontend (also Kotlin, using Compose for Desktop). 

### Friends/User System

We used [auth0](https://auth0.com/) for auth and user management. You could make auth0 work by just setting up your own application on auth0 and swapping in your API key. 

Users are identified using a combination of name and a tag, for example "John Doe#1234". In the front-end, this is what you need to enter to add them as a friend. This is different from login information, as users log in using emails. 

# Development info

## Commands to run locally

The three projects in the gradle multiproject scheme are the backend "server", frontend "application", and models. To build, run, or execute tests, run:

```
.\gradlew x:run

.\gradlew x:build

.\gradlew x:test

```
Where "x" is either application or server (models has nothing to run). 


## Starting Backend Cloud Service

From the GCP Console:

```
git clone {repo}
git pull (if cloned before)

./gradlew :server:build
gcloud app deploy app.yaml

```

## Troubleshooting (Common issues for devs)

### Getting any errors related to java versioning

We developed using Zulu Java 17, so make sure this is what you're using, or modify the project appropriately. 

e.g No matching toolchains found for requested specification: {languageVersion=17, vendor=AZUL,
implementation=vendor-specific} for MAC_OS on x86_64.
make sure that you have downloaded java 17 from
Azul: https://www.azul.com/downloads/?version=java-17-lts&package=jdk#zulu and select this as your java version for Gradle.

## Credits

Credit to [Sean Proctor](https://github.com/sproctor) for the base of the Compose Desktop auth0 implementation: https://levelup.gitconnected.com/oauth-in-compose-for-desktop-with-auth0-9990075606a1

Credit to [Mouaad Aallam](https://github.com/aallam) for his implementation of an OpenAI API client for Kotlin: https://github.com/aallam/openai-kotlin

Credit to StackOverFlow user Gabriele Mariotti for the following implementation example of a dropdown menu: https://stackoverflow.com/questions/67111020/exposed-drop-down-menu-for-jetpack-compose

Credit to the following resources for implementation and details on Image Uploads:
* https://www.reddit.com/r/Kotlin/comments/n16u8z/desktop_compose_file_picker/
* https://stackoverflow.com/questions/12558413/how-to-filter-file-type-in-filedialog
* https://stackoverflow.com/questions/37066216/java-encode-file-to-base64-string-to-match-with-other-encoded-string
