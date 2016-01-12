# am1_group2016_verano
Curso de Aplicaciones Móviles I - Android ISIL - Grupo 2016 - Verano

## Proyecto Android

1. Estructura del Proyecto

![1](https://github.com/ISILAndroid/am1_group2016_verano/blob/Lesson1/images/project1.png)


2. Configuración

	2.1 Gradle Proyecto
    ```
    	// Top-level build file where you can add configuration options common to all sub-projects/modules.

		buildscript {
		    repositories {
		        jcenter()
		    }
		    dependencies {
		        classpath 'com.android.tools.build:gradle:1.3.0'

		        // NOTE: Do not place your application dependencies here; they belong
		        // in the individual module build.gradle files
		    }
		}

		allprojects {
		    repositories {
		        jcenter()
		    }
		}

		task clean(type: Delete) {
		    delete rootProject.buildDir
		}

    ```

	2.2 Gradle APP
    ```
	    apply plugin: 'com.android.application'

		android {
		    compileSdkVersion 23
		    buildToolsVersion "23.0.1"

		    defaultConfig {
		        applicationId "com.isil.mytemplate"
		        minSdkVersion 14
		        targetSdkVersion 22
		        versionCode 1
		        versionName "1.0"
		    }
		    buildTypes {
		        release {
		            minifyEnabled false
		            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
		        }
		    }
		}

		dependencies {
		    compile fileTree(dir: 'libs', include: ['*.jar'])
		    testCompile 'junit:junit:4.12'
		    compile 'com.android.support:appcompat-v7:23.1.1'
		    compile 'com.android.support:support-v4:23.1.1'
		    compile 'com.android.support:design:23.1.1'
		    compile 'com.android.support:cardview-v7:23.1.1'
		    compile 'com.android.support:recyclerview-v7:23.1.1'

		}
    ```


