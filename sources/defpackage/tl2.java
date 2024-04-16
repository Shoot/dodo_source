package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
/* compiled from: DataUriDecoder.java */
/* renamed from: tl2  reason: default package */
/* loaded from: classes3.dex */
public abstract class tl2 {

    /* compiled from: DataUriDecoder.java */
    /* renamed from: tl2$a */
    /* loaded from: classes3.dex */
    static class a extends tl2 {
        a() {
        }

        @Override // defpackage.tl2
        public byte[] b(@NonNull sl2 sl2Var) throws Throwable {
            String c = sl2Var.c();
            if (!TextUtils.isEmpty(c)) {
                if (sl2Var.a()) {
                    return Base64.decode(c.getBytes("UTF-8"), 0);
                }
                return c.getBytes("UTF-8");
            }
            return null;
        }
    }

    @NonNull
    public static tl2 a() {
        return new a();
    }

    public abstract byte[] b(@NonNull sl2 sl2Var) throws Throwable;
}
