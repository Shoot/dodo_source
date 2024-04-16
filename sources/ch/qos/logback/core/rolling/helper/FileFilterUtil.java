package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class FileFilterUtil {
    public static String afterLastSlash(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static int extractCounter(File file, String str) {
        Pattern compile = Pattern.compile(str);
        String name = file.getName();
        Matcher matcher = compile.matcher(name);
        if (matcher.matches()) {
            return Integer.valueOf(matcher.group(1)).intValue();
        }
        throw new IllegalStateException("The regex [" + str + "] should match [" + name + "]");
    }

    public static File[] filesInFolderMatchingStemRegex(File file, final String str) {
        if (file == null) {
            return new File[0];
        }
        if (file.exists() && file.isDirectory()) {
            return file.listFiles(new FilenameFilter() { // from class: ch.qos.logback.core.rolling.helper.FileFilterUtil.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str2) {
                    return str2.matches(str);
                }
            });
        }
        return new File[0];
    }

    public static int findHighestCounter(File[] fileArr, String str) {
        int i = Integer.MIN_VALUE;
        for (File file : fileArr) {
            int extractCounter = extractCounter(file, str);
            if (i < extractCounter) {
                i = extractCounter;
            }
        }
        return i;
    }

    public static String slashify(String str) {
        return str.replace(CoreConstants.ESCAPE_CHAR, '/');
    }
}
