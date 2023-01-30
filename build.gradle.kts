plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("mavenKotlin") {
            pom {
                name.set("Validation VTVinicius")
                description.set("A concise description of my library")
                url.set("https://github.com/VTVinicius/Validations")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("vini")
                        name.set("Vinicius Teixeira")
                        email.set("vinicius16.ifc@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:https://github.com/VTVinicius/Validations")
                    developerConnection.set("scm:https://github.com/VTVinicius/Validations")
                    url.set("https://github.com/VTVinicius/Validations")
                }
            }
        }
    }
}

group = "br.com.vtvinicius.validations"
version = "1.0.0"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
