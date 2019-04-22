
plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.apache.common.commons-lang3:3.1")
    testImplementation("junit:junit:4.12")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}
