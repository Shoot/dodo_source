package com.inappstory.sdk.utils;
/* loaded from: classes3.dex */
public class FileUnzipper {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        throw new java.io.FileNotFoundException("Failed to ensure directory: " + r7.getAbsolutePath());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void unzip(java.io.File r9, java.io.File r10, com.inappstory.sdk.utils.ProgressCallback r11) throws java.io.IOException {
        /*
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r9)
            r1.<init>(r2)
            r0.<init>(r1)
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.length()     // Catch: java.lang.Throwable -> L5c
            r4 = 0
        L19:
            java.util.zip.ZipEntry r9 = r0.getNextEntry()     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L99
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r9.getName()     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r10, r7)     // Catch: java.lang.Throwable -> L5c
            boolean r7 = r9.isDirectory()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L30
            r7 = r6
            goto L34
        L30:
            java.io.File r7 = r6.getParentFile()     // Catch: java.lang.Throwable -> L5c
        L34:
            boolean r8 = r7.isDirectory()     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L5e
            boolean r8 = r7.mkdirs()     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L41
            goto L5e
        L41:
            java.io.FileNotFoundException r9 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r10.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r11 = "Failed to ensure directory: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r11 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            r10.append(r11)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5c
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L5c
            throw r9     // Catch: java.lang.Throwable -> L5c
        L5c:
            r9 = move-exception
            goto L9d
        L5e:
            boolean r7 = r9.isDirectory()     // Catch: java.lang.Throwable -> L5c
            if (r7 == 0) goto L65
            goto L19
        L65:
            java.lang.String r7 = r6.getCanonicalPath()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r10.getCanonicalPath()     // Catch: java.lang.Throwable -> L5c
            boolean r7 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> L5c
            if (r7 != 0) goto L74
            goto L19
        L74:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L5c
        L79:
            int r6 = r0.read(r1)     // Catch: java.lang.Throwable -> L85
            r8 = -1
            if (r6 == r8) goto L87
            r8 = 0
            r7.write(r1, r8, r6)     // Catch: java.lang.Throwable -> L85
            goto L79
        L85:
            r9 = move-exception
            goto L95
        L87:
            r7.close()     // Catch: java.lang.Throwable -> L5c
            if (r11 == 0) goto L19
            long r6 = r9.getCompressedSize()     // Catch: java.lang.Throwable -> L5c
            long r4 = r4 + r6
            r11.onProgress(r4, r2)     // Catch: java.lang.Throwable -> L5c
            goto L19
        L95:
            r7.close()     // Catch: java.lang.Throwable -> L5c
            throw r9     // Catch: java.lang.Throwable -> L5c
        L99:
            r0.close()
            return
        L9d:
            r0.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inappstory.sdk.utils.FileUnzipper.unzip(java.io.File, java.io.File, com.inappstory.sdk.utils.ProgressCallback):void");
    }
}
