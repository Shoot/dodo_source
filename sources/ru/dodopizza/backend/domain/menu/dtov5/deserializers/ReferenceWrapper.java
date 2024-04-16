package ru.dodopizza.backend.domain.menu.dtov5.deserializers;

import kotlin.Metadata;
/* compiled from: ReferenceWrapper.kt */
@y95(ReferenceDeserializer.class)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "T", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lru/dodopizza/backend/domain/menu/dtov5/deserializers/ReferenceWrapper;", "equals", "", "other", "hashCode", "", "toString", "", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReferenceWrapper<T> {
    private final T value;

    public ReferenceWrapper(T t) {
        this.value = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReferenceWrapper copy$default(ReferenceWrapper referenceWrapper, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = referenceWrapper.value;
        }
        return referenceWrapper.copy(obj);
    }

    public final T component1() {
        return this.value;
    }

    public final ReferenceWrapper<T> copy(T t) {
        return new ReferenceWrapper<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ReferenceWrapper) && z65.c(this.value, ((ReferenceWrapper) obj).value)) {
            return true;
        }
        return false;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t = this.value;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        T t = this.value;
        return "ReferenceWrapper(value=" + t + ")";
    }
}
