package commons;

import java.io.File;

public class GlobalConstants {
	public static final String SYTNER_DEV_URL = "https://www.sytner.co.uk/";
	public static final String SYTNER_STAGE_URL = "https://www.sytner.co.uk/";
	public static final String SYTNER_PRODUCT_URL = "https://www.sytner.co.uk/";
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String JAVA_VERSION = System.getProperty("java.version");
	public static final String UPLOAD_FILE_PATH_FOLDER = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final long SHORT_TIMEOUT = 10;
	public static final long LONG_TIMEOUT = 30;
	public static final long RETRY_TEST_FAIL = 3;
}
