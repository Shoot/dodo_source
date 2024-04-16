package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: MediaStoreFileLoader.java */
/* renamed from: lc6  reason: default package */
/* loaded from: classes.dex */
public final class lc6 implements mm6<Uri, File> {
    private final Context a;

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: lc6$a */
    /* loaded from: classes.dex */
    public static final class a implements nm6<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Uri, File> d(qp6 qp6Var) {
            return new lc6(this.a);
        }
    }

    public lc6(Context context) {
        this.a = context;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<File> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(uri), new b(this.a, uri));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        return oc6.c(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: lc6$b */
    /* loaded from: classes.dex */
    public static class b implements uk2<File> {
        private static final String[] c = {"_data"};
        private final Context a;
        private final Uri b;

        b(Context context, Uri uri) {
            this.a = context;
            this.b = uri;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<File> a() {
            return File.class;
        }

        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super File> aVar) {
            Cursor query = this.a.getContentResolver().query(this.b, c, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.b));
                return;
            }
            aVar.f(new File(str));
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return dl2.LOCAL;
        }

        @Override // defpackage.uk2
        public void b() {
        }

        @Override // defpackage.uk2
        public void cancel() {
        }
    }
}
