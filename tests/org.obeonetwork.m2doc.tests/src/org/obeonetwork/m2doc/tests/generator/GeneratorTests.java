/*******************************************************************************
 *  Copyright (c) 2017 Obeo. 
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *******************************************************************************/
package org.obeonetwork.m2doc.tests.generator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Aggregates tests for the org.obeonetwork.m2doc.tests.generator package.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
@RunWith(Suite.class)
@SuiteClasses(
    value = {DocumentGeneratorTests.class, TemplateValidationGeneratorTests.class, M2DocValidatorTests.class, })
public class GeneratorTests {

}
