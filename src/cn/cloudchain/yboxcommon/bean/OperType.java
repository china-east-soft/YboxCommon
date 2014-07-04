package cn.cloudchain.yboxcommon.bean;

public enum OperType {
	hls_start(10), hls_stop(11), shutdown(100), battery(101), mobile_data_control(
			102), wifi_info_set(103), wifi_info(104), wifi_devices(105), wifi_blacklist_add(
			106), wifi_blacklist_clear(107), signal_quality(108), traffic(109), storage(
			110), ethernet_info(111), ethernet_dhcp_set(112), ethernet_static_set(
			113), wifi_restart(114), wifi_auto_disable_info(115), wifi_auto_disable_set(
			116), mobile_traffic_info(117), sleep(118), mobile_net_info(119), auto_sleep_set(
			120), auto_sleep_info(121), ybox_update(122), ybox_update_download(
			123), device_info(124), files_detail(125), files_delete(126), files_download(
			127), cloud_download(128);

	private int num = 0;

	private OperType(int num) {
		this.num = num;
	}

	public int toNumber() {
		return num;
	}

}
