package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
/* compiled from: SemanticsProperties.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\tR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lfba;", "", "Liba;", "", "b", "Liba;", "a", "()Liba;", "getTestTagsAsResourceId$annotations", "()V", "TestTagsAsResourceId", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fba  reason: default package */
/* loaded from: classes.dex */
public final class fba {
    public static final fba a = new fba();
    private static final iba<Boolean> b = new iba<>("TestTagsAsResourceId", a.a);

    private fba() {
    }

    public final iba<Boolean> a() {
        return b;
    }

    /* compiled from: SemanticsProperties.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fba$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function2<Boolean, Boolean, Boolean> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return a(bool, bool2.booleanValue());
        }

        public final Boolean a(Boolean bool, boolean z) {
            return bool;
        }
    }
}
