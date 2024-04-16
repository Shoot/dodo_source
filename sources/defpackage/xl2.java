package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.UncheckedIOException;
/* compiled from: DataUtil.java */
/* renamed from: xl2  reason: default package */
/* loaded from: classes3.dex */
public final class xl2 {
    private static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    public static final Charset b;
    static final String c;
    private static final char[] d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DataUtil.java */
    /* renamed from: xl2$a */
    /* loaded from: classes3.dex */
    public static class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        b = forName;
        c = forName.name();
        d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static a b(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b2 = bArr[0];
        if ((b2 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b2 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new a("UTF-32", false);
        }
        if ((b2 == -2 && bArr[1] == -1) || (b2 == -1 && bArr[1] == -2)) {
            return new a("UTF-16", false);
        }
        if (b2 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new a("UTF-8", true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ByteBuffer c() {
        return ByteBuffer.allocate(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return h(matcher.group(1).trim().replace("charset=", ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e() {
        StringBuilder b2 = wza.b();
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = d;
            b2.append(cArr[random.nextInt(cArr.length)]);
        }
        return wza.o(b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h53 f(InputStream inputStream, String str, String str2, fr7 fr7Var) throws IOException {
        boolean z;
        h53 f;
        wbc wbcVar;
        Charset forName;
        if (inputStream == null) {
            return new h53(str2);
        }
        boolean z2 = false;
        fr1 e = fr1.e(inputStream, 32768, 0);
        try {
            e.mark(32768);
            ByteBuffer g = g(e, 5119);
            if (e.read() == -1) {
                z = true;
            } else {
                z = false;
            }
            e.reset();
            a b2 = b(g);
            if (b2 != null) {
                str = b2.a;
            }
            h53 h53Var = null;
            if (str == null) {
                try {
                    CharBuffer decode = b.decode(g);
                    if (decode.hasArray()) {
                        f = fr7Var.e(new CharArrayReader(decode.array(), decode.arrayOffset(), decode.limit()), str2);
                    } else {
                        f = fr7Var.f(decode.toString(), str2);
                    }
                    Iterator<re3> it = f.N0("meta[http-equiv=content-type], meta[charset]").iterator();
                    String str3 = null;
                    while (it.hasNext()) {
                        re3 next = it.next();
                        if (next.r("http-equiv")) {
                            str3 = d(next.e(RemoteMessageConst.Notification.CONTENT));
                        }
                        if (str3 == null && next.r("charset")) {
                            str3 = next.e("charset");
                            continue;
                        }
                        if (str3 != null) {
                            break;
                        }
                    }
                    if (str3 == null && f.j() > 0) {
                        kz6 i = f.i(0);
                        if (i instanceof wbc) {
                            wbcVar = (wbc) i;
                        } else {
                            if (i instanceof kj1) {
                                kj1 kj1Var = (kj1) i;
                                if (kj1Var.c0()) {
                                    wbcVar = kj1Var.Z();
                                }
                            }
                            wbcVar = null;
                        }
                        if (wbcVar != null && wbcVar.b0().equalsIgnoreCase("xml")) {
                            str3 = wbcVar.e("encoding");
                        }
                    }
                    String h = h(str3);
                    if (h != null && !h.equalsIgnoreCase(c)) {
                        str = h.trim().replaceAll("[\"']", "");
                    } else if (z) {
                        h53Var = f;
                    }
                } catch (UncheckedIOException e2) {
                    throw e2.a();
                }
            } else {
                vvb.i(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            }
            if (h53Var == null) {
                if (str == null) {
                    str = c;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(e, Charset.forName(str)), 32768);
                if (b2 != null && b2.b) {
                    if (bufferedReader.skip(1L) == 1) {
                        z2 = true;
                    }
                    vvb.d(z2);
                }
                try {
                    h53Var = fr7Var.e(bufferedReader, str2);
                    if (str.equals(c)) {
                        forName = b;
                    } else {
                        forName = Charset.forName(str);
                    }
                    h53Var.f1().c(forName);
                    if (!forName.canEncode()) {
                        h53Var.Z0(b);
                    }
                    bufferedReader.close();
                } catch (UncheckedIOException e3) {
                    throw e3.a();
                }
            }
            return h53Var;
        } finally {
            e.close();
        }
    }

    public static ByteBuffer g(InputStream inputStream, int i) throws IOException {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        vvb.e(z, "maxSize must be 0 (unlimited) or larger");
        return fr1.e(inputStream, 32768, i).b(i);
    }

    private static String h(String str) {
        if (str != null && str.length() != 0) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
