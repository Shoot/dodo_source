package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.MissingLibraryException;
import defpackage.g79;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: ApkLibraryInstaller.java */
/* renamed from: pm  reason: default package */
/* loaded from: classes2.dex */
public class pm implements g79.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ApkLibraryInstaller.java */
    /* renamed from: pm$a */
    /* loaded from: classes2.dex */
    public static class a {
        public ZipFile a;
        public ZipEntry b;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.a = zipFile;
            this.b = zipEntry;
        }
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    private a d(Context context, String[] strArr, String str, h79 h79Var) {
        String[] f = f(context);
        int length = f.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = f[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = strArr[i6];
                            StringBuilder sb = new StringBuilder();
                            sb.append("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb2;
                            objArr[1] = str2;
                            h79Var.i("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        i4 = i5;
                        c = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    private String[] e(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    @Override // defpackage.g79.a
    @SuppressLint({"SetWorldReadable"})
    public void a(Context context, String[] strArr, String str, File file, h79 h79Var) {
        String[] strArr2;
        Closeable closeable;
        InputStream inputStream;
        long c;
        a aVar = null;
        Closeable closeable2 = null;
        try {
            a d = d(context, strArr, str, h79Var);
            try {
                if (d != null) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (i < 5) {
                            h79Var.i("Found %s! Extracting...", str);
                            try {
                                if (file.exists() || file.createNewFile()) {
                                    try {
                                        inputStream = d.a.getInputStream(d.b);
                                        try {
                                            closeable = new FileOutputStream(file);
                                        } catch (FileNotFoundException unused) {
                                            closeable = null;
                                        } catch (IOException unused2) {
                                            closeable = null;
                                        } catch (Throwable th) {
                                            th = th;
                                            closeable = null;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        inputStream = null;
                                        closeable = null;
                                    } catch (IOException unused4) {
                                        inputStream = null;
                                        closeable = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        closeable = null;
                                    }
                                    try {
                                        c = c(inputStream, closeable);
                                        closeable.getFD().sync();
                                    } catch (FileNotFoundException unused5) {
                                        b(inputStream);
                                        b(closeable);
                                        i = i2;
                                    } catch (IOException unused6) {
                                        b(inputStream);
                                        b(closeable);
                                        i = i2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        closeable2 = inputStream;
                                        b(closeable2);
                                        b(closeable);
                                        throw th;
                                    }
                                    if (c != file.length()) {
                                        b(inputStream);
                                        b(closeable);
                                    } else {
                                        b(inputStream);
                                        b(closeable);
                                        file.setReadable(true, false);
                                        file.setExecutable(true, false);
                                        file.setWritable(true);
                                        try {
                                            ZipFile zipFile = d.a;
                                            if (zipFile != null) {
                                                zipFile.close();
                                                return;
                                            }
                                            return;
                                        } catch (IOException unused7) {
                                            return;
                                        }
                                    }
                                }
                            } catch (IOException unused8) {
                            }
                            i = i2;
                        } else {
                            h79Var.h("FATAL! Couldn't extract the library from the APK!");
                            try {
                                ZipFile zipFile2 = d.a;
                                if (zipFile2 != null) {
                                    zipFile2.close();
                                    return;
                                }
                                return;
                            } catch (IOException unused9) {
                                return;
                            }
                        }
                    }
                } else {
                    try {
                        strArr2 = e(context, str);
                    } catch (Exception e) {
                        strArr2 = new String[]{e.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArr2);
                }
            } catch (Throwable th4) {
                th = th4;
                aVar = d;
                if (aVar != null) {
                    try {
                        ZipFile zipFile3 = aVar.a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
