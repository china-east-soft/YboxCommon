package cn.cloudchain.yboxcommon.bean;

public class Types {
	// 升级类型
	public static final int MODE_UPDATE_NOW = 1;
	public static final int MODE_UPDATE_AFTER_RESTART = 0;

	// 加密类型
	public static final int KEYMGMT_NONE = 0;
	public static final int KEYMGMT_WPA_PSK = 1;
	public static final int KEYMGMT_WPA2_PSK = 2;

	// 设备类型
	public static final int DEVICES_BLOCK = 2;
	public static final int DEVICES_UNBLOCK = 1;
	public static final int DEVICES_ALL = 0;

	// 自动休眠类型
	public static final int AUTO_SLEEP_OFF = 0;
	public static final int AUTO_SLEEP_FOR_10 = 1;
	public static final int AUTO_SLEEP_FOR_30 = 2;

	// 热点自动关闭类型
	public static final int HOTSPOT_AUTO_DISABLE_OFF = 0;
	public static final int HOTSPOT_AUTO_DISABLE_FOR_FIVE_MINS = 1;
	public static final int HOTSPOT_AUTO_DISABLE_FOR_TEN_MINS = 2;

	// 网络模式
	public static final int CONN_TYPE_ETHERNET = 1;
	public static final int CONN_TYPE_MOBILE_DATA_ON = 2;
	public static final int CONN_TYPE_MOBILE_DATA_OFF = 3;
	public static final int CONN_TYPE_NONE = 0;

	// 以太网连接模式
	public static final int ETHERNET_MODE_NONE = -1;
	public static final int ETHERNET_MODE_STATIC = 1;
	public static final int ETHERNET_MODE_DHCP = 2;
}
