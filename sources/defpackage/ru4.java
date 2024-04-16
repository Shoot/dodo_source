package defpackage;

import androidx.annotation.NonNull;
import java.io.InputStream;
/* compiled from: ImageItem.java */
/* renamed from: ru4  reason: default package */
/* loaded from: classes3.dex */
public abstract class ru4 {

    /* compiled from: ImageItem.java */
    /* renamed from: ru4$b */
    /* loaded from: classes3.dex */
    public static class b extends ru4 {
        private final String a;
        private final InputStream b;

        @Override // defpackage.ru4
        @NonNull
        public c b() {
            throw new IllegalStateException();
        }

        @Override // defpackage.ru4
        public boolean c() {
            return true;
        }

        public String e() {
            return this.a;
        }

        @NonNull
        public InputStream f() {
            return this.b;
        }

        private b(String str, @NonNull InputStream inputStream) {
            super();
            this.a = str;
            this.b = inputStream;
        }

        @Override // defpackage.ru4
        @NonNull
        public b a() {
            return this;
        }
    }

    /* compiled from: ImageItem.java */
    /* renamed from: ru4$c */
    /* loaded from: classes3.dex */
    public static class c extends ru4 {
    }

    @NonNull
    public static ru4 d(String str, @NonNull InputStream inputStream) {
        return new b(str, inputStream);
    }

    @NonNull
    public abstract b a();

    @NonNull
    public abstract c b();

    public abstract boolean c();

    private ru4() {
    }
}
