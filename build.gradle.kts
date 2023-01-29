buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(com.jeanbernad.yari.buildsrc.BuildPlugins.gradle)
        classpath(com.jeanbernad.yari.buildsrc.BuildPlugins.kotlin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}