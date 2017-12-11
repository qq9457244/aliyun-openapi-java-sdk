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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse.DBInstanceAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));

		List<DBInstanceAccount> accounts = new ArrayList<DBInstanceAccount>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBInstanceAccount dBInstanceAccount = new DBInstanceAccount();
			dBInstanceAccount.setDBClusterId(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DBClusterId"));
			dBInstanceAccount.setAccountName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBInstanceAccount.setAccountStatus(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBInstanceAccount.setAccountDescription(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBInstanceAccount.setAccountType(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));

			accounts.add(dBInstanceAccount);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}