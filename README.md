# GradlePlugin
GradlePlugin gradle 插件开发，发布
## 插件的功能

- 文件下载

文件加载核心使用的 okHttp

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
    classpath "gradle.plugin.com.zhaoyanjun:FilePlugin:1.3"
  }
}
```

2、在app的 build.gradle 文件下添加

```
apply plugin: "yanjun.download"

```

3、执行下载任务

```
gradlew :WifiToolsTest:downloadFile -Purl=yourUrl  -Ptarget=yourTarget

```

yourUrl ：需要下载的文件路径
yourTarget：下载文件要保存的路径

## 应用举例

下载图片,并且保存到电脑的 d 盘

```
gradle downloadFile -Purl=http://hiphotos.baidu.com/b951f8198718e357.jpg  -Ptarget=d:\12345.png
```
