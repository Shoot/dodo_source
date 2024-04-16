package defpackage;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: PhoneHintHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0017"}, d2 = {"Lt28;", "Lz5;", "Landroid/app/Activity;", "activity", "Lt28$a;", "listener", "", "b", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", c.a, "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Lt28$a;", "phoneHintListener", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: t28  reason: default package */
/* loaded from: classes4.dex */
public final class t28 implements z5 {
    public static final t28 a = new t28();
    private static final Logger b = LoggerFactory.getLogger("PhoneHintHelper");
    private static a c;

    /* compiled from: PhoneHintHelper.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lt28$a;", "", "", "phone", "", c.a, "b", "", "resultCode", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t28$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);

        void b();

        void c(String str);
    }

    private t28() {
    }

    public final void b(Activity activity, a aVar) {
        z65.h(activity, "activity");
        z65.h(aVar, "listener");
        try {
            c = aVar;
            activity.startIntentSenderForResult(p22.a(activity).y(new HintRequest.a().b(true).a()).getIntentSender(), 4012, null, 0, 0, 0);
        } catch (Exception e) {
            b.warn("Failed to request phone hint. ", (Throwable) e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    @Override // defpackage.z5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 4012(0xfac, float:5.622E-42)
            if (r3 != r0) goto L34
            t28$a r3 = defpackage.t28.c
            if (r3 != 0) goto L9
            return
        L9:
            r0 = -1
            r1 = 0
            if (r4 != r0) goto L2f
            if (r5 == 0) goto L24
            java.lang.String r4 = "com.google.android.gms.credentials.Credential"
            android.os.Parcelable r4 = r5.getParcelableExtra(r4)
            boolean r5 = r4 instanceof com.google.android.gms.auth.api.credentials.Credential
            if (r5 == 0) goto L1c
            com.google.android.gms.auth.api.credentials.Credential r4 = (com.google.android.gms.auth.api.credentials.Credential) r4
            goto L1d
        L1c:
            r4 = r1
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r4 = r4.t()
            goto L25
        L24:
            r4 = r1
        L25:
            if (r4 == 0) goto L2b
            r3.c(r4)
            goto L32
        L2b:
            r3.b()
            goto L32
        L2f:
            r3.a(r4)
        L32:
            defpackage.t28.c = r1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t28.c(int, int, android.content.Intent):void");
    }
}
