
plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.9")
    testImplementation("junit:junit:4.12")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}
