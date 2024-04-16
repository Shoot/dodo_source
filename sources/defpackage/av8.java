package defpackage;

import defpackage.zu8;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* compiled from: QueueFileLogStore.java */
/* renamed from: av8  reason: default package */
/* loaded from: classes2.dex */
class av8 implements au3 {
    private static final Charset d = Charset.forName("UTF-8");
    private final File a;
    private final int b;
    private zu8 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFileLogStore.java */
    /* renamed from: av8$a */
    /* loaded from: classes2.dex */
    public class a implements zu8.d {
        final /* synthetic */ byte[] a;
        final /* synthetic */ int[] b;

        a(byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // defpackage.zu8.d
        public void a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.a, this.b[0], i);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFileLogStore.java */
    /* renamed from: av8$b */
    /* loaded from: classes2.dex */
    public static class b {
        public final byte[] a;
        public final int b;

        b(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public av8(File file, int i) {
        this.a = file;
        this.b = i;
    }

    private void f(long j, String str) {
        int i;
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.c.i(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.o() && this.c.M() > this.b) {
                this.c.E();
            }
        } catch (IOException e) {
            rx5.f().e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        h();
        zu8 zu8Var = this.c;
        if (zu8Var == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[zu8Var.M()];
        try {
            this.c.m(new a(bArr, iArr));
        } catch (IOException e) {
            rx5.f().e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.c == null) {
            try {
                this.c = new zu8(this.a);
            } catch (IOException e) {
                rx5 f = rx5.f();
                f.e("Could not open log file: " + this.a, e);
            }
        }
    }

    @Override // defpackage.au3
    public void a() {
        ek1.f(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // defpackage.au3
    public String b() {
        byte[] c = c();
        if (c != null) {
            return new String(c, d);
        }
        return null;
    }

    @Override // defpackage.au3
    public byte[] c() {
        b g = g();
        if (g == null) {
            return null;
        }
        int i = g.b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.au3
    public void d() {
        a();
        this.a.delete();
    }

    @Override // defpackage.au3
    public void e(long j, String str) {
        h();
        f(j, str);
    }
}
