package com.jafupy

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CreateStorageDimension : ModInitializer {
    override fun onInitialize() {
        LOGGER.info("Hello Fabric world!")
    }

    companion object {
        const val ModID: String = "create-storage-dimension"
        val LOGGER: Logger = LoggerFactory.getLogger(ModID)
    }
}