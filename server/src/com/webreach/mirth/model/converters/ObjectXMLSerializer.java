/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is Mirth.
 *
 * The Initial Developer of the Original Code is
 * WebReach, Inc.
 * Portions created by the Initial Developer are Copyright (C) 2006
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Gerald Bortis <geraldb@webreachinc.com>
 *
 * ***** END LICENSE BLOCK ***** */


package com.webreach.mirth.model.converters;

import java.util.Map;

import org.w3c.dom.Document;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class ObjectXMLSerializer implements IXMLSerializer<Object>{
	private XStream xstream;
	
	public ObjectXMLSerializer() {
		xstream = new XStream(new XppDriver());
		xstream.setMode(XStream.NO_REFERENCES);
	}
	
	public String toXML(Object source) {
		return xstream.toXML(source);
	}
	
	public Object fromXML(String source) {
		return xstream.fromXML(source);
	}

	public Map<String, String> getMetadata() throws SerializerException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getMetadata(Document doc) throws SerializerException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getMetadataFromDocument(Document doc) throws SerializerException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getMetadataFromEncoded(String source) throws SerializerException {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, String> getMetadataFromXML(String xmlSource) throws SerializerException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
