package com.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class Download implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //创建一个 download task
        project.tasks.create("downloadImage") << {
            if (!project.hasProperty("url")) {
                LogUtil.e("url 没有参数")
                return
            }

            String url = project.getProperties().get("url")

            if (url == null || url.length() == 0) {
                LogUtil.e("url 为空")
                return
            }

            DownloadService.download(url)
        }
    }
}
