package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import com.dodopizza.kustoworker.KustoStorage;
import java.util.Objects;
/* compiled from: ContentInfoCompat.java */
/* renamed from: nt1  reason: default package */
/* loaded from: classes.dex */
public final class nt1 {
    @NonNull
    private final f a;

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$a */
    /* loaded from: classes.dex */
    public static final class a {
        @NonNull
        private final c a;

        public a(@NonNull ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.a = new b(clipData, i);
            } else {
                this.a = new d(clipData, i);
            }
        }

        @NonNull
        public nt1 a() {
            return this.a.a();
        }

        @NonNull
        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        @NonNull
        public a c(int i) {
            this.a.c(i);
            return this;
        }

        @NonNull
        public a d(Uri uri) {
            this.a.b(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$b */
    /* loaded from: classes.dex */
    private static final class b implements c {
        @NonNull
        private final ContentInfo.Builder a;

        b(@NonNull ClipData clipData, int i) {
            this.a = qt1.a(clipData, i);
        }

        @Override // defpackage.nt1.c
        @NonNull
        public nt1 a() {
            ContentInfo build;
            build = this.a.build();
            return new nt1(new e(build));
        }

        @Override // defpackage.nt1.c
        public void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // defpackage.nt1.c
        public void c(int i) {
            this.a.setFlags(i);
        }

        @Override // defpackage.nt1.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$c */
    /* loaded from: classes.dex */
    private interface c {
        @NonNull
        nt1 a();

        void b(Uri uri);

        void c(int i);

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$d */
    /* loaded from: classes.dex */
    private static final class d implements c {
        @NonNull
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        d(@NonNull ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // defpackage.nt1.c
        @NonNull
        public nt1 a() {
            return new nt1(new g(this));
        }

        @Override // defpackage.nt1.c
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // defpackage.nt1.c
        public void c(int i) {
            this.c = i;
        }

        @Override // defpackage.nt1.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$e */
    /* loaded from: classes.dex */
    public static final class e implements f {
        @NonNull
        private final ContentInfo a;

        e(@NonNull ContentInfo contentInfo) {
            this.a = mt1.a(kh8.f(contentInfo));
        }

        @Override // defpackage.nt1.f
        public int b() {
            int source;
            source = this.a.getSource();
            return source;
        }

        @Override // defpackage.nt1.f
        @NonNull
        public ContentInfo c() {
            return this.a;
        }

        @Override // defpackage.nt1.f
        @NonNull
        public ClipData d() {
            ClipData clip;
            clip = this.a.getClip();
            return clip;
        }

        @Override // defpackage.nt1.f
        public int e() {
            int flags;
            flags = this.a.getFlags();
            return flags;
        }

        @NonNull
        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$f */
    /* loaded from: classes.dex */
    public interface f {
        int b();

        ContentInfo c();

        @NonNull
        ClipData d();

        int e();
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: nt1$g */
    /* loaded from: classes.dex */
    private static final class g implements f {
        @NonNull
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        g(d dVar) {
            this.a = (ClipData) kh8.f(dVar.a);
            this.b = kh8.b(dVar.b, 0, 5, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.c = kh8.e(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // defpackage.nt1.f
        public int b() {
            return this.b;
        }

        @Override // defpackage.nt1.f
        public ContentInfo c() {
            return null;
        }

        @Override // defpackage.nt1.f
        @NonNull
        public ClipData d() {
            return this.a;
        }

        @Override // defpackage.nt1.f
        public int e() {
            return this.c;
        }

        @NonNull
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(nt1.e(this.b));
            sb.append(", flags=");
            sb.append(nt1.a(this.c));
            String str2 = "";
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            if (this.e != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }
    }

    nt1(@NonNull f fVar) {
        this.a = fVar;
    }

    @NonNull
    static String a(int i) {
        if ((i & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i);
    }

    @NonNull
    static String e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return String.valueOf(i);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    @NonNull
    public static nt1 g(@NonNull ContentInfo contentInfo) {
        return new nt1(new e(contentInfo));
    }

    @NonNull
    public ClipData b() {
        return this.a.d();
    }

    public int c() {
        return this.a.e();
    }

    public int d() {
        return this.a.b();
    }

    @NonNull
    public ContentInfo f() {
        ContentInfo c2 = this.a.c();
        Objects.requireNonNull(c2);
        return mt1.a(c2);
    }

    @NonNull
    public String toString() {
        return this.a.toString();
    }
}
