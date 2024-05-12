package com.jafupy;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateStorageDimension implements ModInitializer {
	public static final String ModID = "create-storage-dimension";
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}