package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Currency.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\f"}, d2 = {"Lf32;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "customSymbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f32  reason: default package */
/* loaded from: classes4.dex */
public final class f32 implements Serializable {
    private final String a;
    private final String b;

    public f32(String str, String str2) {
        z65.h(str, "code");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String getCode() {
        return this.a;
    }
}
