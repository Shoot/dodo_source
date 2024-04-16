package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InputModeManager.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R4\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\t\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lv35;", "Lu35;", "Lkotlin/Function1;", "Lt35;", "", "a", "Lkotlin/jvm/functions/Function1;", "onRequestInputModeChange", "<set-?>", "b", "Ler6;", "()I", "(I)V", "inputMode", "initialInputMode", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: v35  reason: default package */
/* loaded from: classes.dex */
public final class v35 implements u35 {
    private final Function1<t35, Boolean> a;
    private final er6 b;

    public /* synthetic */ v35(int i, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, function1);
    }

    @Override // defpackage.u35
    public int a() {
        return ((t35) this.b.getValue()).i();
    }

    public void b(int i) {
        this.b.setValue(t35.c(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v35(int i, Function1<? super t35, Boolean> function1) {
        er6 c;
        z65.h(function1, "onRequestInputModeChange");
        this.a = function1;
        c = tpa.c(t35.c(i), null, 2, null);
        this.b = c;
    }
}
