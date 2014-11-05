/**
 * Copyright (c) 2010-2014, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.benqprojector;

import org.openhab.binding.benqprojector.internal.BenqProjectorBindingConfig;
import org.openhab.core.binding.BindingProvider;

/**
 * @author Paul Hampson (cyclingengineer)
 * @since 1.6.0
 */
public interface BenqProjectorBindingProvider extends BindingProvider {

	public BenqProjectorBindingConfig getConfigForItemName(String itemName);
}
