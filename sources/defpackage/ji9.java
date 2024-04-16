package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RequestBody.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lji9;", "", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "", "isDuplex", "isOneShot", "<init>", "()V", "Companion", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ji9  reason: default package */
/* loaded from: classes3.dex */
public abstract class ji9 {
    public static final a Companion = new a(null);

    /* compiled from: RequestBody.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u0005*\u00020\u00142\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u0002H\u0007J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\bH\u0007J.\u0010\u001f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007J\u001a\u0010!\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0014H\u0007J\f\u0010\"\u001a\u00020\u0005*\u00020\u0005H\u0007¨\u0006%"}, d2 = {"Lji9$a;", "", "", "Lqc6;", "contentType", "Lji9;", "k", "(Ljava/lang/String;Lqc6;)Lji9;", "Llk0;", "a", "(Llk0;Lqc6;)Lji9;", "Ljava/io/FileDescriptor;", "j", "(Ljava/io/FileDescriptor;Lqc6;)Lji9;", "", "", "offset", "byteCount", "o", "([BLqc6;II)Lji9;", "Ljava/io/File;", "i", "(Ljava/io/File;Lqc6;)Lji9;", "Lnr7;", "Liu3;", "fileSystem", Image.TYPE_HIGH, "(Lnr7;Liu3;Lqc6;)Lji9;", RemoteMessageConst.Notification.CONTENT, DateTokenConverter.CONVERTER_KEY, "b", "g", Action.FILE_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "r", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ji9$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"ji9$a$a", "Lji9;", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ji9$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0398a extends ji9 {
            final /* synthetic */ qc6 a;
            final /* synthetic */ File b;

            C0398a(qc6 qc6Var, File file) {
                this.a = qc6Var;
                this.b = file;
            }

            @Override // defpackage.ji9
            public long contentLength() {
                return this.b.length();
            }

            @Override // defpackage.ji9
            public qc6 contentType() {
                return this.a;
            }

