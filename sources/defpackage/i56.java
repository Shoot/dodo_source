package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: MainScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Ln56;", "tab", "Lyw9;", "a", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: i56  reason: default package */
/* loaded from: classes2.dex */
public final class i56 {

    /* compiled from: MainScreen.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"i56$a", "Lyw9;", "Lh6c;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "Ln56;", "Ln56;", DateTokenConverter.CONVERTER_KEY, "()Ln56;", "data", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: i56$a */
    /* loaded from: classes2.dex */
    public static final class a implements yw9, h6c {
        private final String a = "";
        private final n56 b;

        a(n56 n56Var) {
            this.b = n56Var;
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.h6c
        /* renamed from: d */
        public n56 getData() {
            return this.b;
        }
    }

    public static final yw9 a(n56 n56Var) {
        z65.h(n56Var, "tab");
        return new a(n56Var);
    }
}
