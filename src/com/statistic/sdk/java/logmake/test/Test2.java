package com.statistic.sdk.java.logmake.test;

import com.statistic.sdk.java.logmake.AnalyticsEngineSDK;

public class Test2 {
	public static void main(String[] args) {
		// 在业务代码中，需要收集数据的地方直接调用方法即可
		AnalyticsEngineSDK.onChargeRefund("oid01", "user01");
		AnalyticsEngineSDK.onChargeSuccess("oid45", "12345");
	}
}
