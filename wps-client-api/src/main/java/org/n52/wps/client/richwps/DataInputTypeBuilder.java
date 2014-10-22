
package org.n52.wps.client.richwps;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import net.opengis.ows.x11.BoundingBoxType;
import net.opengis.ows.x11.DomainMetadataType;
import net.opengis.wps.x100.ComplexDataType;
import net.opengis.wps.x100.DataInputsType;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.InputType;
import net.opengis.wps.x100.ProcessDescriptionType;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.n52.wps.client.StaticDataHandlerRepository;
import org.n52.wps.client.WPSClientException;
import org.n52.wps.io.GeneratorFactory;
import org.n52.wps.io.IGenerator;
import org.n52.wps.io.IOHandler;
import org.n52.wps.io.data.IData;

/**
 *
 * @author dalcacer
 * @version 0.0.1
 * @see ExecuteRequestBuilder
 */
public class DataInputTypeBuilder {
    
    private DataInputsType inputs;
    private ProcessDescriptionType processdescription;
   
    /**
     * 
     * @param processDescriptionType 
     */
    public DataInputTypeBuilder(final ProcessDescriptionType processDescriptionType){
        this.inputs = net.opengis.wps.x100.DataInputsType.Factory.newInstance();
        this.processdescription=processDescriptionType;
    }
    
    /**
     * 
     * @return 
     */
    public net.opengis.wps.x100.DataInputsType getDataInputType(){
        return this.inputs;
    }
    
    
    /**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param parameterID the ID of the input (see process description)
	 * @param value the actual value (for xml data xml for binary data is should be base64 encoded data)
	 * @param schema schema if applicable otherwise null
	 * @param encoding encoding if not the default encoding (for default encoding set it to null) (i.e. binary data, use base64)
	 * @param mimeType mimetype of the data, has to be set
	 * @throws WPSClientException
	 */
	public void addComplexData(String parameterID, IData value, String schema, String encoding, String mimeType) throws WPSClientException {
		GeneratorFactory fac = StaticDataHandlerRepository.getGeneratorFactory();
		InputDescriptionType inputDesc = getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDesription is null for: " + parameterID);
		}
		if (inputDesc.getComplexData() == null) {
			throw new IllegalArgumentException("inputDescription is not of type ComplexData: " + parameterID);			
		}
		
			
		/*LOGGER.debug("Looking for matching Generator ..." + 
				" schema: " + schema +
				" mimeType: " + mimeType +
				" encoding: " + encoding);*/
		
		IGenerator generator = fac.getGenerator(schema, mimeType, encoding, value.getClass());
		
		if (generator == null) {
			// generator is still null
			throw new IllegalArgumentException("Could not find an appropriate generator for parameter: " + parameterID);
		}
		
		
		InputStream stream = null;  
				
