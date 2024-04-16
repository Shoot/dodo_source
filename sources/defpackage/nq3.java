package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Feedback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Lnq3;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "phone", "email", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nq3  reason: default package */
/* loaded from: classes4.dex */
public final class nq3 implements Serializable {
    private final String a;
    private final String b;

    public nq3(String str, String str2) {
        z65.h(str, "phone");
        z65.h(str2, "email");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
