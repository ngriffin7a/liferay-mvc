/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.mvc.bridge;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;


/**
 * @author  Neil Griffin
 */
public class GenericMVCPortlet extends GenericPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) {

		// Maps to @GET

		// Temporary
		getPortletContext().getRequestDispatcher("/WEB-INF/views/portletViewMode.jspx");
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse) {

		// Maps to @POST
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {

		String method = resourceRequest.getMethod().toLowerCase();

		if (method.equals("get")) {
			// Maps to @GET
		}
		else if (method.equals("post")) {
			// Maps to @POST
		}
		else if (method.equals("put")) {
			// Maps to @PUT
		}
		else if (method.equals("delete")) {
			// Maps to @DELETE
		}
	}
}
