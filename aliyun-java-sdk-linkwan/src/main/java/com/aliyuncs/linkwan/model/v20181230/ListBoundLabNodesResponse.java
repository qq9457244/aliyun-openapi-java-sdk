/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListBoundLabNodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBoundLabNodesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<LabNode> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<LabNode> getData() {
		return this.data;
	}

	public void setData(List<LabNode> data) {
		this.data = data;
	}

	public static class LabNode {

		private String devEui;

		private String joinEui;

		private String name;

		private String loraVersion;

		private String classMode;

		private String appKey;

		private Long freqBandPlanGroupId;

		private Long boundGatewaysCount;

		private String activationState;

		private Long createMillis;

		public String getDevEui() {
			return this.devEui;
		}

		public void setDevEui(String devEui) {
			this.devEui = devEui;
		}

		public String getJoinEui() {
			return this.joinEui;
		}

		public void setJoinEui(String joinEui) {
			this.joinEui = joinEui;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLoraVersion() {
			return this.loraVersion;
		}

		public void setLoraVersion(String loraVersion) {
			this.loraVersion = loraVersion;
		}

		public String getClassMode() {
			return this.classMode;
		}

		public void setClassMode(String classMode) {
			this.classMode = classMode;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public Long getBoundGatewaysCount() {
			return this.boundGatewaysCount;
		}

		public void setBoundGatewaysCount(Long boundGatewaysCount) {
			this.boundGatewaysCount = boundGatewaysCount;
		}

		public String getActivationState() {
			return this.activationState;
		}

		public void setActivationState(String activationState) {
			this.activationState = activationState;
		}

		public Long getCreateMillis() {
			return this.createMillis;
		}

		public void setCreateMillis(Long createMillis) {
			this.createMillis = createMillis;
		}
	}

	@Override
	public ListBoundLabNodesResponse getInstance(UnmarshallerContext context) {
		return	ListBoundLabNodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