			InputType input = this.inputs.addNewInput();
			input.addNewIdentifier().setStringValue(inputDesc.getIdentifier().getStringValue());
			// encoding is UTF-8 (or nothing and we default to UTF-8)
			// everything that goes to this condition should be inline xml data
		try {
			
			if (encoding == null || encoding.equals("") || encoding.equalsIgnoreCase(IOHandler.DEFAULT_ENCODING)){
					stream = generator.generateStream(value, mimeType, schema);
					
			}else if(encoding.equalsIgnoreCase("base64")){
					stream = generator.generateBase64Stream(value, mimeType, schema);
			}else{
				throw new WPSClientException("Encoding not supported");
			}
					ComplexDataType data = input.addNewData().addNewComplexData();
					data.set(XmlObject.Factory.parse(stream));
					if (schema != null) {
						data.setSchema(schema);
					}
					if (mimeType != null) {
						data.setMimeType(mimeType);
					}
					if (encoding != null) {
						data.setEncoding(encoding);
					}
			}catch(XmlException e) {
					throw new IllegalArgumentException("error inserting node into execute request", e);
			} catch (IOException e) {
					throw new IllegalArgumentException("error reading generator output", e);
			}
			
	}

	/**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param parameterID the ID of the input (see process description)
	 * @param value the actual value as String (for xml data xml for binary data is should be base64 encoded data)
	 * @param schema schema if applicable otherwise null
	 * @param encoding encoding if not the default encoding (for default encoding set it to null) (i.e. binary data, use base64)
	 * @param mimeType mimetype of the data, has to be set
	 * @throws WPSClientException
	 */
	public void addComplexData(String parameterID, String value, String schema, String encoding, String mimeType) throws WPSClientException {
		InputDescriptionType inputDesc = getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDesription is null for: " + parameterID);
		}
		if (inputDesc.getComplexData() == null) {
			throw new IllegalArgumentException("inputDescription is not of type ComplexData: " + parameterID);			
		}	
						
		InputType input = this.inputs.addNewInput();
		input.addNewIdentifier().setStringValue(inputDesc.getIdentifier().getStringValue());
		
		// encoding is UTF-8 (or nothing and we default to UTF-8)
		// everything that goes to this condition should be inline xml data
		try {
			
			ComplexDataType data = input.addNewData().addNewComplexData();
			
			XmlOptions xmlOptions = new XmlOptions();
			
			/*
			 * TODO: set appropriate flags
			 */
			
			data.set(XmlObject.Factory.parse(value, xmlOptions));
			if (schema != null) {
				data.setSchema(schema);
			}
			if (mimeType != null) {
				data.setMimeType(mimeType);
			}
			if (encoding != null) {
				data.setEncoding(encoding);
			}
		} catch (XmlException e) {
			throw new IllegalArgumentException(
					"error inserting node into execute request", e);
		}
			
	}
	
	/**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param parameterID the ID of the input (see process description)
	 * @param value the actual value as String (for xml data xml for binary data is should be base64 encoded data)
	 * @param schema schema if applicable otherwise null
	 * @param encoding encoding if not the default encoding (for default encoding set it to null) (i.e. binary data, use base64)
	 * @param mimeType mimetype of the data, has to be set
	 * @throws WPSClientException
	 */
	public void addComplexData(String parameterID, String value, String schema, String encoding, String mimeType, boolean asReference) throws WPSClientException {
		InputDescriptionType inputDesc = getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDescription is null for: " + parameterID);
		}
		if (inputDesc.getComplexData() == null) {
			throw new IllegalArgumentException("inputDescription is not of type ComplexData: " + parameterID);			
		}
						
		InputType input = this.inputs.addNewInput();
		input.addNewIdentifier().setStringValue(inputDesc.getIdentifier().getStringValue());
		
		// encoding is UTF-8 (or nothing and we default to UTF-8)
		// everything that goes to this condition should be inline xml data
		try {
			
			ComplexDataType data = input.addNewData().addNewComplexData();
			
			XmlOptions xmlOptions = new XmlOptions();
			
			/*
			 * TODO: set appropriate flags
			 */
			
			data.set(XmlObject.Factory.parse(value, xmlOptions));
			if (schema != null) {
				data.setSchema(schema);
			}
			if (mimeType != null) {
				data.setMimeType(mimeType);
			}
			if (encoding != null) {
				data.setEncoding(encoding);
			}
		} catch (XmlException e) {
			throw new IllegalArgumentException(
					"error inserting node into execute request", e);
		}
			
	}
	
	/**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param inputType
	 * @throws WPSClientException
	 */
	public void addComplexData(InputType inputType) {
		
		String parameterID = inputType.getIdentifier().getStringValue();
		
		InputDescriptionType inputDesc = getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDescription is null for: " + parameterID);
		}
		if (inputDesc.getComplexData() == null) {
			throw new IllegalArgumentException("inputDescription is not of type ComplexData: " + parameterID);			
		}	
		
		InputType[] newInputTypeArray;
		
		InputType[] currentInputTypeArray = this.inputs.getInputArray();
		
		if(currentInputTypeArray != null){
			newInputTypeArray = Arrays.copyOf(currentInputTypeArray, currentInputTypeArray.length + 1);
		}else{
			newInputTypeArray = new InputType[1];
		}
		
		newInputTypeArray[newInputTypeArray.length - 1] = inputType;
		
		this.inputs.setInputArray(newInputTypeArray);
	}
	
	/**
	 * Add literal data to the request
	 * @param parameterID the ID of the input paramter according to the describe process
	 * @param value the value. other types than strings have to be converted to string. The datatype is automatically determined and set accordingly to the process description
	 */
	public void addLiteralData(String parameterID, String value) {
		InputDescriptionType inputDesc = this.getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDescription is null for: " + parameterID);
		}
		if (inputDesc.getLiteralData() == null) {
			throw new IllegalArgumentException("inputDescription is not of type literalData: " + parameterID);			
		}
		InputType input = this.inputs.addNewInput();
		input.addNewIdentifier().setStringValue(parameterID);
		input.addNewData().addNewLiteralData().setStringValue(value);
		DomainMetadataType dataType = inputDesc.getLiteralData().getDataType();
		if (dataType != null) {
			input.getData().getLiteralData().setDataType(dataType.getReference());
		}
	}
        
        /**
	 * Add boundingbox data to the request
	 * @param parameterID the ID of the input paramter according to the describe process
	 */
	public void addBoundingBoxData(final String parameterID,
                final String crs, final BigInteger dimensions,
                final List lowerCorner, final List upperCorner) {
		InputDescriptionType inputDesc = this.getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDescription is null for: " + parameterID);
		}
		if (inputDesc.getBoundingBoxData()== null) {
			throw new IllegalArgumentException("inputDescription is not of type boundingBoxData: " + parameterID);			
		}
		InputType input = this.inputs.addNewInput();
		input.addNewIdentifier().setStringValue(parameterID);
		
                BoundingBoxType bbData;
                bbData = input.addNewData().addNewBoundingBoxData();
                
                bbData.setCrs(crs);
                bbData.setDimensions(dimensions);
                bbData.setLowerCorner(lowerCorner);
                bbData.setUpperCorner(upperCorner);
                
                input.getData().setBoundingBoxData(bbData);
               
                String defaultCRS;
                defaultCRS = inputDesc.getBoundingBoxData().getDefault().getCRS();
		if (defaultCRS != null) {
			input.getData().getBoundingBoxData().setCrs(defaultCRS);
		}
	}

