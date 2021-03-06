/*****************************************************************
Copyright  2007 52 North Initiative for Geospatial Open Source Software GmbH

 Author: foerster

 Contact: Andreas Wytzisk, 
 52 North Initiative for Geospatial Open Source SoftwareGmbH, 
 Martin-Luther-King-Weg 24,
 48155 Muenster, Germany, 
 info@52north.org

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 version 2 as published by the Free Software Foundation.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; even without the implied WARRANTY OF
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program (see gnu-gpl v2.txt). If not, write to
 the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 Boston, MA 02111-1307, USA or visit the Free
 Software Foundation�s web page, http://www.fsf.org.

 ***************************************************************/
package org.n52.wps.client;

import org.n52.wps.GeneratorDocument.Generator;
import org.n52.wps.ParserDocument.Parser;
import org.n52.wps.io.GeneratorFactory;
import org.n52.wps.io.ParserFactory;

/*
 * Initializes the Factories for Generators and Parsers, based on static information.
 * @author foerster
 * @author woessner
 *
 */
public class StaticDataHandlerRepository {

	private static GeneratorFactory genFactory;
	private static ParserFactory parserFactory;
	
	public static GeneratorFactory getGeneratorFactory() {
		if(genFactory == null) {
			Generator[] generators = WPSClientConfig.getInstance().getActiveRegisteredGenerator();		
			
			GeneratorFactory.initialize(generators);
			genFactory = GeneratorFactory.getInstance();

		}
		return genFactory;
	}
	
	public static ParserFactory getParserFactory() {
		if(parserFactory == null) {
			Parser[] parsers = WPSClientConfig.getInstance().getActiveRegisteredParser();
			ParserFactory.initialize(parsers);
			
			parserFactory = ParserFactory.getInstance();
		}
		return parserFactory;
	}
}
