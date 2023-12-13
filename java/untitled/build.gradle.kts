plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

//buildscript {
//    repositories {
//        mavenCentral()
//    }
//}

repositories {
    mavenCentral()
}



dependencies {
//    testImplementation(platform("org.junit:junit-bom:5.8.1"))
//    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.powermock:powermock-module-junit5:2.0.9")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.9")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")

}

tasks.test {
    useJUnitPlatform()
}
