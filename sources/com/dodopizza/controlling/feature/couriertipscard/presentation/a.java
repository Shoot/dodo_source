package com.dodopizza.controlling.feature.couriertipscard.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SuggestedTipsVO.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "amount", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "predefinedUrl", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "setSelected", "(Z)V", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a {
    public static final C0114a d = new C0114a(null);
    private static final a e = new a(0, "", false);
    private final int a;
    private final String b;
    private boolean c;

    /* compiled from: SuggestedTipsVO.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a$a;", "", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "NO_TIPS", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "a", "()Lcom/dodopizza/controlling/feature/couriertipscard/presentation/a;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.controlling.feature.couriertipscard.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0114a {
        private C0114a() {
        }

        public /* synthetic */ C0114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.e;
        }
    }

    public a(int i, String str, boolean z) {
        z65.h(str, "predefinedUrl");
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && z65.c(this.b, aVar.b) && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + a91.a(this.c);
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        boolean z = this.c;
        return "SuggestedTipsVO(amount=" + i + ", predefinedUrl=" + str + ", isSelected=" + z + ")";
    }
}
