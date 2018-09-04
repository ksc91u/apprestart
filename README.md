# AppPhoenix

restart your application process with android-job scheduler.

* Add jitpack to your project's build.gradle

```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```

* Add dependencies

```
dependencies {
    implementation 'com.github.ksc91u:apprestart:-SNAPSHOT'
}
```  

* In your <b>Application.onCreate()</b>

```
override fun onCreate() {
    super.onCreate()
    AppPhoenix.init(this)
}

```

* Restart app from your activity

```
AppPhoenix.getInstance().restart(this)

```

\#ProcessPhoenix #android-job