/**
 * Sets a reference to input data
 * 
 * @param parameterID ID of the input element
 * @param value reference URL
 * @param schema schema if applicable otherwise null
 * @param encoding encoding if applicable (typically not), otherwise null
 * @param mimetype mimetype of the input according to the process description. has to be set
 */
	public void addComplexDataReference(String parameterID, String value, String schema, String encoding, String mimetype) {
		InputDescriptionType inputDesc = getParameterDescription(parameterID);
		if (inputDesc == null) {
			throw new IllegalArgumentException("inputDescription is null for: " + parameterID);
		}
		if (inputDesc.getComplexData() == null) {
			throw new IllegalArgumentException("inputDescription is not of type complexData: " + parameterID);
		}
			
		InputType input = this.inputs.addNewInput();
		input.addNewIdentifier().setStringValue(parameterID);
		input.addNewReference().setHref(value);
		if (schema != null) {
			input.getReference().setSchema(schema);
		}

		if (encoding != null) {
			input.getReference().setEncoding(encoding);
		}
		if (mimetype != null) {
			input.getReference().setMimeType(mimetype);
		}
	}
        
        /**
         * 
         * @param id
         * @return 
         */
        private InputDescriptionType getParameterDescription(String id) {
		InputDescriptionType[] inputDescs = this.processdescription.getDataInputs().getInputArray();
		for (InputDescriptionType inputDesc : inputDescs) {
			if(inputDesc.getIdentifier().getStringValue().equals(id))
			{
				return inputDesc;
			}
		}
		return null;
	}
        

    
}
