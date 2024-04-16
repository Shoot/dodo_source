package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MindboxImageLoaderDefault.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lzj6;", "Lyj6;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lod9;", "message", "Lyh6;", "state", "Landroid/graphics/Bitmap;", "a", "<init>", "()V", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zj6  reason: default package */
/* loaded from: classes.dex */
public final class zj6 implements yj6 {
    public static final a b = new a(null);

    /* compiled from: MindboxImageLoaderDefault.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lzj6$a;", "", "", "IMAGE_CONNECTION_TIMEOUT", "I", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zj6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r4 != false) goto L14;
     */
    @Override // defpackage.yj6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap a(android.content.Context r2, defpackage.od9 r3, defpackage.yh6 r4) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            defpackage.z65.h(r2, r0)
            java.lang.String r2 = "message"
            defpackage.z65.h(r3, r2)
            java.lang.String r2 = "state"
            defpackage.z65.h(r4, r2)
            java.lang.String r2 = r3.b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Image loading started, imageUrl="
            r3.append(r4)
            r3.append(r2)
            if (r2 == 0) goto L28
            boolean r4 = defpackage.c0b.y(r2)
            if (r4 == 0) goto L2d
        L28:
            java.lang.String r4 = " (Image upload is not required)"
            r3.append(r4)
        L2d:
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            defpackage.z65.g(r3, r4)
            fk6 r4 = defpackage.fk6.a
            r4.d(r1, r3)
            if (r2 == 0) goto L78
            boolean r3 = defpackage.c0b.y(r2)
            if (r3 == 0) goto L44
            goto L78
        L44:
            java.net.URL r3 = new java.net.URL
            r3.<init>(r2)
            java.net.URLConnection r2 = r3.openConnection()
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)
            java.net.URLConnection r2 = (java.net.URLConnection) r2
            r3 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r3)
            r2.setConnectTimeout(r3)
            java.io.InputStream r2 = r2.getInputStream()
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Image successfully decoded, bitmap="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4.d(r1, r3)
            return r2
        L78:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj6.a(android.content.Context, od9, yh6):android.graphics.Bitmap");
    }
}
