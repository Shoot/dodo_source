package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.gn4;
import defpackage.qc6;
import im.threads.business.transport.MessageAttributes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MultipartBody.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003\u000e\u0007\u0016B'\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001e¨\u0006#"}, d2 = {"Lfq6;", "Lji9;", "Leh0;", "sink", "", "countBytes", "", "b", "Lqc6;", "contentType", "contentLength", "", "writeTo", "Llk0;", "a", "Llk0;", "boundaryByteString", "Lqc6;", MessageAttributes.TYPE, "()Lqc6;", "", "Lfq6$c;", com.huawei.hms.opendevice.c.a, "Ljava/util/List;", "parts", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, e.a, "J", "", "()Ljava/lang/String;", "boundary", "<init>", "(Llk0;Lqc6;Ljava/util/List;)V", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: fq6  reason: default package */
/* loaded from: classes3.dex */
public final class fq6 extends ji9 {
    public static final b f = new b(null);
    public static final qc6 g;
    public static final qc6 h;
    public static final qc6 i;
    public static final qc6 j;
    public static final qc6 k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private final lk0 a;
    private final qc6 b;
    private final List<c> c;
    private final qc6 d;
    private long e;

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0019"}, d2 = {"Lfq6$a;", "", "Lqc6;", MessageAttributes.TYPE, DateTokenConverter.CONVERTER_KEY, "Lgn4;", "headers", "Lji9;", "body", "a", "Lfq6$c;", "part", "b", "Lfq6;", com.huawei.hms.opendevice.c.a, "Llk0;", "Llk0;", "boundary", "Lqc6;", "", "Ljava/util/List;", "parts", "", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fq6$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final lk0 a;
        private qc6 b;
        private final List<c> c;

        public a() {
            this(null, 1, null);
        }

        public final a a(gn4 gn4Var, ji9 ji9Var) {
            z65.h(ji9Var, "body");
            b(c.c.a(gn4Var, ji9Var));
            return this;
        }

        public final a b(c cVar) {
            z65.h(cVar, "part");
            this.c.add(cVar);
            return this;
        }

