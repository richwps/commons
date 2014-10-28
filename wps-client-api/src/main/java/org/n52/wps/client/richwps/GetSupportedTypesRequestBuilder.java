package org.n52.wps.client.richwps;

import net.opengis.wps.x100.GetSupportedTypesDocument;
import net.opengis.wps.x100.GetSupportedTypesDocument.GetSupportedTypes;

public class GetSupportedTypesRequestBuilder {

	GetSupportedTypesDocument getTypesDoc;
	GetSupportedTypes getTypes;
	
	public GetSupportedTypesRequestBuilder() {
		getTypesDoc = GetSupportedTypesDocument.Factory.newInstance();
		getTypes = GetSupportedTypes.Factory.newInstance();
	}
	
	/**
	 * Sets the complexTypesOnly attribute
	 * @param complexTypesOnly
	 */
	public void setComplexTypesOnly (boolean complexTypesOnly) {
		this.getTypes.setComplexTypesOnly(complexTypesOnly);
	}
	/**
	 * Builds the GetSupportedTypesDocument
	 * @return GetSupportedTypesDocument
	 */
	public GetSupportedTypesDocument build() {
		this.getTypesDoc.setGetSupportedTypes(this.getTypes);
		return this.getTypesDoc;
	}
}