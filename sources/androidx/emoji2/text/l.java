package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class l {
    @NonNull
    private final ri6 a;
    @NonNull
    private final char[] b;
    @NonNull
    private final a c = new a(1024);
    @NonNull
    private final Typeface d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {
        private final SparseArray<a> a;
        private g b;

        private a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a a(int i) {
            SparseArray<a> sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final g b() {
            return this.b;
        }

        void c(@NonNull g gVar, int i, int i2) {
            a a = a(gVar.b(i));
            if (a == null) {
                a = new a();
                this.a.put(gVar.b(i), a);
            }
            if (i2 > i) {
                a.c(gVar, i + 1, i2);
            } else {
                a.b = gVar;
            }
        }

        a(int i) {
            this.a = new SparseArray<>(i);
        }
    }

    private l(@NonNull Typeface typeface, @NonNull ri6 ri6Var) {
        this.d = typeface;
        this.a = ri6Var;
        this.b = new char[ri6Var.k() * 2];
        a(ri6Var);
    }

    private void a(ri6 ri6Var) {
        int k = ri6Var.k();
        for (int i = 0; i < k; i++) {
            g gVar = new g(this, i);
            Character.toChars(gVar.f(), this.b, i * 2);
            h(gVar);
        }
    }

    @NonNull
    public static l b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            ujb.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            ujb.b();
        }
    }

    @NonNull
    public char[] c() {
        return this.b;
    }

    @NonNull
    public ri6 d() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.a.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public a f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Typeface g() {
        return this.d;
    }

    void h(@NonNull g gVar) {
        boolean z;
        kh8.g(gVar, "emoji metadata cannot be null");
        if (gVar.c() > 0) {
            z = true;
        } else {
            z = false;
        }
        kh8.a(z, "invalid metadata codepoint length");
        this.c.c(gVar, 0, gVar.c() - 1);
    }
}
