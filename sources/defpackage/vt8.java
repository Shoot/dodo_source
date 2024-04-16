package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: QMediaStoreUriLoader.java */
/* renamed from: vt8  reason: default package */
/* loaded from: classes.dex */
public final class vt8<DataT> implements mm6<Uri, DataT> {
    private final Context a;
    private final mm6<File, DataT> b;
    private final mm6<Uri, DataT> c;
    private final Class<DataT> d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: vt8$a */
    /* loaded from: classes.dex */
    private static abstract class a<DataT> implements nm6<Uri, DataT> {
        private final Context a;
        private final Class<DataT> b;

        a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // defpackage.nm6
        @NonNull
        public final mm6<Uri, DataT> d(@NonNull qp6 qp6Var) {
            return new vt8(this.a, qp6Var.d(File.class, this.b), qp6Var.d(Uri.class, this.b), this.b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: vt8$b */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: vt8$c */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: vt8$d */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements uk2<DataT> {
        private static final String[] k = {"_data"};
        private final Context a;
        private final mm6<File, DataT> b;
        private final mm6<Uri, DataT> c;
        private final Uri d;
        private final int e;
        private final int f;
        private final ac7 g;
        private final Class<DataT> h;
        private volatile boolean i;
        private volatile uk2<DataT> j;

        d(Context context, mm6<File, DataT> mm6Var, mm6<Uri, DataT> mm6Var2, Uri uri, int i, int i2, ac7 ac7Var, Class<DataT> cls) {
            this.a = context.getApplicationContext();
            this.b = mm6Var;
            this.c = mm6Var2;
            this.d = uri;
            this.e = i;
            this.f = i2;
            this.g = ac7Var;
            this.h = cls;
        }

        private mm6.a<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            Uri uri;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.b.b(h(this.d), this.e, this.f, this.g);
            }
            if (oc6.a(this.d)) {
                return this.c.b(this.d, this.e, this.f, this.g);
            }
            if (g()) {
                uri = MediaStore.setRequireOriginal(this.d);
            } else {
                uri = this.d;
            }
            return this.c.b(uri, this.e, this.f, this.g);
        }

        private uk2<DataT> f() throws FileNotFoundException {
            mm6.a<DataT> c = c();
            if (c != null) {
                return c.c;
            }
            return null;
        }

        private boolean g() {
            int checkSelfPermission;
            checkSelfPermission = this.a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }

        @NonNull
        private File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.a.getContentResolver().query(uri, k, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<DataT> a() {
            return this.h;
        }

        @Override // defpackage.uk2
        public void b() {
            uk2<DataT> uk2Var = this.j;
            if (uk2Var != null) {
                uk2Var.b();
            }
        }

        @Override // defpackage.uk2
        public void cancel() {
            this.i = true;
            uk2<DataT> uk2Var = this.j;
            if (uk2Var != null) {
                uk2Var.cancel();
            }
        }

        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super DataT> aVar) {
            try {
                uk2<DataT> f = f();
                if (f == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                    return;
                }
                this.j = f;
                if (this.i) {
                    cancel();
                } else {
                    f.d(yj8Var, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return dl2.LOCAL;
        }
    }

    vt8(Context context, mm6<File, DataT> mm6Var, mm6<Uri, DataT> mm6Var2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = mm6Var;
        this.c = mm6Var2;
        this.d = cls;
    }

    @Override // defpackage.mm6
    /* renamed from: c */
    public mm6.a<DataT> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        return new mm6.a<>(new e57(uri), new d(this.a, this.b, this.c, uri, i, i2, ac7Var, this.d));
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public boolean a(@NonNull Uri uri) {
        if (Build.VERSION.SDK_INT >= 29 && oc6.c(uri)) {
            return true;
        }
        return false;
    }
}
