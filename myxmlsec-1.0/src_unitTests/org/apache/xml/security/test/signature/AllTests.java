/*
 * Copyright 2009 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.xml.security.test.signature;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
	TestSuite suite = new TestSuite(
			"Test for org.apache.xml.security.test.signature");
	//$JUnit-BEGIN$
	suite.addTest(CreateSignatureTest.suite());
	suite.addTestSuite(X509DataTest.class);
	suite.addTestSuite(SignatureTest.class);
	suite.addTestSuite(XmlSecTest.class);
	suite.addTestSuite(InvalidKeyTest.class);
	suite.addTest(XMLSignatureInputTest.suite());
	suite.addTest(UnknownAlgoSignatureTest.suite());
	suite.addTest(KeyValueTest.suite());
	suite.addTest(ProcessingInstructionTest.suite());
	suite.addTest(ECDSASignatureTest.suite());
	suite.addTest(NoKeyInfoTest.suite());
	suite.addTest(HMACOutputLengthTest.suite());
	//$JUnit-END$
	return suite;
    }
}
