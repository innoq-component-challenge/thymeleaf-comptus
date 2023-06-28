package com.innoq.component_challenge.thymeleaf_comptus.components

import com.innoq.comptus.core.Component

class List(componentContext: ComponentContext) : Component(componentContext) {

    val children: Any?

    init {
        this.children = componentContext.attributes["children"]
    }
}
