/** 
 * Copyright (c) Krapht, 2011
 * 
 * "LogisticsPipes" is distributed under the terms of the Minecraft Mod Public 
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */

package net.minecraft.src.buildcraft.krapht;

import net.minecraft.src.buildcraft.krapht.logistics.ILogisticsManagerV2;
import net.minecraft.src.buildcraft.krapht.routing.IRouterManager;
import net.minecraft.src.krapht.InventoryUtilFactory;

public final class SimpleServiceLocator {
	
	private SimpleServiceLocator(){};
	
	public static IBuildCraftProxy buildCraftProxy = null;
	public static void setBuildCraftProxy(final IBuildCraftProxy bcProxy){
		buildCraftProxy = bcProxy;
	}
	
	public static IRouterManager routerManager;
	public static void setRouterManager(final IRouterManager routerMngr){
		routerManager = routerMngr;
	}
	
	public static ILogisticsManagerV2 logisticsManager;
	public static  void setLogisticsManager(final ILogisticsManagerV2 logisticsMngr){
		logisticsManager = logisticsMngr;
	}
	
	public static InventoryUtilFactory inventoryUtilFactory;
	public static  void setInventoryUtilFactory(final InventoryUtilFactory invUtilFactory){
		inventoryUtilFactory = invUtilFactory;
	}
}
