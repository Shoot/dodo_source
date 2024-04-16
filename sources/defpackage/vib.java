package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CardPaymentScenario.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lvib;", "Lpp0;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "authorizeUrl", "b", "publicEncryptionKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Llu6;", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vib  reason: default package */
/* loaded from: classes2.dex */
public abstract class vib extends pp0 {
    private final String a;
    private final String b;

    public /* synthetic */ vib(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    private vib(String str, String str2) {
        super(null);
        this.a = str;
        this.b = str2;
    }
}
