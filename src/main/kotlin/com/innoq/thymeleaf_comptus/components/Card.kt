package com.innoq.component_challenge.thymeleaf_comptus.components

import com.innoq.comptus.core.Component
import kotlin.jvm.optionals.getOrNull

class Card(componentContext: ComponentContext) : Component(componentContext) {

    val href = stringAttribute("href").getOrNull()
    val headingLevel = stringAttribute("heading-level").getOrNull()?.toInt()
}
