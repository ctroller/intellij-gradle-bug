# intellij-gradle-bug

Steps to reproduce:

1. Run `./gradlew clean compileJava --rerun-tasks`

Expected output should be along the lines of: 
```
> Task :compileJava
warning: SimpleProcessor was called!
1 warning
```

2. Now rebuild the project in IntelliJ IDEA with the following Settings:
- `File | Settings | Build, Execution, Deployment | Build Tools | Gradle` and change `Build and run using` to `IntelliJ IDEA`

Using the generated sources from gradle before, IDEA should now also print the following output:
```
Parsing java… [intellij-bug.main]
java: SimpleProcessor was called!
Writing classes… [intellij-bug.main]
```

3. Now run `./gradlew clean` again
4. Rebuild the project in IntelliJ; The Annotation processor is not called anymore.
