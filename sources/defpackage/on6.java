package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: MoneyInputFilter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lon6;", "Lkotlin/Function1;", "", "rawInput", "a", "", "C", "separator", "<init>", "(C)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: on6  reason: default package */
/* loaded from: classes4.dex */
public class on6 implements Function1<String, String> {
    private final char a;

    public on6(char c) {
        this.a = c;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public String invoke(String str) {
        String E;
        String E2;
        z65.h(str, "rawInput");
        E = l0b.E(str, CoreConstants.COMMA_CHAR, this.a, false, 4, null);
        E2 = l0b.E(E, CoreConstants.DOT, this.a, false, 4, null);
        return E2;
    }
}
