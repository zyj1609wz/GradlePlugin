package com.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class Download implements Plugin<Project> {

    @Override
    void apply(Project project) {
        //创建一个 download task
        project.tasks.create("downloadFile") << {
            if (!project.hasProperty("url")) {
                LogUtil.e("url 没有参数")
                return
            }

            if (!project.hasProperty("target")) {
                LogUtil.e("没有存储路径")
                return
            }

            String url = project.getProperties().get("url")
            String targetUrl = project.getProperties().get("target")

            if (url == null || url.length() == 0) {
                LogUtil.e("url为空")
                return
            }

            if (targetUrl == null || targetUrl.length() == 0) {
                LogUtil.e("存储路径为空")
                return
            }

            DownloadService.download(url, targetUrl)
        }
    }
}
