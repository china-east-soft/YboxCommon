package cn.cloudchain.yboxcommon.bean;

public class Constants {
	public static final String RESULT = "result";
	public static final String ERROR_CODE = "error_code";
	public static final String ERROR_MSG = "error_msg";

	public static final String TYPE = "type";
	public static final String REMAIN = "remain";
	public static final String ENABLE = "enable";
	public static final String OPER = "oper";
	public static final String PARAMS = "params";

	public static interface File {
		public static final String FILES = "files";
		public static final String ID = "id";
		public static final String NAME = "name";
		public static final String PATH_ABSOLUTE = "path_absolute";
		public static final String IS_DIRECTORY = "is_directory";
		public static final String CHILDREN_NUM = "children_num";
		public static final String SIZE = "size";
		public static final String LAST_MODIFY_TIME = "last_modify_time";
		public static final String MEM_TOTAL = "total";
		public static final String MEM_REMAIN = "remain";
	}

	public static interface Wlan {
		public static final String MODE = "mode";
		public static final String IP = "ip";
		public static final String GATEWAY = "gateway";
		public static final String SUBMASK = "mask";
		public static final String DNS1 = "dns1";
		public static final String DNS2 = "dns2";
	}

	public static interface Hotspot {
		public static final String DEVICES = "devices";
		public static final String NAME = "name";
		public static final String MAC = "mac";
		public static final String IP = "ip";
		public static final String BLOCK = "block";
	}

	public static interface Wifi {
		public static final String SSID = "ssid";
		public static final String CHANNEL = "channel";
		public static final String KEYMGMT = "keymgmt";
		public static final String PASS = "pass";
		public static final String MAX_CLIENT = "maxclient";
		public static final String AUTO_DISABLE = "autodisable";
	}

	public static interface Traffic {
		public static final String LIMIT = "limit";
		public static final String WARN = "warn";
		public static final String TODAY = "today";
		public static final String MONTH = "month";
		public static final String TOTAL = "total";
		public static final String TX = "tx";
		public static final String RX = "rx";
	}

	public static interface Update {
		public static final String IMAGE_URL = "image_url";
		public static final String IMAGE_RESULT = "image_result";
		public static final String IMAGE_VERSION = "image_version";
		public static final String IMAGE_NAME = "image_name";
		public static final String MIDDLE_URL = "middle_url";
		public static final String MIDDLE_RESULT = "middle_result";
		public static final String MIDDLE_VERSION = "middle_version";
		public static final String MIDDLE_NAME = "middle_name";

	}

	public static interface DeviceInfo {
		public static final String MAC = "mac";
		public static final String STRENGTH = "strength";
		public static final String LEVEL = "level";
	}

	public static interface Udp {
		public static final String CONN_TYPE = "conn";
		public static final String BATTERY = "battery";
		public static final String CLIENTS_UPDATE_TIME = "clients_update_time";
		public static final String TYPE = "type";
		public static final String VERSION = "version";
		public static final String MID_NAME = "midname";
		public static final String MID_VERSION = "midver";
	}
	
	public static interface Cloud {
		public static final String PATHS = "paths";
		public static final String AUTH_TOKEN = "auth_token";
		public static final String AUTH_SECRET = "auth_secret";
		public static final String LOCAL_PATH = "localPath";
	}

	/**
	 * 组播的HOST和端口号
	 */
	public final static String GROUP_HOST = "230.0.0.1";
	public final static int GROUP_PORT = 7777;
	/**
	 * TCP socket的端口号
	 */
	public final static int SOCKET_PORT = 8888;
	/**
	 * 中间件HTTP的端口号
	 */
	public final static int MIDDLE_HTTP_PORT = 7070;
}
