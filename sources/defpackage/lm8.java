package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProductTag.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006 "}, d2 = {"Llm8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "getName", Action.NAME_ATTRIBUTE, "Lnm8;", c.a, "Lnm8;", "()Lnm8;", "tagBackground", DateTokenConverter.CONVERTER_KEY, "I", "()I", "index", e.a, "Z", "()Z", "isEmoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lnm8;IZ)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lm8  reason: default package */
/* loaded from: classes2.dex */
public final class lm8 implements Serializable {
    @uca(Action.KEY_ATTRIBUTE)
    private final String a;
    @uca(Action.NAME_ATTRIBUTE)
    private final String b;
    @uca(RemoteMessageConst.Notification.COLOR)
    private final nm8 c;
    @uca("index")
    private final int d;
    @uca("isEmoji")
    private final boolean e;

    public lm8() {
        this(null, null, null, 0, false, 31, null);
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final nm8 c() {
        return this.c;
    }

    public final boolean d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm8)) {
            return false;
        }
        lm8 lm8Var = (lm8) obj;
        if (z65.c(this.a, lm8Var.a) && z65.c(this.b, lm8Var.b) && z65.c(this.c, lm8Var.c) && this.d == lm8Var.d && this.e == lm8Var.e) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.b;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + a91.a(this.e);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        nm8 nm8Var = this.c;
        int i = this.d;
        boolean z = this.e;
        return "ProductTag(key=" + str + ", name=" + str2 + ", tagBackground=" + nm8Var + ", index=" + i + ", isEmoji=" + z + ")";
    }

    public lm8(String str, String str2, nm8 nm8Var, int i, boolean z) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(nm8Var, "tagBackground");
        this.a = str;
        this.b = str2;
        this.c = nm8Var;
        this.d = i;
        this.e = z;
    }

    public /* synthetic */ lm8(String str, String str2, nm8 nm8Var, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? new nm8("#F1F3F6", "#393939") : nm8Var, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }
}
