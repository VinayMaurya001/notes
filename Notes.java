
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Notes {

	private static final String BASE_PATH = "C:\\workspace\\github\\";

	private static final String REPO_NAME = "notes";

	private static final String PREFIX = "<a target='_blank' href=\"https://raw.githubusercontent.com/VinayMaurya001/"
			+ REPO_NAME + "/master/";
	private static final String SUFFIX = "</a><br>";
	private static final String SPACES = "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp";

	private static final String FILENAME = REPO_NAME + ".html";
	private static int i = 0;

	public static void main(String[] args) throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		walk(BASE_PATH + REPO_NAME, 0, stringBuilder);
		try (PrintWriter out = new PrintWriter(FILENAME)) {
			out.println(stringBuilder);
		}
	}

	public static void walk(String path, int i, StringBuilder stringBuilder) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		i++;
		for (File f : list) {
			if (!isIgnoreDirOrFile(f, REPO_NAME)) {
				for (int n = 0; n < i; n++) {

					stringBuilder.append(SPACES);
				}
				String path2 = f.getAbsoluteFile().toString().substring(29);
				if (f.isDirectory()) {
					String direPath = "<span>Dir:" + path2 + "<span><br>";
					stringBuilder.append(direPath).append("\n");
					walk(f.getAbsolutePath(), i, stringBuilder);
				} else {
					String filePath = PREFIX + path2 + "\">" + f.getName() + SUFFIX;
					stringBuilder.append(filePath).append("\n");
				}
			}
		}
	}

	private static boolean isIgnoreDirOrFile(File f, String repoName) {
		String path = f.getAbsolutePath();
		List<String> ignorePaths = new ArrayList<>();
		ignorePaths.add(".git");
		ignorePaths.add(".classpath");
		ignorePaths.add(".gitignore");
		ignorePaths.add(".project");
		ignorePaths.add(".settings");
		ignorePaths.add(FILENAME);
		switch (repoName) {
		case "notes":
			ignorePaths.add(".class");
			break;
		case "coreJava":
			ignorePaths.add("abhinav");
			ignorePaths.add("bin");
			ignorePaths.add("lib");
		}
		long ignoreCount = ignorePaths.stream().filter(iPath -> {
			return path.contains(iPath);
		}).count();
		return ignoreCount > 0;

	}

}