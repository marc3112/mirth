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

package com.webreach.mirth.connectors.file;

import java.util.Properties;

public class FileWriterProperties
{
	public static final String name = "File Writer";
	
    public static final String DATATYPE = "DataType";
    public static final String FILE_DIRECTORY = "host";
    public static final String FILE_NAME = "outputPattern";
    public static final String FILE_APPEND = "outputAppend";
    public static final String FILE_CONTENTS = "template";
    public static final String CONNECTOR_CHARSET_ENCODING = "charsetEncoding";
    public static final String FILE_TYPE = "binary";

    public static Properties getDefaults()
    {
        Properties properties = new Properties();
        properties.put(DATATYPE, name);
        properties.put(FILE_DIRECTORY, "");
        properties.put(FILE_NAME, "");
        properties.put(FILE_APPEND, "1");
        properties.put(FILE_CONTENTS, "");
        properties.put(FILE_TYPE, "0");
        properties.put(CONNECTOR_CHARSET_ENCODING, "DEFAULT_ENCODING");
        return properties;
    }
}
