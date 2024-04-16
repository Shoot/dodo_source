package defpackage;

import com.huawei.hms.opendevice.c;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: CustomerAbMixerImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016R#\u0010\u0010\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lq42;", "Lo42;", "Lipb;", "", "that", c.a, "(BI)I", "", "identifier", "salt", "a", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "Lrn5;", "b", "()Ljava/security/MessageDigest;", "sha256", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: q42  reason: default package */
/* loaded from: classes.dex */
public final class q42 implements o42 {
    private final rn5 a;

    /* compiled from: CustomerAbMixerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "a", "()Ljava/security/MessageDigest;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: q42$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<MessageDigest> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final MessageDigest invoke() {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return messageDigest;
        }
    }

    public q42() {
        rn5 b;
        b = yn5.b(a.a);
        this.a = b;
    }

    private final MessageDigest b() {
        return (MessageDigest) this.a.getValue();
    }

    private final int c(byte b, int i) {
        return (b & 255) << i;
    }

    @Override // defpackage.o42
    public int a(String str, String str2) {
        z65.h(str, "identifier");
        z65.h(str2, "salt");
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        z65.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append(upperCase);
        String upperCase2 = str2.toUpperCase(locale);
        z65.g(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        sb.append(upperCase2);
        byte[] bytes = sb.toString().getBytes(rw0.b);
        z65.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = b().digest(bytes);
        z65.g(digest, "sha256.digest(bytes)");
        byte[] copyOf = Arrays.copyOf(digest, digest.length);
        z65.g(copyOf, "copyOf(this, size)");
        byte[] d = jpb.d(copyOf);
        return p42.a(npb.a((jpb.g(d, 31) & 255) | c(jpb.g(d, 28), 24) | c(jpb.g(d, 29), 16) | c(jpb.g(d, 30), 8)), 100);
    }
}
