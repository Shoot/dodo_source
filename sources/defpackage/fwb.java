package defpackage;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lfwb;", "Lkotlin/sequences/Sequence;", "Lewb;", "", "iterator", "", Action.NAME_ATTRIBUTE, "", "value", "", "b", "", "a", "Ljava/util/List;", "elements", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fwb  reason: default package */
/* loaded from: classes.dex */
public final class fwb implements Sequence<ewb> {
    private final List<ewb> a = new ArrayList();

    public final void b(String str, Object obj) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        this.a.add(new ewb(str, obj));
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<ewb> iterator() {
        return this.a.iterator();
    }
}
