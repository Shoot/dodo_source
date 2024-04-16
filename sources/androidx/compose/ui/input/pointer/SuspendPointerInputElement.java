package androidx.compose.ui.input.pointer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\\\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0015\u0012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001bø\u0001\u0000¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u001a\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R6\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001b8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Lfn6;", "Ll3b;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", c.a, "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "key1", DateTokenConverter.CONVERTER_KEY, "getKey2", "key2", "", e.a, "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "keys", "Lkotlin/Function2;", "Lie8;", "Lcv1;", "f", "Lkotlin/jvm/functions/Function2;", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends fn6<l3b> {
    private final Object c;
    private final Object d;
    private final Object[] e;
    private final Function2<ie8, cv1<? super Unit>, Object> f;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, function2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!z65.c(this.c, suspendPointerInputElement.c) || !z65.c(this.d, suspendPointerInputElement.d)) {
            return false;
        }
        Object[] objArr = this.e;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.e;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.e != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.c;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Object obj2 = this.d;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object[] objArr = this.e;
        if (objArr != null) {
            i3 = Arrays.hashCode(objArr);
        }
        return i5 + i3;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public l3b o() {
        return new l3b(this.f);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(l3b l3bVar) {
        z65.h(l3bVar, "node");
        l3bVar.l1(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, Function2<? super ie8, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(function2, "pointerInputHandler");
        this.c = obj;
        this.d = obj2;
        this.e = objArr;
        this.f = function2;
    }
}
