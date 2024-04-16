package ch.qos.logback.core.rolling.helper;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
class FileFinder {
    private static final String PATTERN_SEPARATOR = "/";
    private static final String REGEX_MARKER_END = "(?:\uffff)?";
    private static final String REGEX_MARKER_START = "(?:\ufffe)?";
    private FileProvider fileProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileFinder(FileProvider fileProvider) {
        this.fileProvider = fileProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String regexEscapePath(String str) {
        if (str.contains(PATTERN_SEPARATOR)) {
            String[] split = str.split(PATTERN_SEPARATOR);
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > 0) {
                    split[i] = REGEX_MARKER_START + split[i] + REGEX_MARKER_END;
                }
            }
            return TextUtils.join(PATTERN_SEPARATOR, split);
        }
        return REGEX_MARKER_START + str + REGEX_MARKER_END;
    }

    private List<String> toAbsolutePaths(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String unescapePath(String str) {
        return str.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> findDirs(String str) {
        List<PathPart> splitPath = splitPath(str);
        ArrayList arrayList = new ArrayList();
        findDirs(splitPath.get(0).listFiles(this.fileProvider), splitPath, 1, arrayList);
        return toAbsolutePaths(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> findFiles(String str) {
        List<PathPart> splitPath = splitPath(str);
        return toAbsolutePaths(findFiles(splitPath.get(0).listFiles(this.fileProvider), splitPath, 1));
    }

    List<PathPart> splitPath(String str) {
        String[] split;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(PATTERN_SEPARATOR)) {
            if (str2.contains(REGEX_MARKER_START) && str2.contains(REGEX_MARKER_END)) {
                z = true;
            } else {
                z = false;
            }
            String replace = str2.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
            if (z) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new RegexPathPart(replace));
            } else {
                arrayList2.add(replace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    private void findDirs(List<File> list, List<PathPart> list2, int i, List<File> list3) {
        if (i >= list2.size() - 1) {
            return;
        }
        PathPart pathPart = list2.get(i);
        for (File file : list) {
            if (this.fileProvider.isDirectory(file) && pathPart.matches(file)) {
                list3.add(file);
                findDirs(Arrays.asList(this.fileProvider.listFiles(file, null)), list2, i + 1, list3);
            }
        }
    }

    private List<File> findFiles(List<File> list, List<PathPart> list2, int i) {
        ArrayList arrayList = new ArrayList();
        PathPart pathPart = list2.get(i);
        int size = list2.size() - 1;
        Iterator<File> it = list.iterator();
        if (i >= size) {
            while (it.hasNext()) {
                File next = it.next();
                if (pathPart.matches(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        while (it.hasNext()) {
            File next2 = it.next();
            if (this.fileProvider.isDirectory(next2) && pathPart.matches(next2)) {
                arrayList.addAll(findFiles(Arrays.asList(this.fileProvider.listFiles(next2, null)), list2, i + 1));
            }
        }
        return arrayList;
    }
}
