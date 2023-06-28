package com.innoq.component_challenge.thymeleaf_comptus.components

import com.innoq.comptus.core.Component

class Badge(componentContext: ComponentContext) : Component(componentContext) {

    val type = stringAttribute("type").orElse("default")

    fun classNames() =
        "badge " + (if (this.type == "danger") "bg-danger" else "bg-secondary")
}
