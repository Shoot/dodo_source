package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EnumEntriesSerializationProxy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\bB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lnj3;", "", "E", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", c.a, "", "entries", "<init>", "([Ljava/lang/Enum;)V", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: nj3  reason: default package */
/* loaded from: classes3.dex */
public final class nj3<E extends Enum<E>> implements Serializable {
    private static final a b = new a(null);
    private final Class<E> a;

    /* compiled from: EnumEntriesSerializationProxy.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnj3$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nj3$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nj3(E[] eArr) {
        z65.h(eArr, "entries");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        z65.e(cls);
        this.a = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.a.getEnumConstants();
        z65.g(enumConstants, "getEnumConstants(...)");
        return lj3.a(enumConstants);
    }
}