            @Override // defpackage.ji9
            public void writeTo(eh0 eh0Var) {
                z65.h(eh0Var, "sink");
                pqa i = c77.i(this.b);
                try {
                    eh0Var.a1(i);
                    aa1.a(i, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"ji9$a$b", "Lji9;", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ji9$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends ji9 {
            final /* synthetic */ qc6 a;
            final /* synthetic */ iu3 b;
            final /* synthetic */ nr7 c;

            b(qc6 qc6Var, iu3 iu3Var, nr7 nr7Var) {
                this.a = qc6Var;
                this.b = iu3Var;
                this.c = nr7Var;
            }

            @Override // defpackage.ji9
            public long contentLength() {
                Long d = this.b.l(this.c).d();
                if (d != null) {
                    return d.longValue();
                }
                return -1L;
            }

            @Override // defpackage.ji9
            public qc6 contentType() {
                return this.a;
            }

            @Override // defpackage.ji9
            public void writeTo(eh0 eh0Var) {
                z65.h(eh0Var, "sink");
                pqa q = this.b.q(this.c);
                try {
                    eh0Var.a1(q);
                    aa1.a(q, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"ji9$a$c", "Lji9;", "Lqc6;", "contentType", "", "contentLength", "Leh0;", "sink", "", "writeTo", "", "isOneShot", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ji9$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends ji9 {
            final /* synthetic */ ji9 a;

            c(ji9 ji9Var) {
                this.a = ji9Var;
            }

            @Override // defpackage.ji9
            public long contentLength() {
                return -1L;
            }

            @Override // defpackage.ji9
            public qc6 contentType() {
                return this.a.contentType();
            }

            @Override // defpackage.ji9
            public boolean isOneShot() {
                return this.a.isOneShot();
            }

            @Override // defpackage.ji9
            public void writeTo(eh0 eh0Var) throws IOException {
                z65.h(eh0Var, "sink");
                eh0 b = c77.b(new yi4(eh0Var));
                this.a.writeTo(b);
                b.close();
            }
        }

        /* compiled from: RequestBody.kt */
        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"ji9$a$d", "Lji9;", "Lqc6;", "contentType", "", "isOneShot", "Leh0;", "sink", "", "writeTo", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ji9$a$d */
        /* loaded from: classes3.dex */
        public static final class d extends ji9 {
            final /* synthetic */ qc6 a;
            final /* synthetic */ FileDescriptor b;

            d(qc6 qc6Var, FileDescriptor fileDescriptor) {
                this.a = qc6Var;
                this.b = fileDescriptor;
            }

            @Override // defpackage.ji9
            public qc6 contentType() {
                return this.a;
            }

            @Override // defpackage.ji9
            public boolean isOneShot() {
                return true;
            }

            @Override // defpackage.ji9
            public void writeTo(eh0 eh0Var) {
                z65.h(eh0Var, "sink");
                FileInputStream fileInputStream = new FileInputStream(this.b);
                try {
                    eh0Var.d().a1(c77.j(fileInputStream));
                    aa1.a(fileInputStream, null);
                } finally {
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ji9 p(a aVar, qc6 qc6Var, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.g(qc6Var, bArr, i, i2);
        }

        public static /* synthetic */ ji9 q(a aVar, byte[] bArr, qc6 qc6Var, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                qc6Var = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.o(bArr, qc6Var, i, i2);
        }

        public final ji9 a(lk0 lk0Var, qc6 qc6Var) {
            z65.h(lk0Var, "<this>");
            return vdc.d(lk0Var, qc6Var);
        }

        public final ji9 b(qc6 qc6Var, lk0 lk0Var) {
            z65.h(lk0Var, RemoteMessageConst.Notification.CONTENT);
            return a(lk0Var, qc6Var);
        }

        public final ji9 c(qc6 qc6Var, File file) {
            z65.h(file, Action.FILE_ATTRIBUTE);
            return i(file, qc6Var);
        }

        public final ji9 d(qc6 qc6Var, String str) {
            z65.h(str, RemoteMessageConst.Notification.CONTENT);
            return k(str, qc6Var);
        }

        public final ji9 e(qc6 qc6Var, byte[] bArr) {
            z65.h(bArr, RemoteMessageConst.Notification.CONTENT);
            return p(this, qc6Var, bArr, 0, 0, 12, null);
        }

        public final ji9 f(qc6 qc6Var, byte[] bArr, int i) {
            z65.h(bArr, RemoteMessageConst.Notification.CONTENT);
            return p(this, qc6Var, bArr, i, 0, 8, null);
        }

        public final ji9 g(qc6 qc6Var, byte[] bArr, int i, int i2) {
            z65.h(bArr, RemoteMessageConst.Notification.CONTENT);
            return o(bArr, qc6Var, i, i2);
        }

        public final ji9 h(nr7 nr7Var, iu3 iu3Var, qc6 qc6Var) {
            z65.h(nr7Var, "<this>");
            z65.h(iu3Var, "fileSystem");
            return new b(qc6Var, iu3Var, nr7Var);
        }

        public final ji9 i(File file, qc6 qc6Var) {
            z65.h(file, "<this>");
            return new C0398a(qc6Var, file);
        }

        public final ji9 j(FileDescriptor fileDescriptor, qc6 qc6Var) {
            z65.h(fileDescriptor, "<this>");
            return new d(qc6Var, fileDescriptor);
        }

        public final ji9 k(String str, qc6 qc6Var) {
            z65.h(str, "<this>");
            Pair<Charset, qc6> b2 = p65.b(qc6Var);
            byte[] bytes = str.getBytes(b2.a());
            z65.g(bytes, "getBytes(...)");
            return o(bytes, b2.b(), 0, bytes.length);
        }

        public final ji9 l(byte[] bArr) {
            z65.h(bArr, "<this>");
            return q(this, bArr, null, 0, 0, 7, null);
        }

        public final ji9 m(byte[] bArr, qc6 qc6Var) {
            z65.h(bArr, "<this>");
            return q(this, bArr, qc6Var, 0, 0, 6, null);
        }

        public final ji9 n(byte[] bArr, qc6 qc6Var, int i) {
            z65.h(bArr, "<this>");
            return q(this, bArr, qc6Var, i, 0, 4, null);
        }

        public final ji9 o(byte[] bArr, qc6 qc6Var, int i, int i2) {
            z65.h(bArr, "<this>");
            return vdc.e(bArr, qc6Var, i, i2);
        }

        public final ji9 r(ji9 ji9Var) {
            z65.h(ji9Var, "<this>");
            return new c(ji9Var);
        }
    }

    public static final ji9 create(lk0 lk0Var, qc6 qc6Var) {
        return Companion.a(lk0Var, qc6Var);
    }

    public static final ji9 gzip(ji9 ji9Var) {
        return Companion.r(ji9Var);
    }

    public long contentLength() throws IOException {
        return vdc.a(this);
    }

    public abstract qc6 contentType();

    public boolean isDuplex() {
        return vdc.b(this);
    }

    public boolean isOneShot() {
        return vdc.c(this);
    }

    public abstract void writeTo(eh0 eh0Var) throws IOException;

    public static final ji9 create(qc6 qc6Var, lk0 lk0Var) {
        return Companion.b(qc6Var, lk0Var);
    }

    public static final ji9 create(qc6 qc6Var, File file) {
        return Companion.c(qc6Var, file);
    }

    public static final ji9 create(qc6 qc6Var, String str) {
        return Companion.d(qc6Var, str);
    }

    public static final ji9 create(qc6 qc6Var, byte[] bArr) {
        return Companion.e(qc6Var, bArr);
    }

    public static final ji9 create(qc6 qc6Var, byte[] bArr, int i) {
        return Companion.f(qc6Var, bArr, i);
    }

    public static final ji9 create(qc6 qc6Var, byte[] bArr, int i, int i2) {
        return Companion.g(qc6Var, bArr, i, i2);
    }

    public static final ji9 create(nr7 nr7Var, iu3 iu3Var, qc6 qc6Var) {
        return Companion.h(nr7Var, iu3Var, qc6Var);
    }

    public static final ji9 create(File file, qc6 qc6Var) {
        return Companion.i(file, qc6Var);
    }

    public static final ji9 create(FileDescriptor fileDescriptor, qc6 qc6Var) {
        return Companion.j(fileDescriptor, qc6Var);
    }

    public static final ji9 create(String str, qc6 qc6Var) {
        return Companion.k(str, qc6Var);
    }

    public static final ji9 create(byte[] bArr) {
        return Companion.l(bArr);
    }

    public static final ji9 create(byte[] bArr, qc6 qc6Var) {
        return Companion.m(bArr, qc6Var);
    }

    public static final ji9 create(byte[] bArr, qc6 qc6Var, int i) {
        return Companion.n(bArr, qc6Var, i);
    }

    public static final ji9 create(byte[] bArr, qc6 qc6Var, int i, int i2) {
        return Companion.o(bArr, qc6Var, i, i2);
    }
}
