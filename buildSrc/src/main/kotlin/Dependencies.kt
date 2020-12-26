/**
 * Created by Farouk on 24/12/2020.
 */
@Suppress("unused")
object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 30
    const val COMPILE_SDK_VERSION = 30
}

@Suppress("unused")
object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.1"
    const val ANDROIDX_TEST = "1.2.0"
    const val ANDROID_LIFECYCLE = "2.2.0"
    const val ANDROID_ARCH = "2.1.0"
    const val APPCOMPAT = "1.2.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val CORE_KTX = "1.3.2"
    const val COROUTINES = "1.4.1"
    const val ESPRESSO_CORE = "3.2.0"
    const val FRAGMENT = "1.2.5"
    const val HILT = "2.28.3-alpha"
    const val HILT_ANDROID = "1.0.0-alpha02"
    const val INSETTER = "0.3.1"
    const val JUNIT = "4.13"
    const val KOTLINX_SERIALIZATION = "1.0.1"
    const val KLUENT = "1.64"
    const val KTLINT = "0.39.0"
    const val LIVE_DATA_TESTING = "1.1.2"
    const val MATERIAL_COMPONENTS = "1.2.1"
    const val NAVIGATION_COMPONENT = "2.3.2"
    const val OKHTTP = "4.9.0"
    const val COIL = "1.1.0"
    const val RECYCLERVIEW = "1.1.0"
    const val RETROFIT = "2.9.0"
    const val ROOM = "2.2.6"
    const val RETROFIT_KOTLINX_SERIALIZATION = "0.8.0"
    const val ROBOLECTRIC = "4.4"
}

@Suppress("unused")
object BuildPluginsVersion {
    const val AGP = "4.1.1"
    const val DETEKT = "1.14.2"
    const val KOTLIN = "1.4.10"
    const val KTLINT = "9.4.1"
    const val VERSIONS_PLUGIN = "0.36.0"
}

@Suppress("unused")
object LibArchitecture {
    const val FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"
    const val LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.ANDROID_LIFECYCLE}"
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION_COMPONENT}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION_COMPONENT}"
    const val NAVIGATION_FEATURES_MODULES = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.NAVIGATION_COMPONENT}"
    const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ANDROID_LIFECYCLE}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_RUNTIME_KTX = "androidx.work:work-runtime-ktx:${Versions.ROOM}"
}

@Suppress("unused")
object LibCoroutines {
    const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
}

@Suppress("unused")
object LibDI {
    // Hilt
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:${Versions.HILT_ANDROID}"
    const val HILT_DAGGER__ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    const val HILT_VIEW_MODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.HILT}"
    const val HILT_DAGGER = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.HILT}"
    const val DAGGER = "com.google.dagger:dagger:${Versions.HILT}"
}

@Suppress("unused")
object LibHttp {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
}

@Suppress("unused")
object LibSerialization {
    const val KOTLINX =
        "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.KOTLINX_SERIALIZATION}"
    const val RETROFIT_KOTLINX =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.RETROFIT_KOTLINX_SERIALIZATION}"
}

@Suppress("unused")
object LibSupport {
    // Support library
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
}

@Suppress("unused")
object LibTesting {
    const val ANDROID_CORE_TESTING = "androidx.arch.core:core-testing:${Versions.ANDROID_ARCH}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val KLUENT = "org.amshove.kluent:kluent-android:${Versions.KLUENT}"
    const val LIVE_DATA_TESTING = "com.jraska.livedata:testing-ktx:${Versions.LIVE_DATA_TESTING}"
    const val ROBOLECTRIC = "org.robolectric:robolectric:${Versions.ROBOLECTRIC}"
}

@Suppress("unused")
object LibUI {
    const val MATERIAL_COMPONENTS = "com.google.android.material:material:${Versions.MATERIAL_COMPONENTS}"
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
    const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"
    const val INSETTERS = "dev.chrisbanes:insetter-ktx:${Versions.INSETTER}"
}

@Suppress("unused")
object LibAndroidTesting {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}

@Suppress("unused")
object Plugins {
    const val ANDROID_GRADLE_PLUGIN = "com.android.tools.build:gradle:${BuildPluginsVersion.AGP}"
    const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-stdlib:${BuildPluginsVersion.KOTLIN}"
    const val NAVIGATION_SAFE_ARGS = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION_COMPONENT}"
    const val HILT_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
}