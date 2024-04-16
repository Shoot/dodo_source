package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SizeDetails.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lena;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "sizeGroupName", "b", "doughTypeName", "Lkm8;", "Lkm8;", "()Lkm8;", "productSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkm8;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ena  reason: default package */
/* loaded from: classes2.dex */
public final class ena implements Serializable {
    private final String a;
    private final String b;
    private final km8 c;

    public ena(String str, String str2, km8 km8Var) {
        z65.h(km8Var, "productSize");
        this.a = str;
        this.b = str2;
        this.c = km8Var;
    }

    public final String a() {
        return this.b;
    }

    public final km8 b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }
}
