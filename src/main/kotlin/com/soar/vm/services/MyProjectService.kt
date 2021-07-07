package com.soar.vm.services

import com.intellij.openapi.project.Project
import com.soar.vm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
