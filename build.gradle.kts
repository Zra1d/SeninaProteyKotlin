plugins {
    kotlin("jvm") version "1.9.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-netty:1.6.10")
    implementation("io.ktor:ktor-gson:1.6.10")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
    implementation("io.ktor:ktor-client-json-jvm:1.6.10")
    implementation("io.ktor:ktor-client-core-jvm:1.6.10")
    implementation("ch.qos.logback:logback-classic:1.2.9")
    implementation("org.jetbrains.exposed:exposed-core:0.35.0")
    implementation("org.jetbrains.exposed:exposed-dao:0.35.0")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.35.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}