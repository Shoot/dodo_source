package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import defpackage.mm6;
import defpackage.uk2;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DirectResourceLoader.java */
/* renamed from: r23  reason: default package */
/* loaded from: classes.dex */
public final class r23<DataT> implements mm6<Integer, DataT> {
    private final Context a;
    private final e<DataT> b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DirectResourceLoader.java */
    /* renamed from: r23$a */
    /* loaded from: classes.dex */
    public static final class a implements nm6<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {
        private final Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // defpackage.r23.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Integer, AssetFileDescriptor> d(@NonNull qp6 qp6Var) {
            return new r23(this.a, this);
        }

        @Override // defpackage.r23.e
        /* renamed from: e */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // defpackage.r23.e
        /* renamed from: f */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DirectResourceLoader.java */
    /* renamed from: r23$c */
    /* loaded from: classes.dex */
    public static final class c implements nm6<Integer, InputStream>, e<InputStream> {
        private final Context a;

        c(Context context) {
            this.a = context;
        }

        @Override // defpackage.r23.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Integer, InputStream> d(@NonNull qp6 qp6Var) {
            return new r23(this.a, this);
        }

        @Override // defpackage.r23.e
        /* renamed from: e */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // defpackage.r23.e
        /* renamed from: f */
        public InputStream c(Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DirectResourceLoader.java */
    /* renamed from: r23$e */
    /* loaded from: classes.dex */
    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(Resources.Theme theme, Resources resources, int i);
    }

    r23(Context context, e<DataT> eVar) {
        this.a = context.getApplicationContext();
        this.b = eVar;
    }

    public static nm6<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static nm6<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static nm6<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // defpackage.mm6
    /* renamed from: d */
    public mm6.a<DataT> b(@NonNull Integer num, int i, int i2, @NonNull ac7 ac7Var) {
        Resources resources;
        Resources.Theme theme = (Resources.Theme) ac7Var.c(tj9.b);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.a.getResources();
        }
        return new mm6.a<>(new e57(num), new d(theme, resources, this.b, num.intValue()));
    }

    @Override // defpackage.mm6
    /* renamed from: f */
    public boolean a(@NonNull Integer num) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DirectResourceLoader.java */
    /* renamed from: r23$d */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements uk2<DataT> {
        private final Resources.Theme a;
        private final Resources b;
        private final e<DataT> c;
        private final int d;
        private DataT e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i) {
            this.a = theme;
            this.b = resources;
            this.c = eVar;
            this.d = i;
        }

        @Override // defpackage.uk2
        @NonNull
        public Class<DataT> a() {
            return this.c.a();
        }

        @Override // defpackage.uk2
        public void b() {
            DataT datat = this.e;
            if (datat != null) {
                try {
                    this.c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // defpackage.uk2
        public void d(@NonNull yj8 yj8Var, @NonNull uk2.a<? super DataT> aVar) {
            try {
                DataT c = this.c.c(this.a, this.b, this.d);
                this.e = c;
                aVar.f(c);
            } catch (Resources.NotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.uk2
        @NonNull
        public dl2 e() {
            return dl2.LOCAL;
        }

        @Override // defpackage.uk2
        public void cancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DirectResourceLoader.java */
    /* renamed from: r23$b */
    /* loaded from: classes.dex */
    public static final class b implements nm6<Integer, Drawable>, e<Drawable> {
        private final Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // defpackage.r23.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // defpackage.nm6
        @NonNull
        public mm6<Integer, Drawable> d(@NonNull qp6 qp6Var) {
            return new r23(this.a, this);
        }

        @Override // defpackage.r23.e
        /* renamed from: f */
        public Drawable c(Resources.Theme theme, Resources resources, int i) {
            return j83.a(this.a, i, theme);
        }

        @Override // defpackage.r23.e
        /* renamed from: e */
        public void b(Drawable drawable) throws IOException {
        }
    }
}
