package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: AssetsZoneRulesInitializer.java */
/* renamed from: ms  reason: default package */
/* loaded from: classes3.dex */
final class ms extends bdc {
    private final Context d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ms(Context context, String str) {
        this.d = context;
        this.e = str;
    }

    @Override // defpackage.bdc
    protected void b() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.d.getAssets().open(this.e);
                gpb gpbVar = new gpb(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                cdc.f(gpbVar);
            } catch (IOException e) {
                throw new IllegalStateException(this.e + " missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
