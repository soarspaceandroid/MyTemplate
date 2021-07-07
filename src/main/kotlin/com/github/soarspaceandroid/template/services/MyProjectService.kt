package com.github.soarspaceandroid.template.services

import com.github.soarspaceandroid.template.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
