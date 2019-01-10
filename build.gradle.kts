import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion = "1.1.1"

plugins {
    kotlin("jvm") version "1.3.11"
}

group = "com.stacrypt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("com.bettercloud:vault-java-driver:3.1.0")
    compile("com.bettercloud:vault-java-driver:3.1.0")
    compile("io.ktor:ktor-server:$ktorVersion")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}