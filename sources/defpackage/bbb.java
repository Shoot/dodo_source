package defpackage;

import defpackage.cbb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: TextForegroundStyle.kt */
/* renamed from: bbb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bbb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: bbb$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Float> {
        final /* synthetic */ cbb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(cbb cbbVar) {
            super(0);
            this.a = cbbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(this.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcbb;", "a", "()Lcbb;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: bbb$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<cbb> {
        final /* synthetic */ cbb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cbb cbbVar) {
            super(0);
            this.a = cbbVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final cbb invoke() {
            return this.a;
        }
    }

    public static cbb a(cbb cbbVar, cbb cbbVar2) {
        float c;
        z65.h(cbbVar2, "other");
        boolean z = cbbVar2 instanceof og0;
        if (z && (cbbVar instanceof og0)) {
            mga f = ((og0) cbbVar2).f();
            c = sab.c(cbbVar2.a(), new a(cbbVar));
            return new og0(f, c);
        } else if (z && !(cbbVar instanceof og0)) {
            return cbbVar2;
        } else {
            if (z || !(cbbVar instanceof og0)) {
                return cbbVar2.c(new b(cbbVar));
            }
            return cbbVar;
        }
    }

    public static cbb b(cbb cbbVar, Function0 function0) {
        z65.h(function0, "other");
        if (z65.c(cbbVar, cbb.b.b)) {
            return (cbb) function0.invoke();
        }
        return cbbVar;
    }
}
