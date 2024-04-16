package com.inappstory.sdk.lrudiskcache;

import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.stories.cache.DownloadFileState;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedList;
/* loaded from: classes3.dex */
public class FileManager {
    private File cacheDir;

    public FileManager(File file, String str) throws IOException {
        this.cacheDir = file;
        prepare(str);
    }

    public static boolean checkShaAndSize(File file, Long l, String str) {
        if (l == null || l.longValue() <= 0 || str == null || str.isEmpty()) {
            return true;
        }
        if (file.length() == l.longValue() && getFileSHA1(file).equals(str)) {
            return true;
        }
        return false;
    }

    public static void deleteFolderRecursive(File file, boolean z) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFolderRecursive(file2, true);
            }
        }
        if (z) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean deleteRecursive(File file) {
        boolean z = true;
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                z &= deleteRecursive(file2);
            }
        }
        return file.delete() & z;
    }

    private IOException formatException(String str, File file) {
        return new IOException(String.format(str, file.getName()));
    }

    public static String getFileSHA1(File file) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (byte b : digest) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static File getFullFile(DownloadFileState downloadFileState) {
        if (downloadFileState != null) {
            return downloadFileState.getFullFile();
        }
        return null;
    }

    public static ArrayList<String> recursiveFileList(File file) {
        File[] listFiles;
        ArrayList<String> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                arrayList.addAll(recursiveFileList(file2));
            } else {
                arrayList.add(file2.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public boolean checkAndUse(File file, String str) throws IOException {
        File file2 = new File(file + str);
        if (!file2.exists() && !file2.mkdirs()) {
            if (!file.canWrite()) {
                return false;
            }
            File file3 = new File(file + File.separator + "testFile");
            if (!file3.createNewFile()) {
                return false;
            }
            file3.delete();
            this.cacheDir = file;
            return true;
        }
        this.cacheDir = new File(file + str);
        return true;
    }

    public void delete(String str) throws IOException {
        File file = new File(this.cacheDir, str);
        if (!file.exists()) {
            file = new File(str);
        }
        if (file.exists()) {
            deleteRecursive(file);
        }
    }

    public boolean exists(String str) {
        return new File(this.cacheDir, str).exists();
    }

    public File get(String str) {
        return new File(this.cacheDir, str);
    }

    public File getCacheDir() {
        return this.cacheDir;
    }

    public long getFileSize(File file) {
        File[] listFiles;
        long j = 0;
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return file.length();
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            while (!linkedList.isEmpty()) {
                File file2 = (File) linkedList.remove(0);
                if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                    for (File file3 : listFiles) {
                        j += file3.length();
                        if (file3.isDirectory()) {
                            linkedList.add(file3);
                        }
                    }
                }
            }
        }
        return j;
    }

    public File getJournalFile() {
        File file = new File(this.cacheDir, "journal.bin");
        try {
            this.cacheDir.mkdirs();
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public void prepare(String str) throws IOException {
        if (!checkAndUse(this.cacheDir, str) && !checkAndUse(InAppStoryManager.getInstance().getContext().getFilesDir(), str)) {
            throw formatException("Unable to use cache directory %s", this.cacheDir);
        }
    }

    public File put(File file, String str) throws IOException {
        boolean z;
        File file2 = new File(str);
        if (!this.cacheDir.exists() && !this.cacheDir.mkdirs()) {
            z = false;
        } else {
            z = true;
        }
        if (z | file2.exists() | file.renameTo(file2)) {
            return file2;
        }
        throw formatException("Unable to use file %s", file);
    }
}
