package com.github.gingerboy14.componentfoldercreator.services

import com.intellij.openapi.project.Project
import com.github.gingerboy14.componentfoldercreator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
