# GradlePlugin
GradlePlugin gradle 插件开发，发布
## 插件的功能

文件下载

## 插件的详情页

```
https://plugins.gradle.org/plugin/yanjun.download
```

## 插件的使用

1、在项目的根目录的 build.gradle 文件下添加

```
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.com.zhaoyanjun:ImagePlugin:1.0"
  }
}
```

2、在app的 build.gradle 文件下添加

```
apply plugin: "yanjun.download"
```
