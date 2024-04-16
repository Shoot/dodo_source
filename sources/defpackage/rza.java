package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.mm6;
import java.io.File;
import java.io.InputStream;
/* compiled from: StringLoader.java */
/* renamed from: rza  reason: default package */
/* loaded from: classes.dex */
public class rza<Data> implements mm6<String, Data> {
    private final mm6<Uri, Data> a;

    /* compiled from: StringLoader.java */
    /* renamed from: rza$a */
    /* loaded from: classes.dex */
    public static final class a implements nm6<String, AssetFileDescriptor> {
        @Override // defpackage.nm6
        public mm6<String, AssetFileDescriptor> d(@NonNull qp6 qp6Var) {
            return new rza(qp6Var.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: rza$b */
    /* loaded from: classes.dex */
    public static class b implements nm6<String, ParcelFileDescriptor> {
        @Override // defpackage.nm6
        @NonNull
        public mm6<String, ParcelFileDescriptor> d(@NonNull qp6 qp6Var) {
            return new rza(qp6Var.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: rza$c */
    /* loaded from: classes.dex */
    public static class c implements nm6<String, InputStream> {
        @Override // defpackage.nm6
        @NonNull
        public mm6<String, InputStream> d(@NonNull qp6 qp6Var) {
            return new rza(qp6Var.d(Uri.class, InputStream.class));
        }
    }

    public rza(mm6<Uri, Data> mm6Var) {
        this.a = mm6Var;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return f(str);
        }
        return parse;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<Data> b(@NonNull String str, int i, int i2, @NonNull ac7 ac7Var) {
        Uri e = e(str);
        if (e != null && this.a.a(e)) {
            return this.a.b(e, i, i2, ac7Var);
        }
        return null;
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull String str) {
        return true;
    }
}
