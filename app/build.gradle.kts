plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json-jvm:1.5.0")
}

// This minimal reproducible example fails to run on Java 8!
//val javaLanguageVersion = JavaLanguageVersion.of(8)
val javaLanguageVersion = JavaLanguageVersion.of(17)

kotlin {
    jvmToolchain {
        languageVersion.set(javaLanguageVersion)
    }
}

java {
    toolchain {
        languageVersion.set(javaLanguageVersion)
    }
}

application {
    mainClass.set("me.madhead.kotlinx.serialization.json.java8.AppKt")
}
