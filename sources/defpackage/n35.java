package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
/* compiled from: InputContentInfoCompat.java */
/* renamed from: n35  reason: default package */
/* loaded from: classes.dex */
public final class n35 {
    private final c a;

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: n35$c */
    /* loaded from: classes.dex */
    private interface c {
        Object a();

        @NonNull
        Uri b();

        void c();

        Uri d();

        @NonNull
        ClipDescription getDescription();
    }

    public n35(@NonNull Uri uri, @NonNull ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static n35 f(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new n35(new a(obj));
    }

    @NonNull
    public Uri a() {
        return this.a.b();
    }

    @NonNull
    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.d();
    }

    public void d() {
        this.a.c();
    }

    public Object e() {
        return this.a.a();
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: n35$a */
    /* loaded from: classes.dex */
    private static final class a implements c {
        @NonNull
        final InputContentInfo a;

        a(@NonNull Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // defpackage.n35.c
        @NonNull
        public Object a() {
            return this.a;
        }

        @Override // defpackage.n35.c
        @NonNull
        public Uri b() {
            return this.a.getContentUri();
        }

        @Override // defpackage.n35.c
        public void c() {
            this.a.requestPermission();
        }

        @Override // defpackage.n35.c
        public Uri d() {
            return this.a.getLinkUri();
        }

        @Override // defpackage.n35.c
        @NonNull
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        a(@NonNull Uri uri, @NonNull ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private n35(@NonNull c cVar) {
        this.a = cVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: n35$b */
    /* loaded from: classes.dex */
    private static final class b implements c {
        @NonNull
        private final Uri a;
        @NonNull
        private final ClipDescription b;
        private final Uri c;

        b(@NonNull Uri uri, @NonNull ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // defpackage.n35.c
        public Object a() {
            return null;
        }

        @Override // defpackage.n35.c
        @NonNull
        public Uri b() {
            return this.a;
        }

        @Override // defpackage.n35.c
        public Uri d() {
            return this.c;
        }

        @Override // defpackage.n35.c
        @NonNull
        public ClipDescription getDescription() {
            return this.b;
        }

        @Override // defpackage.n35.c
        public void c() {
        }
    }
}