        public final fq6 c() {
            if (!this.c.isEmpty()) {
                return new fq6(this.a, this.b, cec.y(this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(qc6 qc6Var) {
            z65.h(qc6Var, MessageAttributes.TYPE);
            if (z65.c(qc6Var.i(), "multipart")) {
                this.b = qc6Var;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + qc6Var).toString());
        }

        public a(String str) {
            z65.h(str, "boundary");
            this.a = lk0.d.d(str);
            this.b = fq6.g;
            this.c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ a(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "toString(...)"
                defpackage.z65.g(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fq6.a.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, d2 = {"Lfq6$b;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", Action.KEY_ATTRIBUTE, "", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lqc6;", "ALTERNATIVE", "Lqc6;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fq6$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(StringBuilder sb, String str) {
            z65.h(sb, "<this>");
            z65.h(str, Action.KEY_ATTRIBUTE);
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u001b\b\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000f"}, d2 = {"Lfq6$c;", "", "Lgn4;", "a", "Lgn4;", "b", "()Lgn4;", "headers", "Lji9;", "Lji9;", "()Lji9;", "body", "<init>", "(Lgn4;Lji9;)V", com.huawei.hms.opendevice.c.a, "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fq6$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public static final a c = new a(null);
        private final gn4 a;
        private final ji9 b;

        /* compiled from: MultipartBody.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\"\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lfq6$c$a;", "", "Lgn4;", "headers", "Lji9;", "body", "Lfq6$c;", "a", "", Action.NAME_ATTRIBUTE, "filename", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: fq6$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(gn4 gn4Var, ji9 ji9Var) {
                String str;
                String str2;
                z65.h(ji9Var, "body");
                if (gn4Var != null) {
                    str = gn4Var.d("Content-Type");
                } else {
                    str = null;
                }
                if (str == null) {
                    if (gn4Var != null) {
                        str2 = gn4Var.d("Content-Length");
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        return new c(gn4Var, ji9Var, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public final c b(String str, String str2, ji9 ji9Var) {
                z65.h(str, Action.NAME_ATTRIBUTE);
                z65.h(ji9Var, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = fq6.f;
                bVar.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    bVar.a(sb, str2);
                }
                String sb2 = sb.toString();
                z65.g(sb2, "toString(...)");
                return a(new gn4.a().e("Content-Disposition", sb2).f(), ji9Var);
            }
        }

        public /* synthetic */ c(gn4 gn4Var, ji9 ji9Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(gn4Var, ji9Var);
        }

        public final ji9 a() {
            return this.b;
        }

        public final gn4 b() {
            return this.a;
        }

        private c(gn4 gn4Var, ji9 ji9Var) {
            this.a = gn4Var;
            this.b = ji9Var;
        }
    }

    static {
        qc6.a aVar = qc6.e;
        g = aVar.a("multipart/mixed");
        h = aVar.a("multipart/alternative");
        i = aVar.a("multipart/digest");
        j = aVar.a("multipart/parallel");
        k = aVar.a("multipart/form-data");
        l = new byte[]{58, 32};
        m = new byte[]{13, 10};
        n = new byte[]{45, 45};
    }

    public fq6(lk0 lk0Var, qc6 qc6Var, List<c> list) {
        z65.h(lk0Var, "boundaryByteString");
        z65.h(qc6Var, MessageAttributes.TYPE);
        z65.h(list, "parts");
        this.a = lk0Var;
        this.b = qc6Var;
        this.c = list;
        qc6.a aVar = qc6.e;
        this.d = aVar.a(qc6Var + "; boundary=" + a());
        this.e = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long b(eh0 eh0Var, boolean z) throws IOException {
        yg0 yg0Var;
        if (z) {
            eh0Var = new yg0();
            yg0Var = eh0Var;
        } else {
            yg0Var = 0;
        }
        int size = this.c.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.c.get(i2);
            gn4 b2 = cVar.b();
            ji9 a2 = cVar.a();
            z65.e(eh0Var);
            eh0Var.v0(n);
            eh0Var.d0(this.a);
            eh0Var.v0(m);
            if (b2 != null) {
                int size2 = b2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    eh0Var.a0(b2.h(i3)).v0(l).a0(b2.u(i3)).v0(m);
                }
            }
            qc6 contentType = a2.contentType();
            if (contentType != null) {
                eh0Var.a0("Content-Type: ").a0(contentType.toString()).v0(m);
            }
            long contentLength = a2.contentLength();
            if (contentLength == -1 && z) {
                z65.e(yg0Var);
                yg0Var.b();
                return -1L;
            }
            byte[] bArr = m;
            eh0Var.v0(bArr);
            if (z) {
                j2 += contentLength;
            } else {
                a2.writeTo(eh0Var);
            }
            eh0Var.v0(bArr);
        }
        z65.e(eh0Var);
        byte[] bArr2 = n;
        eh0Var.v0(bArr2);
        eh0Var.d0(this.a);
        eh0Var.v0(bArr2);
        eh0Var.v0(m);
        if (z) {
            z65.e(yg0Var);
            long P = j2 + yg0Var.P();
            yg0Var.b();
            return P;
        }
        return j2;
    }

    public final String a() {
        return this.a.z0();
    }

    @Override // defpackage.ji9
    public long contentLength() throws IOException {
        long j2 = this.e;
        if (j2 == -1) {
            long b2 = b(null, true);
            this.e = b2;
            return b2;
        }
        return j2;
    }

    @Override // defpackage.ji9
    public qc6 contentType() {
        return this.d;
    }

    @Override // defpackage.ji9
    public void writeTo(eh0 eh0Var) throws IOException {
        z65.h(eh0Var, "sink");
        b(eh0Var, false);
    }
}
