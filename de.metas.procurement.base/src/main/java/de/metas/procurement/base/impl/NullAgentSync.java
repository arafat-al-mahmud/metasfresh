package de.metas.procurement.base.impl;

import org.adempiere.util.lang.ObjectUtils;

import de.metas.procurement.sync.IAgentSync;
import de.metas.procurement.sync.protocol.SyncBPartnersRequest;
import de.metas.procurement.sync.protocol.SyncConfirmations;
import de.metas.procurement.sync.protocol.SyncInfoMessageRequest;
import de.metas.procurement.sync.protocol.SyncProductsRequest;

/*
 * #%L
 * de.metas.procurement.base
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

/**
 * An mocked implementation which only prints the requests to System.out.
 * 
 * @author metas-dev <dev@metas-fresh.com>
 *
 */
public class NullAgentSync implements IAgentSync
{
	public static final transient NullAgentSync instance = new NullAgentSync();

	private NullAgentSync()
	{
		super();
	}

	@Override
	public void syncBPartners(final SyncBPartnersRequest request)
	{
		System.out.println("syncBPartners: " + ObjectUtils.toString(request));
	}

	@Override
	public void syncProducts(SyncProductsRequest request)
	{
		System.out.println("syncProducts: " + ObjectUtils.toString(request));
	}

	@Override
	public void syncInfoMessage(SyncInfoMessageRequest request)
	{
		System.out.println("syncInfoMessage: " + ObjectUtils.toString(request));
	}

	@Override
	public void confirm(SyncConfirmations syncConfirmations)
	{
		System.out.println("confirm: " + ObjectUtils.toString(syncConfirmations));
	}

}
