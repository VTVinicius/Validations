plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
}
group = "br.com.vtvinicius.validations"
version = "1.0.0"

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
