package com.github.guilhermepaulozup.horusecintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.guilhermepaulozup.horusecintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
