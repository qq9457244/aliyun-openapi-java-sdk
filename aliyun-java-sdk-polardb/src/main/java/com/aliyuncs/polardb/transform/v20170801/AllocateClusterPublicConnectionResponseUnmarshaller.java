/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.AllocateClusterPublicConnectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocateClusterPublicConnectionResponseUnmarshaller {

	public static AllocateClusterPublicConnectionResponse unmarshall(AllocateClusterPublicConnectionResponse allocateClusterPublicConnectionResponse, UnmarshallerContext context) {
		
		allocateClusterPublicConnectionResponse.setRequestId(context.stringValue("AllocateClusterPublicConnectionResponse.RequestId"));
		allocateClusterPublicConnectionResponse.setDBInstanceId(context.stringValue("AllocateClusterPublicConnectionResponse.DBInstanceId"));
		allocateClusterPublicConnectionResponse.setConnectionString(context.stringValue("AllocateClusterPublicConnectionResponse.ConnectionString"));
		allocateClusterPublicConnectionResponse.setIPType(context.stringValue("AllocateClusterPublicConnectionResponse.IPType"));
		allocateClusterPublicConnectionResponse.setPort(context.stringValue("AllocateClusterPublicConnectionResponse.Port"));
	 
	 	return allocateClusterPublicConnectionResponse;
	}
}